package sample;

import CarpoolDB.Database;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
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
        for (int i : check.getResultList()) {
            j = i;
        }
        System.out.println("Amount of event: " + j);

        if (j == 1) { //event is empty
            blockPane1.setVisible(false);
            blockPane2.setVisible(false);
            blockPane3.setVisible(false);
            blockPane4.setVisible(false);
        } else if (j > 1) { // event is not empty (ev.getEventID = 1 = dummy)
            TypedQuery<Event> fromTable = em.createQuery("SELECT e FROM Event e WHERE EventID <> 1", Event.class);

            for (Event ev : fromTable.getResultList()) {

                if (ev.getEventID() == 2) {
                    blockPane1.setVisible(true);
                    to1.setText(ev.getTo());
                    from1.setText(ev.getFrom());
                    time1.setText(ev.getTime());
                    date1.setText(ev.getDate());
                    seat1.setText(String.valueOf(ev.getSeatLeft()));
                    car1.setText(ev.getCarType());

                    // img check
                    switch (ev.getTo()) {
                        case "RNP": img1.setImage(new Image("place/RNP.png"));
//                      case "Kae Ki": img1.setImage(new Image("place/RNP.png")); there is no kae ki picture
                        case "E12 Building"  : img1.setImage(new Image("place/E12.png"));
                        case "A Cafeteria" : img1.setImage(new Image("place/A.png"));
                        case "Central Library" : img1.setImage(new Image("library/RNP.png"));
                        case "Faculty of Science" : img1.setImage(new Image("place/sci.png"));
                        case "Prathep Building" : img1.setImage(new Image("place/prathep.png"));
                        case "ECC Building" : img1.setImage(new Image("place/ECC.png"));
                    }


                } else if (ev.getEventID() == 3) {
                    blockPane2.setVisible(true);
                    to2.setText(ev.getTo());
                    from2.setText(ev.getFrom());
                    time2.setText(ev.getTime());
                    date2.setText(ev.getDate());
                    seat2.setText(String.valueOf(ev.getSeatLeft()));
                    car2.setText(ev.getCarType());

                    // img check
                    switch (ev.getTo()) {
                        case "RNP": img1.setImage(new Image("place/RNP.png"));
//                      case "Kae Ki": img1.setImage(new Image("place/RNP.png")); there is no kae ki picture
                        case "E12 Building"  : img1.setImage(new Image("place/E12.png"));
                        case "A Cafeteria" : img1.setImage(new Image("place/A.png"));
                        case "Central Library" : img1.setImage(new Image("library/RNP.png"));
                        case "Faculty of Science" : img1.setImage(new Image("place/sci.png"));
                        case "Prathep Building" : img1.setImage(new Image("place/prathep.png"));
                        case "ECC Building" : img1.setImage(new Image("place/ECC.png"));
                    }

                } else if (ev.getEventID() == 4) {
                    blockPane3.setVisible(true);
                    to3.setText(ev.getTo());
                    from3.setText(ev.getFrom());
                    time3.setText(ev.getTime());
                    date3.setText(ev.getDate());
                    seat3.setText(String.valueOf(ev.getSeatLeft()));
                    car3.setText(ev.getCarType());

                    // img check
                    switch (ev.getTo()) {
                        case "RNP": img1.setImage(new Image("place/RNP.png"));
//                      case "Kae Ki": img1.setImage(new Image("place/RNP.png")); there is no kae ki picture
                        case "E12 Building"  : img1.setImage(new Image("place/E12.png"));
                        case "A Cafeteria" : img1.setImage(new Image("place/A.png"));
                        case "Central Library" : img1.setImage(new Image("library/RNP.png"));
                        case "Faculty of Science" : img1.setImage(new Image("place/sci.png"));
                        case "Prathep Building" : img1.setImage(new Image("place/prathep.png"));
                        case "ECC Building" : img1.setImage(new Image("place/ECC.png"));
                    }

                } else if (ev.getEventID() == 5) {
                    blockPane4.setVisible(true);
                    to4.setText(ev.getTo());
                    from4.setText(ev.getFrom());
                    time4.setText(ev.getTime());
                    date4.setText(ev.getDate());
                    seat4.setText(String.valueOf(ev.getSeatLeft()));
                    car4.setText(ev.getCarType());

                    // img check
                    switch (ev.getTo()) {
                        case "RNP": img1.setImage(new Image("place/RNP.png"));
//                      case "Kae Ki": img1.setImage(new Image("place/RNP.png")); there is no kae ki picture
                        case "E12 Building"  : img1.setImage(new Image("place/E12.png"));
                        case "A Cafeteria" : img1.setImage(new Image("place/A.png"));
                        case "Central Library" : img1.setImage(new Image("library/RNP.png"));
                        case "Faculty of Science" : img1.setImage(new Image("place/sci.png"));
                        case "Prathep Building" : img1.setImage(new Image("place/prathep.png"));
                        case "ECC Building" : img1.setImage(new Image("place/ECC.png"));
                    }
                }
            }
        }
    }


    @FXML
    void toDetail(MouseEvent event) {
        Main.callStage.setScene(Main.ecc);
    }


}
