package RNP;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import sample.Main;

public class summaryRnpController {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton arrived_rnp;

    @FXML
    private JFXButton home_rnp;

    @FXML
    void arrived(ActionEvent event) {

        Main.callStage.setScene(Main.feed);


    }

    @FXML
    void home(ActionEvent event) {

        Main.callStage.setScene(Main.feed);

    }

}
