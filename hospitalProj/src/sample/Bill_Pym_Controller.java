package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Bill_Pym_Controller {
    public TextField Name_txt;
    public TextField Family_txt;
    public Button Pay_Button;
    public Button Home_Page_Button;
    public Label lbl;

    Database_Manager manager = new Database_Manager();
    public void setPay_Button() {

        boolean result = Controller.Checker.Pay(Name_txt.getText(),Family_txt.getText());
        if (result)
            lbl.setText(Name_txt.getText() + " " + Family_txt.getText() + " was successfully payed");
        else
            lbl.setText("invalid name");
    }

    public void setHome_Page_Button(){
        Controller.BuildPage("home.fxml","Hospital Pacs");
    }
}