package sample;
import EventDetail.*;

import CarpoolDB.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;



public class Main extends Application{
    public static Stage callStage;

    public static Scene sample;
    public static Scene createPost;
    public static Scene feed;
    public static Scene driverFeed;
    public static Scene detail;
    public static Scene choosePlacetoWait;
    public static Scene confirm;
    public static Scene summary;
    public static Scene driverProfile;

    public static Controller controller;
    public static createPostController createPostController;
    public static driverFeedController driverFeedController;
    public static detailController detailController;
    public static choosePlaceToWaitController choosePlaceToWaitController;
    public static confirmController confirmController;
    public static summaryController summaryController;
    public static driverProfileController driverProfileController;

    public static int checkLogin = 0;
    private static EntityManagerFactory emf;


    @Override
    public void start(Stage primaryStage) throws Exception {

        Database.connect();

        callStage = primaryStage;
        FXMLLoader sample = new FXMLLoader(getClass().getResource("sample.fxml")); // login
        FXMLLoader feed = new FXMLLoader(getClass().getResource("feed.fxml"));
        FXMLLoader createPost = new FXMLLoader(getClass().getResource("createPost.fxml"));
        FXMLLoader driverFeed = new FXMLLoader(getClass().getResource("driverFeed.fxml"));
        FXMLLoader detail = new FXMLLoader(getClass().getResource("../EventDetail/detail.fxml"));
        FXMLLoader choosePlaceToWait = new FXMLLoader(getClass().getResource("../EventDetail/choosePlaceToWait.fxml"));
        FXMLLoader confirm = new FXMLLoader(getClass().getResource("../EventDetail/confirm.fxml"));
        FXMLLoader summary = new FXMLLoader(getClass().getResource("../EventDetail/summary.fxml"));
        FXMLLoader driverProfile = new FXMLLoader(getClass().getResource("driverProfile.fxml"));

        this.sample = new Scene(sample.load());
        this.feed = new Scene(feed.load());
        this.createPost = new Scene(createPost.load());
        this.driverFeed = new Scene(driverFeed.load());
        this.detail = new Scene(detail.load());
        this.choosePlacetoWait = new Scene(choosePlaceToWait.load());
        this.confirm = new Scene(confirm.load());
        this.summary = new Scene(summary.load());
        this.driverProfile = new Scene(driverProfile.load());

        this.controller = sample.getController();
        this.createPostController = createPost.getController();
        this.driverFeedController = driverFeed.getController();
        this.detailController = detail.getController();
        this.choosePlaceToWaitController = choosePlaceToWait.getController();
        this.confirmController = confirm.getController();
        this.summaryController = summary.getController();
        this.driverProfileController = driverProfile.getController();


        callStage.setTitle("CARPOOL");
        callStage.setScene(this.sample);
        callStage.setHeight(620);
        callStage.setWidth(900);
        callStage.show();

        // DB TEST
//        Database.connect();
        emf = Database.getConnection();

        Driver kong = new Driver("kongza", "1234", "kong@hotmail.com", "Witsarut Kavidum", "Male", 21, "0910719895","Private Car","AB1234","4",null);
        Passenger tangkwa = new Passenger("tangkwaaa", "5678", "tangkwa@hotmail.com", "Putthachart Srisuwankul", "Female", 21, "0875933814");
        //Event dummy = new Event(kong.getName(),"dummy","dummy","00-00-00","00:00 AM","Private Car",0,null);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.getMetamodel().entity(Person.class);
        em.createQuery("DELETE FROM Person").executeUpdate();
        em.getMetamodel().entity(Driver.class);
        em.createQuery("DELETE FROM Driver").executeUpdate();
        em.getMetamodel().entity(Passenger.class);
        em.createQuery("DELETE FROM Passenger").executeUpdate();
//        em.getMetamodel().entity(Event.class);
//        em.createQuery("DELETE FROM Event").executeUpdate();
        em.persist(kong);
        em.persist(tangkwa);
        //em.persist(dummy);
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


