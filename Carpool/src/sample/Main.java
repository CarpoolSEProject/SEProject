package sample;

import CarpoolDB.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

//import java.awt.*;

public class Main extends Application{
    public static Stage callStage;
    public static Scene sample;
    public static Scene ecc;
    public static Scene a;
    public static Scene e12;
    public static Scene rnp;
    public static Scene choosePlaceEcc;
    public static Scene createPost;
    public static Scene feed;
    public static Scene driverFeed;

    public static int checkLogin = 0;
    private static EntityManagerFactory emf;


    @Override
    public void start(Stage primaryStage) throws Exception {

        callStage = primaryStage;
        Parent sample = FXMLLoader.load(getClass().getResource("sample.fxml")); // login
        Parent feed = FXMLLoader.load(getClass().getResource("feed.fxml"));
        Parent ecc = FXMLLoader.load(getClass().getResource("../ECC/ecc.fxml"));
        Parent a = FXMLLoader.load(getClass().getResource("../A/a.fxml"));
        Parent e12 = FXMLLoader.load(getClass().getResource("../E12/e12.fxml"));
        Parent rnp = FXMLLoader.load(getClass().getResource("../RNP/rnp.fxml"));
        Parent choosePlaceEcc = FXMLLoader.load(getClass().getResource("../ECC/choosePlaceEcc.fxml"));
        Parent createPost = FXMLLoader.load(getClass().getResource("createPost.fxml"));
        Parent driverFeed = FXMLLoader.load(getClass().getResource("driverFeed.fxml"));
        this.sample = new Scene(sample);
        this.feed = new Scene(feed);
        this.ecc = new Scene(ecc);
        this.a = new Scene(a);
        this.e12 = new Scene(e12);
        this.rnp = new Scene(rnp);
        this.choosePlaceEcc = new Scene(choosePlaceEcc);
        this.createPost = new Scene(createPost);
        this.driverFeed = new Scene(driverFeed);

        callStage.setTitle("CARPOOL");
        callStage.setScene(this.sample);
        callStage.setHeight(615);
        callStage.setWidth(900);
        callStage.show();

        // DB TEST
        Database.connect();
        emf = Database.getConnection();

        Driver kong = new Driver("kongza", "1234", "kong@hotmail.com", "Witsarut Kavidum", "Male", 21, "0910719895","Private Car","AB1234","4",new Event());
        Passenger tangkwa = new Passenger("tangkwaaa", "5678", "tangkwa@hotmail.com", "Putthachart Srisuwankul", "Female", 21, "0875933814");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.getMetamodel().entity(Person.class);
        em.createQuery("DELETE FROM Person").executeUpdate();
        em.getMetamodel().entity(Driver.class);
        em.createQuery("DELETE FROM Driver").executeUpdate();
        em.getMetamodel().entity(Passenger.class);
        em.createQuery("DELETE FROM Passenger").executeUpdate();
        em.persist(kong);
        em.persist(tangkwa);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void stop() {
        emf.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


