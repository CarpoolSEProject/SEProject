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

public class Main extends Application{
    public static Stage callStage;
    public static Parent feed;
    public static Parent sample;

    @Override
    public void start(Stage primaryStage) throws Exception{
        callStage = primaryStage;
        sample = FXMLLoader.load(getClass().getResource("sample.fxml"));
        feed = FXMLLoader.load(getClass().getResource("feed.fxml"));
        callStage.setTitle("CARPOOL");
        callStage.setScene(new Scene(sample, 900, 600));
        callStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}


