package E12;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class confirmE12Controller {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton confirm_E12;

    @FXML
    private JFXButton back_e12;

    @FXML
    void back(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../E12/choosePlaceE12.fxml")));

    }

    @FXML
    void confirm(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../E12/summaryE12.fxml")));

    }

}
