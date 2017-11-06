package ECC;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import sample.Main;

import java.io.IOException;

public class choosePlaceEccController {

    @FXML
    private Pane pane;

    @FXML
    private ImageView ECC;

    @FXML
    private JFXButton ok_ecc;

    @FXML
    private JFXButton back_ecc;

    @FXML
    void back(MouseEvent event) throws IOException {
        Main.callStage.setScene(Main.ecc); // this does not work :(

    }

    @FXML
    void ok(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../ECC/confirmEcc.fxml")));

    }

}
