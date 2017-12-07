package sample.EventDetail;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import sample.Main;

public class SummaryController {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton arrivedButton;

    @FXML
    private JFXButton homeButton;

    @FXML
    private Text TO;

    @FXML
    private Text FROM;

    @FXML
    private Text arrive;

    @FXML
    private Text placeToWait;

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
    private Text place;

    public ConfirmController myParent;
    String seat;
    String car;

    public void toSummary(Image img, String to, String from, String time, String date, String seat, String car, String placeToWait){
        System.out.println("[Summary]");
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
            this.place.setFill(Color.valueOf("#55b4f1"));

        }
        else if (to.equals("E12 Building")){
            TO.setFill(Color.valueOf("#cf2e51"));
            FROM.setFill(Color.valueOf("#cf2e51"));
            arrive.setFill(Color.valueOf("#cf2e51"));
            this.place.setFill(Color.valueOf("#cf2e51"));
        }
        else if (to.equals("A Cafeteria")){
            TO.setFill(Color.valueOf("#fd9139"));
            FROM.setFill(Color.valueOf("#fd9139"));
            arrive.setFill(Color.valueOf("#fd9139"));
            this.place.setFill(Color.valueOf("#fd9139"));
        }
        else if (to.equals("Central Library")){
            TO.setFill(Color.valueOf("#a12fb5"));
            FROM.setFill(Color.valueOf("#a12fb5"));
            arrive.setFill(Color.valueOf("#a12fb5"));
            this.place.setFill(Color.valueOf("#a12fb5"));
        }
        else if (to.equals("Faculty of Science")){
            TO.setFill(Color.valueOf("#92b923"));
            FROM.setFill(Color.valueOf("#92b923"));
            arrive.setFill(Color.valueOf("#92b923"));
            this.place.setFill(Color.valueOf("#92b923"));
        }
        else if (to.equals("Prathep Building")){
            TO.setFill(Color.valueOf("#ffda2e"));
            FROM.setFill(Color.valueOf("#ffda2e"));
            arrive.setFill(Color.valueOf("#ffda2e"));
            this.place.setFill(Color.valueOf("#ffda2e"));
        }
        else if (to.equals("ECC Building")){
            TO.setFill(Color.valueOf("#cf2e51"));
            FROM.setFill(Color.valueOf("#cf2e51"));
            arrive.setFill(Color.valueOf("#cf2e51"));
            this.place.setFill(Color.valueOf("#cf2e51"));
        }
        else if (to.equals("RNP")){
            TO.setFill(Color.valueOf("#1274d2"));
            FROM.setFill(Color.valueOf("#1274d2"));
            arrive.setFill(Color.valueOf("#1274d2"));
            this.place.setFill(Color.valueOf("#1274d2"));
        }

    }

    @FXML
    void arrrived(ActionEvent event) {
        System.out.println("ARRIVED");
        Main.callStage.setScene(Main.feed);
        myParent.removeMe();
    }

    @FXML
    void home(ActionEvent event) {
        System.out.println("HOME");
        Main.callStage.setScene(Main.feed);
        myParent.removeMe();
    }

    public JFXButton getHomeButton() {
        return homeButton;
    }
    public JFXButton getArrivedButton() {
        return arrivedButton;
    }


}
