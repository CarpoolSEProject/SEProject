package sample;

import CarpoolDB.Database;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class passengerFeedController {

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
    private Pane blockPane;

    @FXML
    private ImageView img;

    @FXML
    private Text loginButton;

    @FXML
    private Text from;

    @FXML
    private Text time;

    @FXML
    private Text car;

    @FXML
    private Text seat;

    @FXML
    private Text date;

    @FXML
    void toDetail(MouseEvent event) {
        Main.callStage.setScene(Main.ecc);
    }

//    public void checkEmptyFeed (){
//        EntityManager em = Database.getConnection().createEntityManager();
//        TypedQuery<Integer> check = em.createQuery("SELECT EventID FROM Event", Integer.class);
//        for ( int i : check.getResultList()) {
//            System.out.println(i);
//        }
//    }

}
