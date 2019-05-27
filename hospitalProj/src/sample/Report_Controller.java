package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Report_Controller {


    public Button Report_Button;
    public Button Home_Page_Button1;
    public TextArea Txt_Area;

    public void setReport_Button(){
        Txt_Area.setText(Controller.Checker.Reporter());
    }

    public void setHome_Page_Button(){
        Controller.BuildPage("home.fxml","Hospital Pacs");
    }
}
