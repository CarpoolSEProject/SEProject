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
    public static Scene sample;
    public static Scene ecc;
    public static Scene a;
    public static Scene e12;
    public static Scene rnp;
    public static Scene choosePlaceEcc;
    public static Scene createPost;
    public static Scene feed;


    @Override
    public void start(Stage primaryStage) throws Exception{
        callStage = primaryStage;
        Parent sample = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Parent feed = FXMLLoader.load(getClass().getResource("feed.fxml"));
        Parent ecc = FXMLLoader.load(getClass().getResource("ecc.fxml"));
        Parent a = FXMLLoader.load(getClass().getResource("a.fxml"));
        Parent e12 = FXMLLoader.load(getClass().getResource("e12.fxml"));
        Parent rnp = FXMLLoader.load(getClass().getResource("rnp.fxml"));
        Parent choosePlaceEcc = FXMLLoader.load(getClass().getResource("choosePlaceEcc.fxml"));
        Parent createPost = FXMLLoader.load(getClass().getResource("createPost.fxml"));
        this.feed = new Scene(feed);
        this.ecc = new Scene(ecc);
        this.a = new Scene(a);
        this.e12 = new Scene(e12);
        this.rnp = new Scene(rnp);
        this.choosePlaceEcc = new Scene(choosePlaceEcc);
        this.createPost = new Scene(createPost);

        callStage.setTitle("CARPOOL");
        callStage.setScene(new Scene(sample, 900, 600));
        callStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}


