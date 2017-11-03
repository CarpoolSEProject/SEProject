package sample;

import com.jfoenix.controls.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class createPostController {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

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
    private JFXTimePicker time;

    @FXML
    private JFXDatePicker date;

    @FXML
    private JFXButton confirm_createPost;

    @FXML
    private JFXButton back_createPost;

    @FXML
    private JFXCheckBox wait_KaeKi;

    @FXML
    private JFXCheckBox wait_E12;

    @FXML
    private JFXCheckBox wait_A;

    @FXML
    private JFXCheckBox wait_lib;

    @FXML
    private JFXCheckBox wait_sci;

    @FXML
    private JFXCheckBox wait_prathep;

    @FXML
    private JFXCheckBox wait_ecc;

    @FXML
    private JFXCheckBox wait_RNP;


    @FXML
    private Text warning;


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
//    public void createPost(Driver driver, JoinEvent joinevent, String From, String To, Date TimetoArrive, Car CarType, Integer SeatLeft, String LocationWaiting){
//
//    }



    @FXML
    void back(ActionEvent event) {

    }

    @FXML
    void confirm(ActionEvent event) { //press confirm
        if((choicePlace_to.getValue() != null) && (choicePlace_from.getValue() != null) && (choiceCarType.getValue() != null) && (seatLeft.getValue() != null)
                && (time.getValue() != null) && (date.getValue() != null) && countCheckBox()==1){
            System.out.println("Form Accepted");
            warning.setVisible(false);

        }
        else {
            warning.setVisible(true);
        }

    }


    public int countCheckBox (){
        int count = 0;
        if (wait_KaeKi.isSelected() == true || wait_E12.isSelected() == true || wait_A.isSelected() == true ||
                wait_lib.isSelected() == true || wait_sci.isSelected() == true || wait_prathep.isSelected() == true ||
                wait_ecc.isSelected() == true || wait_RNP.isSelected() == true){
            count = 1;
        }
        else {
            count = 0;
        }

        return count;

    }


}
