package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Controller {
    public Button Patient_Clearance_Button;
    public Button Report_Button;
    public Button Patient_Reception_Button;
    public Button Bill_Payment_Button;
    public Button Read_Data_Button;

    public  static Checking Checker = new Checking();

    public  static void BuildPage(String fxmname , String titlename){
        try {
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(Controller.class.getResource(fxmname));
            primaryStage.setTitle(titlename);
            primaryStage.setScene(new Scene(root, 700, 700));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPatient_Clearance_Button() {
        BuildPage("Patient Clearance.fxml","Patient Clearance");
    }

    public void setBill_Payment_Button(){
        BuildPage("Bill Payment.fxml","Bill Payment");
    }

    public void setReport_Button(){
        BuildPage("Report.fxml","Report Page");
    }

    public void setPatient_Reception_Button(){
        BuildPage("Patient Reception.fxml","Patient Reception");
    }


    public void setRead_Data_Button(ActionEvent actionEvent) {
    }
}
