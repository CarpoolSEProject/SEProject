package sample;

import CarpoolDB.Database;
import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import com.jfoenix.controls.JFXDatePicker;

import javax.persistence.*;
import java.time.LocalDate;


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
    private JFXTextField time;

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
    private Text warning2;

    @FXML
    private Text warning3;


    @FXML
    private Pane iconProfile;

    @FXML
    private Pane iconLogOut;

    String[] locationWaiting = new String[8];
    int[] checkLocation = new int[8];


    @FXML
    public void initialize() {
        //initial for choice
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


    @FXML
    void back(ActionEvent event) {
        Main.callStage.setScene(Main.driverFeed);
    }

    @FXML
    void confirm(ActionEvent event) { //press confirm button
        String witsarut = "Witsarut Kavidum";
        EntityManager em = Database.getConnection().createEntityManager();
        TypedQuery<String> q = em.createQuery("SELECT Name FROM Driver", String.class);
        String driverName = null ;
        for ( String kong : q.getResultList()) {
            if(kong.equals(witsarut)){
                driverName = kong;
            }
        }

        // check if any information is incomplete
        if((choicePlace_to.getValue() != null) && (choicePlace_from.getValue() != null) && (choiceCarType.getValue() != null) && (seatLeft.getValue() != null)
                && (time.getText() != null) && (date.getValue() != null) && countCheckBox()==1) {

            System.out.println("TO: "+ choicePlace_to.getValue().toString());
            System.out.println("FROM: "+ choicePlace_from.getValue().toString());

            System.out.println(choiceCarType.getValue());
            System.out.println(seatLeft.getValue());

            // to - from cannot be the same place
            if (choicePlace_to.getValue().getText().equals(choicePlace_from.getValue().getText())) {
                System.out.println("To - From are the same place");
                warning2.setVisible(true);
            }
            // check if motorcycle has more than 1 seat left
            if (choiceCarType.getValue().getText().equals("Motorcycle") && (seatLeft.getValue().getText().equals("3") || seatLeft.getValue().getText().equals("4")
                    || seatLeft.getValue().getText().equals("2"))){
                System.out.println("Motorcycle and seatleft > 1");
                warning3.setVisible(true);
            }
            else { //everything is okay

                System.out.println("Form Accepted");
                warning.setVisible(false);
                warning2.setVisible(false);

                String to = choicePlace_to.getValue().getText();
                String from = choicePlace_from.getValue().getText();
                String timee = time.getText();
                LocalDate datee = date.getValue();
                String carType = choiceCarType.getValue().getText();
                String seat = seatLeft.getValue().getText();
                int seatNo = Integer.parseInt(seat);

                if (wait_KaeKi.isSelected() == true) {
                    checkLocation[0] = 1;
                }
                if (wait_E12.isSelected() == true) {
                    checkLocation[1] = 1;
                }
                if (wait_A.isSelected() == true) {
                    checkLocation[2] = 1;
                }
                if (wait_lib.isSelected() == true) {
                    checkLocation[3] = 1;
                }
                if (wait_sci.isSelected() == true) {
                    checkLocation[4] = 1;
                }
                if (wait_prathep.isSelected() == true) {
                    checkLocation[5] = 1;
                }
                if (wait_ecc.isSelected() == true) {
                    checkLocation[6] = 1;
                }
                if (wait_RNP.isSelected() == true) {
                    checkLocation[7] = 1;
                }


                // Send event to Database (Event Class)
                if (carType == "Motorcycle") {
                    Car c = new Motorcycle("Motorcycle", 2);
                    Event toSend = new Event(driverName, from, to, datee.toString(), timee, c.getTypeName(), seatNo, checkLocation);
                    em.getTransaction().begin();
                    em.persist(toSend);
                    em.getTransaction().commit();

                }
                else if (carType == "Private Car") {
                    Car c = new PrivateCar("Private Car", 4);
                    Event toSend = new Event(driverName, from, to, datee.toString(), timee, c.getTypeName(), seatNo, checkLocation);
                    em.getTransaction().begin();
                    em.persist(toSend);
                    em.getTransaction().commit();
                }
                Main.callStage.setScene(Main.driverFeed);

            }

        }

        else { //if there is any incomplete option, show warning
            warning.setVisible(true);
        }

    }


    public int countCheckBox (){ //count number of selected checkbox
        int count;
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


    @FXML
    void Home(MouseEvent event) {
        Main.callStage.setScene(Main.driverFeed);
    }

    @FXML
    void LogOut(MouseEvent event) {
        Main.controller.clearText();
        Main.callStage.setScene(Main.sample);
    }

    @FXML
    void Profile(MouseEvent event) {
        Main.callStage.setScene(Main.driverProfile);
    }

}
