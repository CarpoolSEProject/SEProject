package A;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import sample.Main;

import java.io.IOException;

public class summaryAController {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton arrived_A;

    @FXML
    void arrived(ActionEvent event) throws IOException {
        Main.callStage.setScene(Main.feed);
    }
    @FXML
    void home(ActionEvent event) {
        Main.callStage.setScene(Main.feed);
    }

}
