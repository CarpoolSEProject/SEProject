package E12;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import sample.Main;

public class summaryE12Controller {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton arrived_e12;

    @FXML
    private JFXButton home_e12;

    @FXML
    void arrived(ActionEvent event) {
        Main.callStage.setScene(Main.feed);

    }

    @FXML
    void home(ActionEvent event) {

        Main.callStage.setScene(Main.feed);

    }

}
