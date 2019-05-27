package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Patient_Clr_Controller {

    public TextField Name_txt;
    public TextField Family_txt;
    public Button Submit_Button;
    public Button Home_Page_Button;

    public Label lbl;

    Database_Manager manager = new Database_Manager();

    public void setSubmit_Button() {
        boolean result = manager.Delete(Name_txt.getText(), Family_txt.getText());

        if (result) {
            lbl.setText(Name_txt.getText() + " " + Family_txt.getText() + " was successfully deleted");
        }else if (!manager.Found(Name_txt.getText(), Family_txt.getText())) {
            lbl.setText("invalid name");
        }else
            lbl.setText("you shoud pay before");
    }

    public void setHome_Page_Button(){
        Controller.BuildPage("home.fxml","Hospital Pacs");
    }
}
