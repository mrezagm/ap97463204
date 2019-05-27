package sample;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Checking {

    private int patientnumber = 0;

    Database_Manager manager = new Database_Manager();
    public static Patient_Rcp_Controller rcp = new Patient_Rcp_Controller();
    public static Patient[] hpatient = new Patient[120];

    public void setPatient(String fname, String lname, String gender, String nationalcode, String description, String floor, String room, String type) throws Exception {

        hpatient[patientnumber] = new Patient(fname, lname, gender, nationalcode, description, floor, room, type);
        patientnumber++;
    }

    public boolean Pay(String fname, String lname) {
        boolean result = false;
        try {
            manager.Connection();
            Statement statement = manager.connection.createStatement();
            if (manager.Found(fname, lname)) {
                statement.executeUpdate("UPDATE hospital_data.patient_table set Debt = '" + 0 + "' where First_name like '" + fname + "' and Last_name like '" + lname + "'");
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String Reporter() {
        String content = "";
        try {
            manager.Connection();
            Statement statement = manager.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from hospital_data.patient_table");
            while (resultSet.next()) {
                content = content + "patient name : " + resultSet.getString(2) + " " + resultSet.getString(3) + "\n" + "patient description : " + resultSet.getString(6)
                        + "\n" + "floor : " + resultSet.getString(7) + "   room : " + resultSet.getString(8) + "   type : " + resultSet.getString(11) + "   bed number : " + resultSet.getString(9) + "   debt : " + resultSet.getString(10) + "\n" + "\n";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return content;
    }

    public String insertablity(String floor, String room, String type, String bednumber) {
        String insertable = "false";
        String floor1;
        String room1;
        String bed1;
        String type1;
        int fullbed_inroom = 0;
        try {
            manager.Connection();
            Statement statement = manager.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from hospital_data.patient_table");
            while (resultSet.next()) {
                floor1 = resultSet.getString(7);
                room1 = resultSet.getString(8);
                bed1 = resultSet.getString(9);
                type1 = resultSet.getString(11);
                if (floor.equals(floor1) && room.equals(room1) && bednumber.equals(bed1)&&type.equals(type1)) {
                    insertable = "invalid bed";
                    return insertable;
                }
                if (floor.equals(floor1)&&room.equals(room1)&& !type.equals(type1)) {
                    insertable="this room has another type";
                    rcp.type=type1;
                    return insertable;
                }
                if (type.equals("1") && room.equals(room1) && floor.equals(floor1)) {
                    fullbed_inroom++;
                    if (fullbed_inroom == 4) {
                        insertable = "room is full!!";
                        return insertable;
                    }
                }
                if (type.equals("2") && room.equals(room1) && floor.equals(floor1)) {
                    fullbed_inroom++;
                    if (fullbed_inroom == 1) {
                        insertable = "room is full!!";
                        return insertable;
                    }
                }
                if (type.equals("3") && room.equals(room1) && floor.equals(floor1)) {
                    fullbed_inroom++;
                    if (fullbed_inroom == 2) {
                        insertable = "room is full!!";
                        return insertable;
                    }
                }
                insertable="true";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insertable;
    }
}