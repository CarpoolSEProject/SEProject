package RNP;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class choosePlaceRnpController {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton ok_rnp;

    @FXML
    private JFXButton back_rnp;

    @FXML
    void back(ActionEvent event) throws IOException {

        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../RNP/rnp.fxml")));

    }

    @FXML
    void ok(ActionEvent event) throws IOException {

        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../RNP/confirmRnp.fxml")));

    }

}
