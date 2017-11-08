package sample;

import CarpoolDB.Database;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

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

    int[] location1 = new int[8];
    int[] location2 = new int[8];
    int[] location3 = new int[8];
    int[] location4 = new int[8];


    @FXML
    void refresh(ActionEvent event) { //to refresh the feed
        EntityManager em = Database.getConnection().createEntityManager();
        TypedQuery<Integer> check = em.createQuery("SELECT table FROM Event table WHERE table.EventID = :one", Integer.class);
        check.setParameter("one",1);
        System.out.println(check.getResultList());

        if (check.getResultList().isEmpty()) { //event is empty
            System.out.println("empty DB");
            blockPane1.setVisible(false);
            blockPane2.setVisible(false);
            blockPane3.setVisible(false);
            blockPane4.setVisible(false);
        }
        else if (check.getResultList().isEmpty() == false) { //event is not empty
            TypedQuery<Event> fromTable = em.createQuery("SELECT e FROM Event e", Event.class);

            for (Event ev : fromTable.getResultList()) {
                if (ev.getEventID() == 1) {
                    System.out.println(ev.getTo());
                    System.out.println(ev.getFrom());

                    blockPane1.setVisible(true);
                    to1.setText(ev.getTo());
                    from1.setText(ev.getFrom());
                    time1.setText(ev.getTime());
                    date1.setText(ev.getDate());
                    seat1.setText(String.valueOf(ev.getSeatLeft()));
                    car1.setText(ev.getCarType());
                    location1 = ev.getLocationWaiting();

                    if (ev.getTo().equals("E12 Building")){
                        img1.setImage(new Image("place/E12.png"));
                        to1.setFill(Color.valueOf("#1bb64f"));
                        from1.setFill(Color.valueOf("#1bb64f"));
                        time1.setFill(Color.valueOf("#1bb64f"));
                        date1.setFill(Color.valueOf("#1bb64f"));
                        seat1.setFill(Color.valueOf("#1bb64f"));
                        car1.setFill(Color.valueOf("#1bb64f"));
                    }

                    else if (ev.getTo().equals("RNP")){
                        img1.setImage(new Image("place/RNP.png"));
                        to1.setFill(Color.valueOf("#1274d2"));
                        from1.setFill(Color.valueOf("#1274d2"));
                        time1.setFill(Color.valueOf("#1274d2"));
                        date1.setFill(Color.valueOf("#1274d2"));
                        seat1.setFill(Color.valueOf("#1274d2"));
                        car1.setFill(Color.valueOf("#1274d2"));
                    }

                    else if (ev.getTo().equals("A Cafeteria")){
                        img1.setImage(new Image("place/A.png"));
                        to1.setFill(Color.valueOf("#fd9139"));
                        from1.setFill(Color.valueOf("#fd9139"));
                        time1.setFill(Color.valueOf("#fd9139"));
                        date1.setFill(Color.valueOf("#fd9139"));
                        seat1.setFill(Color.valueOf("#fd9139"));
                        car1.setFill(Color.valueOf("#fd9139"));
                    }

                    else if (ev.getTo().equals("Central Library")){
                        img1.setImage(new Image("place/library.png"));
                        to1.setFill(Color.valueOf("#a12fb5"));
                        from1.setFill(Color.valueOf("#a12fb5"));
                        time1.setFill(Color.valueOf("#a12fb5"));
                        date1.setFill(Color.valueOf("#a12fb5"));
                        seat1.setFill(Color.valueOf("#a12fb5"));
                        car1.setFill(Color.valueOf("#a12fb5"));
                    }

                    else if (ev.getTo().equals("Faculty of Science")){
                        img1.setImage(new Image("place/sci.png"));
                        to1.setFill(Color.valueOf("#92b923"));
                        from1.setFill(Color.valueOf("#92b923"));
                        time1.setFill(Color.valueOf("#92b923"));
                        date1.setFill(Color.valueOf("#92b923"));
                        seat1.setFill(Color.valueOf("#92b923"));
                        car1.setFill(Color.valueOf("#92b923"));
                    }

                    else if (ev.getTo().equals("ECC Building")){
                        img1.setImage(new Image("place/ECC.png"));
                        to1.setFill(Color.valueOf("#cf2e51"));
                        from1.setFill(Color.valueOf("#cf2e51"));
                        time1.setFill(Color.valueOf("#cf2e51"));
                        date1.setFill(Color.valueOf("#cf2e51"));
                        seat1.setFill(Color.valueOf("#cf2e51"));
                        car1.setFill(Color.valueOf("#cf2e51"));
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
                else if (ev.getEventID() == 2) {

                    blockPane2.setVisible(true);
                    to2.setText(ev.getTo());
                    from2.setText(ev.getFrom());
                    time2.setText(ev.getTime());
                    date2.setText(ev.getDate());
                    seat2.setText(String.valueOf(ev.getSeatLeft()));
                    car2.setText(ev.getCarType());
                    location2 = ev.getLocationWaiting();

                    if (ev.getTo().equals("E12 Building")){
                        img2.setImage(new Image("place/E12.png"));
                        to2.setFill(Color.valueOf("#1bb64f"));
                        from2.setFill(Color.valueOf("#1bb64f"));
                        time2.setFill(Color.valueOf("#1bb64f"));
                        date2.setFill(Color.valueOf("#1bb64f"));
                        seat2.setFill(Color.valueOf("#1bb64f"));
                        car2.setFill(Color.valueOf("#1bb64f"));
                    }

                    else if (ev.getTo().equals("RNP")){
                        img2.setImage(new Image("place/RNP.png"));
                        to2.setFill(Color.valueOf("#1274d2"));
                        from2.setFill(Color.valueOf("#1274d2"));
                        time2.setFill(Color.valueOf("#1274d2"));
                        date2.setFill(Color.valueOf("#1274d2"));
                        seat2.setFill(Color.valueOf("#1274d2"));
                        car2.setFill(Color.valueOf("#1274d2"));
                    }

                    else if (ev.getTo().equals("A Cafeteria")){
                        img2.setImage(new Image("place/A.png"));
                        to2.setFill(Color.valueOf("#fd9139"));
                        from2.setFill(Color.valueOf("#fd9139"));
                        time2.setFill(Color.valueOf("#fd9139"));
                        date2.setFill(Color.valueOf("#fd9139"));
                        seat2.setFill(Color.valueOf("#fd9139"));
                        car2.setFill(Color.valueOf("#fd9139"));
                    }

                    else if (ev.getTo().equals("Central Library")){
                        img2.setImage(new Image("place/library.png"));
                        to2.setFill(Color.valueOf("#a12fb5"));
                        from2.setFill(Color.valueOf("#a12fb5"));
                        time2.setFill(Color.valueOf("#a12fb5"));
                        date2.setFill(Color.valueOf("#a12fb5"));
                        seat2.setFill(Color.valueOf("#a12fb5"));
                        car2.setFill(Color.valueOf("#a12fb5"));
                    }

                    else if (ev.getTo().equals("Faculty of Science")){
                        img2.setImage(new Image("place/sci.png"));
                        to2.setFill(Color.valueOf("#92b923"));
                        from2.setFill(Color.valueOf("#92b923"));
                        time2.setFill(Color.valueOf("#92b923"));
                        date2.setFill(Color.valueOf("#92b923"));
                        seat2.setFill(Color.valueOf("#92b923"));
                        car2.setFill(Color.valueOf("#92b923"));
                    }

                    else if (ev.getTo().equals("ECC Building")){
                        img2.setImage(new Image("place/ECC.png"));
                        to2.setFill(Color.valueOf("#cf2e51"));
                        from2.setFill(Color.valueOf("#cf2e51"));
                        time2.setFill(Color.valueOf("#cf2e51"));
                        date2.setFill(Color.valueOf("#cf2e51"));
                        seat2.setFill(Color.valueOf("#cf2e51"));
                        car2.setFill(Color.valueOf("#cf2e51"));
                    }

                    //else if (ev.getTo().equals("Prathep Building")){
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
                 if (ev.getEventID() == 3) {
                    blockPane3.setVisible(true);
                    to3.setText(ev.getTo());
                    from3.setText(ev.getFrom());
                    time3.setText(ev.getTime());
                    date3.setText(ev.getDate());
                    seat3.setText(String.valueOf(ev.getSeatLeft()));
                    car3.setText(ev.getCarType());
                    location3 = ev.getLocationWaiting();

                    if (ev.getTo().equals("E12 Building")){
                        img3.setImage(new Image("place/E12.png"));
                        to3.setFill(Color.valueOf("#1bb64f"));
                        from3.setFill(Color.valueOf("#1bb64f"));
                        time3.setFill(Color.valueOf("#1bb64f"));
                        date3.setFill(Color.valueOf("#1bb64f"));
                        seat3.setFill(Color.valueOf("#1bb64f"));
                        car3.setFill(Color.valueOf("#1bb64f"));
                    }

                    else if (ev.getTo().equals("RNP")){
                        img3.setImage(new Image("place/RNP.png"));
                        to3.setFill(Color.valueOf("#1274d2"));
                        from3.setFill(Color.valueOf("#1274d2"));
                        time3.setFill(Color.valueOf("#1274d2"));
                        date3.setFill(Color.valueOf("#1274d2"));
                        seat3.setFill(Color.valueOf("#1274d2"));
                        car3.setFill(Color.valueOf("#1274d2"));
                    }

                    else if (ev.getTo().equals("A Cafeteria")){
                        img3.setImage(new Image("place/A.png"));
                        to3.setFill(Color.valueOf("#fd9139"));
                        from3.setFill(Color.valueOf("#fd9139"));
                        time3.setFill(Color.valueOf("#fd9139"));
                        date3.setFill(Color.valueOf("#fd9139"));
                        seat3.setFill(Color.valueOf("#fd9139"));
                        car3.setFill(Color.valueOf("#fd9139"));
                    }

                    else if (ev.getTo().equals("Central Library")){
                        img3.setImage(new Image("place/library.png"));
                        to3.setFill(Color.valueOf("#a12fb5"));
                        from3.setFill(Color.valueOf("#a12fb5"));
                        time3.setFill(Color.valueOf("#a12fb5"));
                        date3.setFill(Color.valueOf("#a12fb5"));
                        seat3.setFill(Color.valueOf("#a12fb5"));
                        car3.setFill(Color.valueOf("#a12fb5"));
                    }

                    else if (ev.getTo().equals("Faculty of Science")){
                        img3.setImage(new Image("place/sci.png"));
                        to3.setFill(Color.valueOf("#92b923"));
                        from3.setFill(Color.valueOf("#92b923"));
                        time3.setFill(Color.valueOf("#92b923"));
                        date3.setFill(Color.valueOf("#92b923"));
                        seat3.setFill(Color.valueOf("#92b923"));
                        car3.setFill(Color.valueOf("#92b923"));
                    }

                    else if (ev.getTo().equals("ECC Building")){
                        img3.setImage(new Image("place/ECC.png"));
                        to3.setFill(Color.valueOf("#cf2e51"));
                        from3.setFill(Color.valueOf("#cf2e51"));
                        time3.setFill(Color.valueOf("#cf2e51"));
                        date3.setFill(Color.valueOf("#cf2e51"));
                        seat3.setFill(Color.valueOf("#cf2e51"));
                        car3.setFill(Color.valueOf("#cf2e51"));
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
                 if (ev.getEventID() == 4) {
                    blockPane4.setVisible(true);
                    to4.setText(ev.getTo());
                    from4.setText(ev.getFrom());
                    time4.setText(ev.getTime());
                    date4.setText(ev.getDate());
                    seat4.setText(String.valueOf(ev.getSeatLeft()));
                    car4.setText(ev.getCarType());
                    location4 = ev.getLocationWaiting();

                    if (ev.getTo().equals("E12 Building")){
                        img1.setImage(new Image("place/E12.png"));
                        to4.setFill(Color.valueOf("#1bb64f"));
                        from4.setFill(Color.valueOf("#1bb64f"));
                        time4.setFill(Color.valueOf("#1bb64f"));
                        date4.setFill(Color.valueOf("#1bb64f"));
                        seat4.setFill(Color.valueOf("#1bb64f"));
                        car4.setFill(Color.valueOf("#1bb64f"));
                    }

                    else if (ev.getTo().equals("RNP")){
                        img4.setImage(new Image("place/RNP.png"));
                        to4.setFill(Color.valueOf("#1274d2"));
                        from4.setFill(Color.valueOf("#1274d2"));
                        time4.setFill(Color.valueOf("#1274d2"));
                        date4.setFill(Color.valueOf("#1274d2"));
                        seat4.setFill(Color.valueOf("#1274d2"));
                        car4.setFill(Color.valueOf("#1274d2"));
                    }

                    else if (ev.getTo().equals("A Cafeteria")){
                        img4.setImage(new Image("place/A.png"));
                        to4.setFill(Color.valueOf("#fd9139"));
                        from4.setFill(Color.valueOf("#fd9139"));
                        time4.setFill(Color.valueOf("#fd9139"));
                        date4.setFill(Color.valueOf("#fd9139"));
                        seat4.setFill(Color.valueOf("#fd9139"));
                        car4.setFill(Color.valueOf("#fd9139"));
                    }

                    else if (ev.getTo().equals("Central Library")){
                        img4.setImage(new Image("place/library.png"));
                        to4.setFill(Color.valueOf("#a12fb5"));
                        from4.setFill(Color.valueOf("#a12fb5"));
                        time4.setFill(Color.valueOf("#a12fb5"));
                        date4.setFill(Color.valueOf("#a12fb5"));
                        seat4.setFill(Color.valueOf("#a12fb5"));
                        car4.setFill(Color.valueOf("#a12fb5"));
                    }

                    else if (ev.getTo().equals("Faculty of Science")){
                        img4.setImage(new Image("place/sci.png"));
                        to4.setFill(Color.valueOf("#92b923"));
                        from4.setFill(Color.valueOf("#92b923"));
                        time4.setFill(Color.valueOf("#92b923"));
                        date4.setFill(Color.valueOf("#92b923"));
                        seat4.setFill(Color.valueOf("#92b923"));
                        car4.setFill(Color.valueOf("#92b923"));
                    }

                    else if (ev.getTo().equals("ECC Building")){
                        img4.setImage(new Image("place/ECC.png"));
                        to4.setFill(Color.valueOf("#cf2e51"));
                        from4.setFill(Color.valueOf("#cf2e51"));
                        time4.setFill(Color.valueOf("#cf2e51"));
                        date4.setFill(Color.valueOf("#cf2e51"));
                        seat4.setFill(Color.valueOf("#cf2e51"));
                        car4.setFill(Color.valueOf("#cf2e51"));
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


    @FXML
    void clickBlock1(MouseEvent event) {
        Main.callStage.setScene(Main.detail);
        Main.detailController.toDetail(img1.getImage(), to1.getText(), from1.getText(), time1.getText(),
                date1.getText(), seat1.getText(), car1.getText(),location1);

    }

    @FXML
    void clickBlock2(MouseEvent event) {

    }

    @FXML
    void clickBlock3(MouseEvent event) {

    }

    @FXML
    void clickBlock4(MouseEvent event) {

    }


}
