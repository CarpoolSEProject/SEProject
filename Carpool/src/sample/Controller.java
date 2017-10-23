package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;


public class Controller {

    @FXML
    private JFXButton loginButton;

    @FXML
    private JFXTextField enterUsername;

    @FXML
    private JFXTextField enterPassword;

    @FXML
    void handle(ActionEvent event) {
        System.out.println("Test Change Scene");
        Main.callStage.setScene(new Scene(Main.feed, 900, 600));
    }

}

