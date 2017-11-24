package sample.EventDetail;

import CarpoolDB.Database;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import sample.JoinEvent;
import sample.Main;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ConfirmController {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton confirmButton;

    @FXML
    private JFXButton backButton;

    @FXML
    private ImageView img;

    @FXML
    private Text to;

    @FXML
    private Text from;

    @FXML
    private Text time;

    @FXML
    private Text date;

    @FXML
    private Text placeToWait;

    @FXML
    private Text TO;

    @FXML
    private Text FROM;

    @FXML
    private Text arrive;

    @FXML
    private Text place;

    public ChoosePlaceToWaitController confirmParent;
    String seat;
    String car;


    public void toConfirm(Image img, String to, String from, String time, String date, String seat, String car, String placeToWait){
        this.img.setImage(img);
        this.to.setText(to);
        this.from.setText(from);
        this.time.setText(time);
        this.date.setText(date);
        this.placeToWait.setText(placeToWait);
        this.seat = seat;
        this.car = car;

        this.to.setVisible(true);
        this.from.setVisible(true);
        this.time.setVisible(true);
        this.to.setVisible(true);
        this.date.setVisible(true);
        this.placeToWait.setVisible(true);

        if (to.equals("Kae Ki")){
            TO.setFill(Color.valueOf("#55b4f1"));
            FROM.setFill(Color.valueOf("#55b4f1"));
            arrive.setFill(Color.valueOf("#55b4f1"));
            place.setFill(Color.valueOf("#55b4f1"));

        }
        else if (to.equals("E12 Building")){
            TO.setFill(Color.valueOf("#1bb64f"));
            FROM.setFill(Color.valueOf("#1bb64f"));
            arrive.setFill(Color.valueOf("#1bb64f"));
            place.setFill(Color.valueOf("#1bb64f"));
        }
        else if (to.equals("A Cafeteria")){
            TO.setFill(Color.valueOf("#fd9139"));
            FROM.setFill(Color.valueOf("#fd9139"));
            arrive.setFill(Color.valueOf("#fd9139"));
            place.setFill(Color.valueOf("#fd9139"));
        }
        else if (to.equals("Central Library")){
            TO.setFill(Color.valueOf("#a12fb5"));
            FROM.setFill(Color.valueOf("#a12fb5"));
            arrive.setFill(Color.valueOf("#a12fb5"));
            place.setFill(Color.valueOf("#a12fb5"));
        }
        else if (to.equals("Faculty of Science")){
            TO.setFill(Color.valueOf("#92b923"));
            FROM.setFill(Color.valueOf("#92b923"));
            arrive.setFill(Color.valueOf("#92b923"));
            place.setFill(Color.valueOf("#92b923"));
        }
        else if (to.equals("Prathep Building")){
            TO.setFill(Color.valueOf("#ffda2e"));
            FROM.setFill(Color.valueOf("#ffda2e"));
            arrive.setFill(Color.valueOf("#ffda2e"));
            place.setFill(Color.valueOf("#ffda2e"));
        }
        else if (to.equals("ECC Building")){
            TO.setFill(Color.valueOf("#cf2e51"));
            FROM.setFill(Color.valueOf("#cf2e51"));
            arrive.setFill(Color.valueOf("#cf2e51"));
            place.setFill(Color.valueOf("#cf2e51"));
        }
        else if (to.equals("RNP")){
            TO.setFill(Color.valueOf("#1274d2"));
            FROM.setFill(Color.valueOf("#1274d2"));
            arrive.setFill(Color.valueOf("#1274d2"));
            place.setFill(Color.valueOf("#1274d2"));
        }

    }


    @FXML
    void back(ActionEvent event) {
        confirmParent.removeMe();
    }

    @FXML
    void confirm(ActionEvent event) {

        // send event to database
        EntityManager em = Database.getConnection().createEntityManager();
        TypedQuery<sample.Event> q = em.createQuery("SELECT table FROM Event table WHERE table.to = :to AND table.from = :from " +
                "AND table.date = :date AND table.time = :time AND table.carType = :car" , sample.Event.class);
        q.setParameter("to",to.getText());
        q.setParameter("from",from.getText());
        q.setParameter("date",date.getText());
        q.setParameter("time",time.getText());
        q.setParameter("car",car);

        sample.Event ev = q.getResultList().get(0);

        System.out.println("test get result: "+q.getResultList());

        System.out.println("to: "+ to.getText());
        System.out.println("from: "+ from.getText());
        System.out.println("date: "+ date.getText());
        System.out.println("time: "+ time.getText());
        System.out.println("car: "+ car);

        String passenger = "Puttachart Srisuwankul";

        JoinEvent toSend = new JoinEvent(passenger, ev);


        em.getTransaction().begin();
        ev.setSeatLeft(ev.getSeatLeft()-1);
        ev.addJoinEvent(toSend);
        em.getTransaction().commit();
        em.close();


        // To next page
        pane.getChildren().add(Main.summary.getRoot());
        Main.SummaryController.toSummary(img.getImage(), to.getText(), from.getText(), time.getText(),
                date.getText(), seat, car, placeToWait.getText());
    }


}
