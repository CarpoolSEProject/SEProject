package EventDetail;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
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
    private Rectangle line1;

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
    private Rectangle line2;

    @FXML
    private Rectangle line3;

    @FXML
    private Rectangle line4;

    @FXML
    private Rectangle line5;


    public void test(Image img, String to, String from, String time, String date, String seat, String car){
        this.img.setImage(img);
        this.to.setText(to);
        this.to.setVisible(true);
        this.from.setText(from);
        this.from.setVisible(true);
        this.time.setText(time);
        this.time.setVisible(true);
        this.date.setText(date);
        this.date.setVisible(true);
        this.seat.setText(seat);
        this.seat.setVisible(true);
        this.car.setText(car);
        this.car.setVisible(true);
    }

}
