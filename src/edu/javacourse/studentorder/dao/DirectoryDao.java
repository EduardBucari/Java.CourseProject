package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.Street;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DirectoryDao {

    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/js_student",
                "postgres", "7777777");
        return con;
    }

    public List<Street> findStreets(String pattern) throws Exception {
      //  Class.forName("org.postgresql.Driver");
     List<Street> result = new LinkedList<>();
        Connection con = getConnection();

        Statement stmt = con.createStatement();
        String sql = "SELECT street_code, street_name From jc_street WHERE UPPER(street_name) LIKE UPPER('%" + pattern +"%')";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
           Street str = new Street(rs.getLong("street_code"), rs.getString("street_name"));
           result.add(str);
        }
        return result;
    }
}
