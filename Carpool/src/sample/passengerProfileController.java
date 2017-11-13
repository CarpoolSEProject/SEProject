package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class passengerProfileController {

    @FXML
    private Text navBar_home;

    @FXML
    private Text navBar_profile;

    @FXML
    private Text navBar_logout;

    @FXML
    private Pane block1;

    @FXML
    private ImageView img1;

    @FXML
    private Text TO_1;

    @FXML
    private Text FROM_1;

    @FXML
    private Text Arrive_1;

    @FXML
    private Text date1;

    @FXML
    private Text time1;

    @FXML
    private Text from1;

    @FXML
    private Text to1;

    @FXML
    private Pane block2;

    @FXML
    private ImageView img2;

    @FXML
    private Text TO_2;

    @FXML
    private Text FROM_2;

    @FXML
    private Text Arrive_2;

    @FXML
    private Text date2;

    @FXML
    private Text time2;

    @FXML
    private Text from2;

    @FXML
    private Text to2;

    @FXML
    private Pane block3;

    @FXML
    private ImageView img3;

    @FXML
    private Text TO_3;

    @FXML
    private Text FROM_3;

    @FXML
    private Text Arrive_3;

    @FXML
    private Text date3;

    @FXML
    private Text time3;

    @FXML
    private Text from3;

    @FXML
    private Text to3;

    @FXML
    private Pane block4;

    @FXML
    private ImageView img4;

    @FXML
    private Text TO_4;

    @FXML
    private Text FROM_4;

    @FXML
    private Text Arrive_4;

    @FXML
    private Text date4;

    @FXML
    private Text time4;

    @FXML
    private Text from4;

    @FXML
    private Text to4;

    @FXML
    void Home(MouseEvent event) {
        Main.callStage.setScene(Main.feed);
    }

    @FXML
    void LogOut(MouseEvent event) {
        Main.callStage.setScene(Main.sample);

    }

    @FXML
    void Profile(MouseEvent event) {
        Main.callStage.setScene(Main.passengerProfile);

    }

}
