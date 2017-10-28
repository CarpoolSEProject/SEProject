package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;


public class Controller {

    @FXML
    private JFXButton loginButton;

    @FXML
    private JFXTextField enterUsername;

    @FXML
    private JFXTextField enterPassword;

    @FXML
    void handle(ActionEvent event) {
        System.out.println("Test Change Scene");
        Main.callStage.setScene(new Scene(Main.createPost, 900, 600));
    }

//    Feed
    @FXML
    private Text navBar_home;

    @FXML
    private Text navBar_profile;

    @FXML
    private Text navBar_logout;

    @FXML
    private JFXButton fav_ECC;

    @FXML
    private JFXButton fav_E12;

    @FXML
    private JFXButton fav_library;

    @FXML
    private JFXButton history_sci;

    @FXML
    private JFXButton history_E12;

    @FXML
    private ImageView profile;

    @FXML
    private ImageView setting;

    @FXML
    private ImageView logout;

    @FXML
    private ImageView ECC;

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
    void toEcc(MouseEvent event) {
        Main.callStage.setScene(new Scene(Main.ecc, 900, 600));
    }
    @FXML
    void toA(MouseEvent event) {
        Main.callStage.setScene(new Scene(Main.a, 900, 600));
    }

    @FXML
    void toE12(MouseEvent event) {
        Main.callStage.setScene(new Scene(Main.e12, 900, 600));
    }

    @FXML
    void toRnp(MouseEvent event) {
        Main.callStage.setScene(new Scene(Main.rnp, 900, 600));

    }

    @FXML
    void toFeed(MouseEvent event) {
        System.out.println("To feed");

    }

//    Ecc
    @FXML
    private JFXButton joinEcc;

    @FXML
    private JFXButton backToFeed;

    @FXML
    void toChooseEcc(MouseEvent event) {
        Main.callStage.setScene(new Scene(Main.choosePlaceEcc, 900, 600));

    }

//    @FXML
//    void toFeed(MouseEvent event) {
//
//    }




}

