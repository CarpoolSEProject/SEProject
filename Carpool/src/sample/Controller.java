package sample;

import CarpoolDB.Database;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;


public class Controller {

    @FXML
    private JFXButton loginButton;

    @FXML
    private JFXTextField enterUsername;

    @FXML
    private JFXPasswordField enterPassword;

    @FXML
    private Text userOrPassIncorrect;


    @FXML
    void handle(ActionEvent event) {
        System.out.println("Log in");  //When press loginButton
        EntityManager em = Database.getConnection().createEntityManager();
        TypedQuery<Person> q = em.createQuery("SELECT p FROM Person p WHERE p.username = :user AND p.password = :pass", Person.class);
        Person ps2 = null;
        q.setParameter("user",enterUsername.getText());
        q.setParameter("pass",enterPassword.getText());
        for ( Person ps1 : q.getResultList()) {
            System.out.println(ps1.getUsername());
            System.out.println(ps1.getPassword());
            Main.checkLogin = 1;
            ps2 = ps1;
        }
        if ((Main.checkLogin == 1) && (ps2.getUsername().equals("kongza")) && (ps2.getPassword().equals("1234"))) {
            Main.callStage.setScene(Main.createPost);
        }
        else if ((Main.checkLogin == 1) && (ps2.getUsername().equals("tangkwaaa")) && (ps2.getPassword().equals("5678"))) {
            Main.callStage.setScene(Main.feed);
        }
        else {
            userOrPassIncorrect.setVisible(true);
        }


    }

    @FXML
    void pressEnter(KeyEvent event) {
        enterPassword.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode().equals(KeyCode.ENTER)) {
                    System.out.println("Log in");  //When press loginButton
                    EntityManager em = Database.getConnection().createEntityManager();
                    TypedQuery<Person> q = em.createQuery("SELECT p FROM Person p WHERE p.username = :user AND p.password = :pass", Person.class);
                    Person ps2 = null;
                    q.setParameter("user",enterUsername.getText());
                    q.setParameter("pass",enterPassword.getText());
                    for ( Person ps1 : q.getResultList()) {
                        System.out.println(ps1.getUsername());
                        System.out.println(ps1.getPassword());
                        Main.checkLogin = 1;
                        ps2 = ps1;
                    }
                    if ((Main.checkLogin == 1) && (ps2.getUsername().equals("kongza")) && (ps2.getPassword().equals("1234"))) {
                        Main.callStage.setScene(Main.driverFeed);
                    }
                    else if ((Main.checkLogin == 1) && (ps2.getUsername().equals("tangkwaaa")) && (ps2.getPassword().equals("5678"))) {
                        Main.callStage.setScene(Main.feed);
                    }
                    else {
                        userOrPassIncorrect.setVisible(true);
                    }
                }
            }
        });

    }

    public void clearText (){
        enterUsername.clear();
        enterPassword.clear();
    }







}

