package E12;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class choosePlaceE12Controller {

    @FXML
    private Pane choosePlaceE12;

    @FXML
    private JFXButton ok_E12;

    @FXML
    private JFXButton back_E12;

    @FXML
    void back(ActionEvent event) throws IOException {
        choosePlaceE12.getChildren().clear();
        choosePlaceE12.getChildren().add(FXMLLoader.load(getClass().getResource("../E12/e12.fxml")));

    }

    @FXML
    void ok(ActionEvent event) throws IOException {
        choosePlaceE12.getChildren().clear();
        choosePlaceE12.getChildren().add(FXMLLoader.load(getClass().getResource("../E12/confirmE12.fxml")));

    }

}
