package sample;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

//import java.awt.*;

public class Main extends Application implements EventHandler<ActionEvent>{
    @FXML JFXButton loginButton;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("CARPOOL");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource()==loginButton) {
            System.out.println("testttttt");
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}


// Hello