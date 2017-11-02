package sample;

import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class createPostController {

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
    private JFXComboBox<Label> choicePlace_to;

    @FXML
    private JFXComboBox<Label> choicePlace_from;

    @FXML
    private JFXComboBox<Label> choiceCarType;

    @FXML
    private JFXComboBox<Label> seatLeft;

    @FXML
    public void initialize() {
        choicePlace_to.getItems().add(new Label("RNP"));
        choicePlace_to.getItems().add(new Label("Kae Ki"));
        choicePlace_to.getItems().add(new Label("E12 Building"));
        choicePlace_to.getItems().add(new Label("A Cafeteria"));
        choicePlace_to.getItems().add(new Label("Central Library"));
        choicePlace_to.getItems().add(new Label("Faculty of Science"));
        choicePlace_to.getItems().add(new Label("Prathep Building"));
        choicePlace_to.getItems().add(new Label("ECC Building"));

        choicePlace_from.getItems().add(new Label("RNP"));
        choicePlace_from.getItems().add(new Label("Kae Ki"));
        choicePlace_from.getItems().add(new Label("E12 Building"));
        choicePlace_from.getItems().add(new Label("A Cafeteria"));
        choicePlace_from.getItems().add(new Label("Central Library"));
        choicePlace_from.getItems().add(new Label("Faculty of Science"));
        choicePlace_from.getItems().add(new Label("Prathep Building"));
        choicePlace_from.getItems().add(new Label("ECC Building"));

        choiceCarType.getItems().add(new Label("Private Car"));
        choiceCarType.getItems().add(new Label("Motorcycle"));

        seatLeft.getItems().add(new Label("1"));
        seatLeft.getItems().add(new Label("2"));
        seatLeft.getItems().add(new Label("3"));
        seatLeft.getItems().add(new Label("4"));

    }


}
