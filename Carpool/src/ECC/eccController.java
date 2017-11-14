package ECC;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import sample.Main;

import java.io.IOException;

public class eccController {

    @FXML
    private Text navBar_home;

    @FXML
    private Text navBar_profile;

    @FXML
    private Text navBar_logout;

    @FXML
    private ImageView profile;

    @FXML
    private ImageView setting;

    @FXML
    private ImageView logout;

    @FXML
    private ImageView ECC;

    @FXML
    private Pane pane;

    @FXML
    private JFXButton join_ecc;

    @FXML
    private JFXButton back_ecc;

    @FXML
    void back(ActionEvent event) {
        Main.callStage.setScene(Main.feed);


    }

    @FXML
    void join(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        pane.getChildren().add(FXMLLoader.load(getClass().getResource("../ECC/choosePlaceECC.fxml")));

    }

}
