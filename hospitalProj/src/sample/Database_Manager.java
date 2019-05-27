package sample;

import java.sql.*;

public class Database_Manager {

    public Connection connection;

    public void Connection() throws SQLException {

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_data" , "root","1234");

    }

    public boolean Found (String fname , String lname)  {

        try {
            Connection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT First_name,Last_name FROM hospital_data.patient_table where First_name like '" + fname + "' and Last_name like '" + lname + "'");
            if (resultSet.first()) {
                return true;

            } else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public void Insert (String fname , String lname , String gender , String nationalcode , String description , String floor , String room , String bednumber , String debt , String type) throws SQLException {
            Connection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into hospital_data.patient_table(First_name,Last_name,Gender,Nationalcode,Description,Floor,Room,Bednumber,Debt,Type) value ('" + fname + "' , '" + lname + "','" + gender + "' , '" + nationalcode + "','" + description + "' , '" + floor + "','" + room + "' , '" + bednumber + "','" + debt + "','" + type + "')");
    }


    public boolean Delete(String fname , String lname){
        boolean result=false;
        String x;
        try {
            Connection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Debt FROM hospital_data.patient_table where First_name like '"+fname+"' and  Last_name like '"+lname+"' ");
            if (resultSet.first()) {
                x = resultSet.getNString(1);
                if (resultSet.first() && x.equals("0")) {
                    statement.executeUpdate("DELETE from hospital_data.patient_table where First_name like '" + fname + "' and  Last_name like '" + lname + "' ");
                    result = true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}


