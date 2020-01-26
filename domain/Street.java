package edu.javacourse.studentorder.domain;

public class Street {
    private long streetCode;
    private String streetName;

    //constructor without parameters (select none)
    public Street() {
    }

    //constructor
    public Street(long streetCode, String streetName) {
        this.streetCode = streetCode;
        this.streetName = streetName;
    }

    //  getters & setters
    public long getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(long streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
