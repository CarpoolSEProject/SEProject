package EventDetail;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import sample.Main;

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

    public choosePlaceToWaitController confirmParent;


    public void toConfirm(Image img, String to, String from, String time, String date, String seat, String car, String placeToWait){
        this.img.setImage(img);
        this.to.setText(to);
        this.from.setText(from);
        this.time.setText(time);
        this.date.setText(date);
        this.placeToWait.setText(placeToWait);

        this.to.setVisible(true);
        this.from.setVisible(true);
        this.time.setVisible(true);
        this.to.setVisible(true);
        this.date.setVisible(true);
        this.placeToWait.setVisible(true);

    }


    @FXML
    void back(ActionEvent event) {
        confirmParent.removeMe();
    }

    @FXML
    void confirm(ActionEvent event) {

        Main.summaryController.myParent = this;


    }
}
