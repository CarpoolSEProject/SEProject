package ECC;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import sample.Main;

import java.io.IOException;

public class summaryEccController {

    @FXML
    private Pane pane;

    @FXML
    private ImageView ECC;

    @FXML
    private JFXButton arrived_ecc;

    @FXML
    private JFXButton home_ecc;

    @FXML
    void arrived(ActionEvent event) throws IOException {
        Main.callStage.setScene(Main.feed);

    }

    @FXML
    void home(ActionEvent event) throws IOException {
        Main.callStage.setScene(Main.feed);

    }

}
