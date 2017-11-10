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
import sample.Passenger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
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
        TypedQuery<sample.Event> q = em.createQuery("SELECT table FROM Event table WHERE table.To = :to AND table.From = :from " +
                "AND table.Date = :date AND table.Time = :time AND table.CarType = :car" , sample.Event.class);
        q.setParameter("to",to.getText());
        q.setParameter("from",from.getText());
        q.setParameter("date",date.getText());
        q.setParameter("time",time.getText());
        q.setParameter("car",car);

        String driverName = null ;
        int id = 0;
        for ( sample.Event driver : q.getResultList()) {
            driverName = driver.getDriver();
            id = driver.getEventID();
        }
        System.out.println("test get result: "+q.getResultList());

        System.out.println("look! to: "+ to.getText());
        System.out.println("look! from: "+ from.getText());
        System.out.println("look! date: "+ date.getText());
        System.out.println("look! time: "+ time.getText());
        System.out.println("look! car: "+ car);
        System.out.println("look! driver: "+ driverName);

//        int seatForSend = Integer.parseInt(seat); //convert seat before send to db
//        int locationWaitingForSend[] = convertLocation();
//        String passenger = "Puttachart Srisuwankul";
        

        em.getTransaction().begin();
        Query query = em.createQuery(
                "UPDATE Event SET SeatLeft = SeatLeft - 1 " +
                        "WHERE EventID = " + String.valueOf(id));
        int updateCount = query.executeUpdate();
        em.getTransaction().commit();
        em.close();


        // To next page
        pane.getChildren().add(Main.summary.getRoot());
        Main.summaryController.toSummary(img.getImage(), to.getText(), from.getText(), time.getText(),
                date.getText(), seat, car, placeToWait.getText());
    }




    public int[] convertLocation(){
        int[] arr = new int[8];

        if (placeToWait.equals("Kae Ki")){
            for (int i = 0; i<8 ;i++) {
                if (i == 0) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = 0;
                }
            }
        }
        else if (placeToWait.equals("E12 Building")){
            for (int i = 0; i<8 ;i++) {
                if (i == 1) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = 0;
                }
            }
        }
        else if (placeToWait.equals("A Cafeteria")){
            for (int i = 0; i<8 ;i++) {
                if (i == 2) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = 0;
                }
            }
        }
        else if (placeToWait.equals("Central Library")){
            for (int i = 0; i<8 ;i++) {
                if (i == 3) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = 0;
                }
            }
        }
        else if (placeToWait.equals("Faculty of Science")){
            for (int i = 0; i<8 ;i++) {
                if (i == 4) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = 0;
                }
            }
        }
        else if (placeToWait.equals("Prathep Building")){
            for (int i = 0; i<8 ;i++) {
                if (i == 5) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = 0;
                }
            }
        }
        else if (placeToWait.equals("ECC Building")){
            for (int i = 0; i<8 ;i++) {
                if (i == 6) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = 0;
                }
            }
        }
        else if (placeToWait.equals("RNP")){
            for (int i = 0; i<8 ;i++) {
                if (i == 7) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = 0;
                }
            }
        }

        return arr;
    }
}
