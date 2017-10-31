package A;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class confirmAController {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton confirm_A;

    @FXML
    private JFXButton back_A;

    @FXML
    void back(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../A/choosePlaceA.fxml")));
    }

    @FXML
    void confirm(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../A/summaryA.fxml")));
    }

}
