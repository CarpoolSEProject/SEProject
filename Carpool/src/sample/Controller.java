package sample;

import CarpoolDB.Database;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;


import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;


public class Controller {

    @FXML
    private JFXButton loginButton;

    @FXML
    private JFXTextField enterUsername;

    @FXML
    private JFXTextField enterPassword;

    @FXML
    void handle(ActionEvent event) {
        System.out.println("Test Change Scene");  //When push loginButton
        int checklogin = 0;
        EntityManager em = Database.getConnection().createEntityManager();
        TypedQuery<Person> q = em.createQuery("SELECT p FROM Person p WHERE p.Username = :user AND p.Password = :pass", Person.class);
        q.setParameter("user",enterUsername.getText());
        q.setParameter("pass",enterPassword.getText());
        for (Person ps : q.getResultList()) {
            System.out.println(ps.getUsername());
            System.out.println(ps.getPassword());
            checklogin = 1;
        }

        if (checklogin == 1) {
            Main.callStage.setScene(Main.driverFeed);
        }
    }

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

        Main.callStage.setScene(Main.ecc);
    }

    @FXML
    void toA(MouseEvent event) {

        Main.callStage.setScene(Main.a);
    }

    @FXML
    void toE12(MouseEvent event) {

        Main.callStage.setScene(Main.e12);
    }

    @FXML
    void toRnp(MouseEvent event) {
        Main.callStage.setScene(Main.rnp);

    }





}

