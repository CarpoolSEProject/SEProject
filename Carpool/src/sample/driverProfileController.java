package sample;

import CarpoolDB.Database;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.sql.Time;

public class driverProfileController {

    @FXML
    private Text navBar_home;

    @FXML
    private Text navBar_profile;

    @FXML
    private Text navBar_logout;

    @FXML
    private Pane block1;

    @FXML
    private ImageView img1;

    @FXML
    private Text TO_1;

    @FXML
    private Text FROM_1;

    @FXML
    private Text Arrive_1;

    @FXML
    private Text date1;

    @FXML
    private Text time1;

    @FXML
    private Text from1;

    @FXML
    private Text to1;

    @FXML
    private Pane block2;

    @FXML
    private ImageView img2;

    @FXML
    private Text TO_2;

    @FXML
    private Text FROM_2;

    @FXML
    private Text Arrive_2;

    @FXML
    private Text date2;

    @FXML
    private Text time2;

    @FXML
    private Text from2;

    @FXML
    private Text to2;

    @FXML
    private Pane block3;

    @FXML
    private ImageView img3;

    @FXML
    private Text TO_3;

    @FXML
    private Text FROM_3;

    @FXML
    private Text Arrive_3;

    @FXML
    private Text date3;

    @FXML
    private Text time3;

    @FXML
    private Text from3;

    @FXML
    private Text to3;

    @FXML
    private Pane block4;

    @FXML
    private ImageView img4;

    @FXML
    private Text TO_4;

    @FXML
    private Text FROM_4;

    @FXML
    private Text Arrive_4;

    @FXML
    private Text date4;

    @FXML
    private Text time4;

    @FXML
    private Text from4;

    @FXML
    private Text to4;

    @FXML
    void toHome(MouseEvent event) {
        Main.callStage.setScene(Main.driverFeed);
    }

    @FXML
    public void initialize() {
        EntityManager em = Database.getConnection().createEntityManager();
        TypedQuery<Event> pull = em.createQuery("SELECT e FROM Event e", Event.class);
        for (Event ev: pull.getResultList()){
                if (ev.getEventID() == 1) {
                    block1.setVisible(true);
                    to1.setText(ev.getTo());
                    from1.setText(ev.getFrom());
                    time1.setText(ev.getTime());
                    date1.setText(ev.getDate());

                    if (ev.getTo().equals("E12 Building")){
                        img1.setImage(new Image("place/E12.png"));
                        TO_1.setFill(Color.valueOf("#1bb64f"));
                        FROM_1.setFill(Color.valueOf("#1bb64f"));
                        Arrive_1.setFill(Color.valueOf("#1bb64f"));
                    }

                    else if (ev.getTo().equals("RNP")){
                        img1.setImage(new Image("place/RNP.png"));
                        TO_1.setFill(Color.valueOf("#1274d2"));
                        FROM_1.setFill(Color.valueOf("#1274d2"));
                        Arrive_1.setFill(Color.valueOf("#1274d2"));
                    }

                    else if (ev.getTo().equals("A Cafeteria")){
                        img1.setImage(new Image("place/A.png"));
                        TO_1.setFill(Color.valueOf("#fd9139"));
                        FROM_1.setFill(Color.valueOf("#fd9139"));
                        Arrive_1.setFill(Color.valueOf("#fd9139"));
                    }

                    else if (ev.getTo().equals("Central Library")){
                        img1.setImage(new Image("place/library.png"));
                        TO_1.setFill(Color.valueOf("#a12fb5"));
                        FROM_1.setFill(Color.valueOf("#a12fb5"));
                        Arrive_1.setFill(Color.valueOf("#a12fb5"));
                    }

                    else if (ev.getTo().equals("Faculty of Science")){
                        img1.setImage(new Image("place/sci.png"));
                        TO_1.setFill(Color.valueOf("#92b923"));
                        FROM_1.setFill(Color.valueOf("#92b923"));
                        Arrive_1.setFill(Color.valueOf("#92b923"));
                    }

                    else if (ev.getTo().equals("ECC Building")){
                        img1.setImage(new Image("place/ECC.png"));
                        TO_1.setFill(Color.valueOf("#cf2e51"));
                        FROM_1.setFill(Color.valueOf("#cf2e51"));
                        Arrive_1.setFill(Color.valueOf("#cf2e51"));
                    }
//                    else if (ev.getTo().equals("Prathep Building")){
//                        img1.setImage(new Image("place/ECC.png"));
//                        to1.setFill(Color.valueOf("#cf2e51"));
//                        from1.setFill(Color.valueOf("#cf2e51"));
//                        time1.setFill(Color.valueOf("#cf2e51"));
//                        date1.setFill(Color.valueOf("#cf2e51"));
//                        seat1.setFill(Color.valueOf("#cf2e51"));
//                        car1.setFill(Color.valueOf("#cf2e51"));
//                    }
//                    else if (ev.getTo().equals("Kae Ki")){
//                        img1.setImage(new Image("place/ECC.png"));
//                        to1.setFill(Color.valueOf("#cf2e51"));
//                        from1.setFill(Color.valueOf("#cf2e51"));
//                        time1.setFill(Color.valueOf("#cf2e51"));
//                        date1.setFill(Color.valueOf("#cf2e51"));
//                        seat1.setFill(Color.valueOf("#cf2e51"));
//                        car1.setFill(Color.valueOf("#cf2e51"));
//                    }
                }

        }
    }

}
