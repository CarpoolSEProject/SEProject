package ECC;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class confirmEccController {

    @FXML
    private Pane pane;

    @FXML
    private ImageView ECC;

    @FXML
    private JFXButton confirm_ecc;

    @FXML
    private JFXButton back_ecc;

    @FXML
    void back(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../ECC/choosePlaceEcc.fxml")));

    }

    @FXML
    void confirm(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../ECC/summaryEcc.fxml")));

    }

}
