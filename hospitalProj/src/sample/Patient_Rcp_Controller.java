package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Patient_Rcp_Controller {
    public TextField Name_txt;
    public TextField Family_txt;
    public TextField Gender_txt;
    public TextField National_Code_txt;
    public TextArea Description_txt;
    public TextField Floor_txt;
    public TextField Room_txt;
    public TextField Type_txt;
    public Button Submit_Button;
    public Button Home_Page_Button;
    public TextField Bed_txt;
    public Label lbl;
    public String type;

    Database_Manager manager = new Database_Manager();

    public void setSubmit_Button() throws Exception {
        String insertable;
        if (!Floor_txt.getText().equals("") && !Room_txt.getText().equals("") && !Bed_txt.getText().equals("") && !Type_txt.getText().equals("")
        &&!Name_txt.getText().equals("")&&!Family_txt.getText().equals("")&&!Gender_txt.getText().equals("")&&!National_Code_txt.getText().equals("")
        &&!Description_txt.getText().equals("")) {
            insertable = Controller.Checker.insertablity(Floor_txt.getText(), Room_txt.getText(), Type_txt.getText(), Bed_txt.getText());
            lbl.setText("");
            switch (insertable) {
                case "true":
                    manager.Insert(Name_txt.getText(), Family_txt.getText(), Gender_txt.getText(), National_Code_txt.getText(), Description_txt.getText(), Floor_txt.getText(), Room_txt.getText()
                            , Bed_txt.getText(), "5", Type_txt.getText());
                    lbl.setText("patient imported successfully ");
                    break;
                case "room is full!!":
                    lbl.setText("room is full!!");
                    break;
                case "this room has another type":
                    lbl.setText("this room has another type...type is : " + Checking.rcp.type);
                    break;
                case "invalid bed":
                    lbl.setText("invalid bed");
                    break;
            }
        }else
            lbl.setText("please complete the information");
    }

    public void setHome_Page_Button(){
        Controller.BuildPage("home.fxml","Hospital Pacs");
    }
}
