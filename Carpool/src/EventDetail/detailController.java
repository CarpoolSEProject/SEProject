package EventDetail;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class detailController {

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
    private Pane aPane;

    @FXML
    public Text to;


    @FXML
    private Text from;

    @FXML
    private Text time;

    @FXML
    private Text car;

    @FXML
    private Text date;

    @FXML
    private Text seat;

    @FXML
    private JFXButton join_A;

    @FXML
    private JFXButton back_A;

    @FXML
    private ImageView img;

    @FXML
    private Text choice1;

    @FXML
    private Text choice2;

    @FXML
    private Text choice3;

    @FXML
    private Text choice4;

    @FXML
    private Text choice5;

    @FXML
    private Rectangle line1;

    @FXML
    private Rectangle line2;

    @FXML
    private Rectangle line3;

    @FXML
    private Rectangle line4;

    @FXML
    private Rectangle line5;

    @FXML
    private Rectangle line_to;

    @FXML
    private Rectangle line_from;

    @FXML
    private Rectangle line_arrive;

    @FXML
    private Rectangle line_seat;

    @FXML
    private Rectangle line_car;


    public void toDetail(Image img, String to, String from, String time, String date, String seat, String car, int[] locationWaiting){
//        set img and other texts
        this.img.setImage(img);
        this.to.setText(to);
        this.from.setText(from);
        this.time.setText(time);
        this.date.setText(date);
        this.seat.setText(seat);
        this.car.setText(car);

        this.to.setVisible(true);
        this.from.setVisible(true);
        this.time.setVisible(true);
        this.date.setVisible(true);
        this.seat.setVisible(true);
        this.car.setVisible(true);

        //        locationWaiting[0] = "wait_KaeKi";
//        locationWaiting[1] = "wait_E12";
//        locationWaiting[2] = "wait_A";
//        locationWaiting[3] = "wait_lib";
//        locationWaiting[4] = "wait_sci";
//        locationWaiting[5] = "wait_prathep";
//        locationWaiting[6] = "wait_ecc";
//        locationWaiting[7] = "wait_RNP";
        //Guess DB return locationwaiting as an array na ja


        if (to == "E12 Building"){
            line_to.setFill(Color.valueOf("#1bb64f"));
            line_from.setFill(Color.valueOf("#1bb64f"));
            line_arrive.setFill(Color.valueOf("#1bb64f"));
            line_car.setFill(Color.valueOf("#1bb64f"));
            line_seat.setFill(Color.valueOf("#1bb64f"));
            line1.setFill(Color.valueOf("#1bb64f"));
            line2.setFill(Color.valueOf("#1bb64f"));
            line3.setFill(Color.valueOf("#1bb64f"));
            line4.setFill(Color.valueOf("#1bb64f"));
            line5.setFill(Color.valueOf("#1bb64f"));
        }
        else if (to == "RNP"){
            line_to.setFill(Color.valueOf("#1274d2"));
            line_from.setFill(Color.valueOf("#1274d2"));
            line_arrive.setFill(Color.valueOf("#1274d2"));
            line_car.setFill(Color.valueOf("#1274d2"));
            line_seat.setFill(Color.valueOf("#1274d2"));
            line1.setFill(Color.valueOf("#1274d2"));
            line2.setFill(Color.valueOf("#1274d2"));
            line3.setFill(Color.valueOf("#1274d2"));
            line4.setFill(Color.valueOf("#1274d2"));
            line5.setFill(Color.valueOf("#1274d2"));
        }
        else if (to == "A Cafeteria"){
            line_to.setFill(Color.valueOf("#fd9139"));
            line_from.setFill(Color.valueOf("#fd9139"));
            line_arrive.setFill(Color.valueOf("#fd9139"));
            line_car.setFill(Color.valueOf("#fd9139"));
            line_seat.setFill(Color.valueOf("#fd9139"));
            line1.setFill(Color.valueOf("#fd9139"));
            line2.setFill(Color.valueOf("#fd9139"));
            line3.setFill(Color.valueOf("#fd9139"));
            line4.setFill(Color.valueOf("#fd9139"));
            line5.setFill(Color.valueOf("#fd9139"));
        }
        else if (to == "Central Library"){
            line_to.setFill(Color.valueOf("#a12fb5"));
            line_from.setFill(Color.valueOf("#a12fb5"));
            line_arrive.setFill(Color.valueOf("#a12fb5"));
            line_car.setFill(Color.valueOf("#a12fb5"));
            line_seat.setFill(Color.valueOf("#a12fb5"));
            line1.setFill(Color.valueOf("#a12fb5"));
            line2.setFill(Color.valueOf("#a12fb5"));
            line3.setFill(Color.valueOf("#a12fb5"));
            line4.setFill(Color.valueOf("#a12fb5"));
            line5.setFill(Color.valueOf("#a12fb5"));
        }
        else if (to == "Faculty of Science"){
            line_to.setFill(Color.valueOf("#92b923"));
            line_from.setFill(Color.valueOf("#92b923"));
            line_arrive.setFill(Color.valueOf("#92b923"));
            line_car.setFill(Color.valueOf("#92b923"));
            line_seat.setFill(Color.valueOf("#92b923"));
            line1.setFill(Color.valueOf("#92b923"));
            line2.setFill(Color.valueOf("#92b923"));
            line3.setFill(Color.valueOf("#92b923"));
            line4.setFill(Color.valueOf("#92b923"));
            line5.setFill(Color.valueOf("#92b923"));
        }
        else if (to == "ECC Building"){
            line_to.setFill(Color.valueOf("#cf2e51"));
            line_from.setFill(Color.valueOf("#cf2e51"));
            line_arrive.setFill(Color.valueOf("#cf2e51"));
            line_car.setFill(Color.valueOf("#cf2e51"));
            line_seat.setFill(Color.valueOf("#cf2e51"));
            line1.setFill(Color.valueOf("#cf2e51"));
            line2.setFill(Color.valueOf("#cf2e51"));
            line3.setFill(Color.valueOf("#cf2e51"));
            line4.setFill(Color.valueOf("#cf2e51"));
            line5.setFill(Color.valueOf("#cf2e51"));
        }
//        else if (to == "Prathep Building"){
//
//
//
//
//        }
//        else if (to == "Kae Ki"){
//
//
//
//
//        }
    }

}
