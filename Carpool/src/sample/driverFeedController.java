package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class driverFeedController {

    @FXML
    private Text navBar_home;

    @FXML
    private Text navBar_profile;

    @FXML
    private Text navBar_logout;

    @FXML
    private JFXButton fav_ECC;

    @FXML
    private JFXButton fav_library;

    @FXML
    private JFXButton history_E12;

    @FXML
    private ImageView profile;

    @FXML
    private ImageView setting;

    @FXML
    private ImageView logout;

    @FXML
    private ImageView A;

    @FXML
    private ImageView E12;

    @FXML
    private ImageView RNP;

    @FXML
    private JFXButton search_A;

    @FXML
    private JFXButton search_sci;

    @FXML
    private JFXButton search_ECC;

    @FXML
    private JFXButton search_RNP;

    @FXML
    private JFXButton search_KaeKi;

    @FXML
    private JFXButton createPost_Feed;

    @FXML
    void logout(MouseEvent event) {
        Main.callStage.setScene(Main.sample);
        Main.checkLogin = 0;
    }

//    @FXML
//    void createPost(ActionEvent event) {
//
//    }
//
//    @FXML
//    void toA(MouseEvent event) {
//
//    }
//
//    @FXML
//    void toE12(MouseEvent event) {
//
//    }
//
//    @FXML
//    void toRnp(MouseEvent event) {
//
//    }

}
