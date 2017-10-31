package RNP;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class confirmRnpController {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton confirm_rnp;

    @FXML
    private JFXButton back_rnp;

    @FXML
    void back(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../RNP/choosePlaceRnp.fxml")));

    }

    @FXML
    void confirm(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../RNP/summaryRnp.fxml")));

    }

}
