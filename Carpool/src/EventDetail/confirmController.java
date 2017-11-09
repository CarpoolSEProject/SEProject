package EventDetail;

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

public class confirmController {

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

    public choosePlaceToWaitController confirmParent;
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

        }
        else if (to.equals("E12 Building")){
            TO.setFill(Color.valueOf("#cf2e51"));
            FROM.setFill(Color.valueOf("#cf2e51"));
            arrive.setFill(Color.valueOf("#cf2e51"));
            place.setFill(Color.valueOf("#cf2e51"));
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
//        else if (to.equals("Prathep Building")){
//            choice1.setTextFill(Color.valueOf("#92b923"));
//            choice2.setTextFill(Color.valueOf("#92b923"));
//            choice3.setTextFill(Color.valueOf("#92b923"));
//            choice4.setTextFill(Color.valueOf("#92b923"));
//            choice5.setTextFill(Color.valueOf("#92b923"));
//        }
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
        TypedQuery<String> q = em.createQuery("SELECT table FROM Event table WHERE table.To = :to AND table.From = :from " +
                "AND table.Date = :date AND table.Time = :time AND table.CarType = :car" , String.class);
        q.setParameter("to",this.to).toString();
        q.setParameter("from",this.from.toString());
        q.setParameter("date",this.date.toString());
        q.setParameter("time",this.time.toString());
        q.setParameter("car",this.car.toString());

        for (String i : q.getResultList()){
            System.out.println("from table: "+i);
        }


//        JoinEvent toSend = new JoinEvent(driverName, );



        pane.getChildren().add(Main.summary.getRoot());
        Main.summaryController.toSummary(img.getImage(), to.getText(), from.getText(), time.getText(),
                date.getText(), seat, car, placeToWait.getText());
    }
}
