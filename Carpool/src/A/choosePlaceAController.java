package A;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class choosePlaceAController {

    @FXML
    private Pane choosePlaceA;

    @FXML
    private JFXButton ok_ChoosePlaceA;

    @FXML
    private JFXButton back_ChoosePlaceA;

    @FXML
    void back(ActionEvent event) throws IOException {
        choosePlaceA.getChildren().clear();
        choosePlaceA.getChildren().add(FXMLLoader.load(getClass().getResource("../A/a.fxml")));
    }

    @FXML
    void ok(ActionEvent event) throws IOException {
        choosePlaceA.getChildren().clear();
        choosePlaceA.getChildren().add(FXMLLoader.load(getClass().getResource("../A/confirmA.fxml")));
    }

}
