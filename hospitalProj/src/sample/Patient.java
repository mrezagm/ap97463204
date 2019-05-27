package sample;

import java.io.Serializable;
import java.security.PrivateKey;

public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationalcode(String nationalcode) {
        this.nationalcode = nationalcode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String fname;
    private String lname;
    private String gender;
    private String nationalcode;
    private String description;
    private String floor;
    private String room;
    private String type;
    private boolean bill=false;

    public void setBill(boolean bill) {
        this.bill = bill;
    }

    public boolean getbill() {
        return bill;
    }

    public String getGender() {
        return gender;
    }

    public String getNationalcode() {
        return nationalcode;
    }

    public String getDescription() {
        return description;
    }

    public String getFloor() {
        return floor;
    }

    public String getRoom() {
        return room;
    }

    public String getType() {
        return type;
    }


    Patient(String fname, String lname, String gender, String nationalcode, String description, String floor, String room, String type) {
        this.lname = lname;
        this.fname = fname;
        this.gender = gender;
        this.nationalcode = nationalcode;
        this.description = description;
        this.floor = floor;
        this.room = room;
        this.type = type;
    }

    @Override
    public String toString() {
        return fname + "," + lname + "," + gender + "," + nationalcode + "," + description + "," + floor + "," + room + "," + type +"\n";
    }
}

