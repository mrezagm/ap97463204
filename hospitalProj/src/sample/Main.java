package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start( Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("Hospital Pacs");
        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();
    }


    public static void main(String[] args) throws SQLException {
        launch(args);
    }


}
