package sample;

import CarpoolDB.Database;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
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
    private Pane blockPane1;

    @FXML
    private Pane blockPane2;

    @FXML
    private Pane blockPane3;

    @FXML
    private Pane blockPane4;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;

    @FXML
    private ImageView img4;

    @FXML
    private Text loginButton;

    @FXML
    private Text to1;

    @FXML
    private Text from1;

    @FXML
    private Text time1;

    @FXML
    private Text car1;

    @FXML
    private Text seat1;

    @FXML
    private Text date1;

    @FXML
    private Text to2;

    @FXML
    private Text from2;

    @FXML
    private Text time2;

    @FXML
    private Text car2;

    @FXML
    private Text seat2;

    @FXML
    private Text date2;

    @FXML
    private Text to3;

    @FXML
    private Text from3;

    @FXML
    private Text time3;

    @FXML
    private Text car3;

    @FXML
    private Text seat3;

    @FXML
    private Text date3;

    @FXML
    private Text to4;

    @FXML
    private Text from4;

    @FXML
    private Text time4;

    @FXML
    private Text car4;

    @FXML
    private Text seat4;

    @FXML
    private Text date4;

    @FXML
    private JFXButton refresh;

    @FXML
    void refresh(ActionEvent event) { //to refresh the feed
        EntityManager em = Database.getConnection().createEntityManager();
        TypedQuery<Integer> check = em.createQuery("SELECT EventID FROM Event", Integer.class); //the first event of table Event is dummy event
        int j = 0; //check empty event
        for ( int i : check.getResultList()) {
            j = i;
        }
        System.out.println("Amount of event: " + j);

        if (j == 1) { //event is empty
            blockPane1.setVisible(false);
            blockPane2.setVisible(false);
            blockPane3.setVisible(false);
            blockPane4.setVisible(false);
        }
        else if (j > 1){ // event is not empty
            TypedQuery<Event> fromTable = em.createQuery("SELECT e FROM Event e WHERE EventID <> 1", Event.class);

            for ( Event ev : fromTable.getResultList()) {
                System.out.println(ev.getEventID());
                if (ev.getEventID() == 2) {
                    blockPane1.setVisible(true);
                    to1.setText(ev.getTo());
                }
            }
        }
    }


    @FXML
    void toDetail(MouseEvent event) {
        Main.callStage.setScene(Main.ecc);
    }


}
