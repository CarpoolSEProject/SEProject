package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.IOException;

public class aController {

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
    private Pane aPane;

    @FXML
    private JFXButton joinA;

    @FXML
    void toChoosePlaceA(ActionEvent event) throws IOException {
//        aPane.getChildren().clear();
//        aPane.getChildren().add(FXMLLoader.load(getClass().getResource("choosePlaceA.fxml")));
    }

//    @FXML
//    void toFeed(MouseEvent event) {
//        Main.callStage.setScene(Main.feed);
//    }

}
