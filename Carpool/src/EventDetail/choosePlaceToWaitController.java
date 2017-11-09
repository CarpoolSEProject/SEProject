package EventDetail;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class choosePlaceToWaitController {

    @FXML
    private Pane pane;

    @FXML
    private JFXButton okButton;

    @FXML
    private JFXButton backButton;

    @FXML
    private ImageView img;

    @FXML
    private JFXCheckBox choice1;

    @FXML
    private JFXCheckBox choice2;

    @FXML
    private JFXCheckBox choice3;

    @FXML
    private JFXCheckBox choice4;

    @FXML
    private JFXCheckBox choice5;

    String to;
    String from;
    String time;
    String date;
    String seat;
    String car;
    String[] choicePlaceToWait;

    public void toChoosePlaceToWait(Image img, String to, String from, String time, String date, String seat, String car, String[] choicePlaceToWait){

        this.to = to;
        this.from = from;
        this.time = time;
        this.date = date;
        this.seat = seat;
        this.car = car;
        this.choicePlaceToWait = choicePlaceToWait;

        this.img.setImage(img);

        int countSize = choicePlaceToWait.length;

        if (countSize == 1){
            choice1.setText(choicePlaceToWait[0]);
            choice1.setVisible(true);
        }
        else if (countSize == 2){
            choice1.setText(choicePlaceToWait[0]);
            choice2.setText(choicePlaceToWait[1]);
            choice1.setVisible(true);
            choice2.setVisible(true);
        }
        else if (countSize == 3){
            choice1.setText(choicePlaceToWait[0]);
            choice2.setText(choicePlaceToWait[1]);
            choice3.setText(choicePlaceToWait[2]);
            choice1.setVisible(true);
            choice2.setVisible(true);
            choice3.setVisible(true);

        }
        else if (countSize == 4){
            choice1.setText(choicePlaceToWait[0]);
            choice2.setText(choicePlaceToWait[1]);
            choice3.setText(choicePlaceToWait[2]);
            choice4.setText(choicePlaceToWait[3]);
            choice1.setVisible(true);
            choice2.setVisible(true);
            choice3.setVisible(true);
            choice4.setVisible(true);
        }
        else if (countSize == 5){
            choice1.setText(choicePlaceToWait[0]);
            choice2.setText(choicePlaceToWait[1]);
            choice3.setText(choicePlaceToWait[2]);
            choice4.setText(choicePlaceToWait[3]);
            choice5.setText(choicePlaceToWait[3]);
            choice1.setVisible(true);
            choice2.setVisible(true);
            choice3.setVisible(true);
            choice4.setVisible(true);
            choice5.setVisible(true);
        }



    }





    @FXML
    void back(ActionEvent event) {

    }

    @FXML
    void ok(ActionEvent event) {

    }


}
