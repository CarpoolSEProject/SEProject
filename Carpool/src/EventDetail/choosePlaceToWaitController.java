package EventDetail;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import sample.Main;

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

    @FXML
    private Text warning;

    String to;
    String from;
    String time;
    String date;
    String seat;
    String car;
    String[] choicePlaceToWait;
    String placeToWait;

    public detailController choosePlaceParent;

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


    setColor();

    }

    public void setColor (){
        if (to.equals("Kae Ki")){
            choice1.setTextFill(Color.valueOf("#55b4f1"));
            choice2.setTextFill(Color.valueOf("#55b4f1"));
            choice3.setTextFill(Color.valueOf("#55b4f1"));
            choice4.setTextFill(Color.valueOf("#55b4f1"));
            choice5.setTextFill(Color.valueOf("#55b4f1"));
        }
        else if (to.equals("E12 Building")){
            choice1.setTextFill(Color.valueOf("#cf2e51"));
            choice2.setTextFill(Color.valueOf("#cf2e51"));
            choice3.setTextFill(Color.valueOf("#cf2e51"));
            choice4.setTextFill(Color.valueOf("#cf2e51"));
            choice5.setTextFill(Color.valueOf("#cf2e51"));
        }
        else if (to.equals("A Cafeteria")){
            choice1.setTextFill(Color.valueOf("#fd9139"));
            choice2.setTextFill(Color.valueOf("#fd9139"));
            choice3.setTextFill(Color.valueOf("#fd9139"));
            choice4.setTextFill(Color.valueOf("#fd9139"));
            choice5.setTextFill(Color.valueOf("#fd9139"));
        }
        else if (to.equals("Central Library")){
            choice1.setTextFill(Color.valueOf("#a12fb5"));
            choice2.setTextFill(Color.valueOf("#a12fb5"));
            choice3.setTextFill(Color.valueOf("#a12fb5"));
            choice4.setTextFill(Color.valueOf("#a12fb5"));
            choice5.setTextFill(Color.valueOf("#a12fb5"));
        }
        else if (to.equals("Faculty of Science")){
            choice1.setTextFill(Color.valueOf("#92b923"));
            choice2.setTextFill(Color.valueOf("#92b923"));
            choice3.setTextFill(Color.valueOf("#92b923"));
            choice4.setTextFill(Color.valueOf("#92b923"));
            choice5.setTextFill(Color.valueOf("#92b923"));
        }
        else if (to.equals("Prathep Building")){
            choice1.setTextFill(Color.valueOf("#ffda2e"));
            choice2.setTextFill(Color.valueOf("#ffda2e"));
            choice3.setTextFill(Color.valueOf("#ffda2e"));
            choice4.setTextFill(Color.valueOf("#ffda2e"));
            choice5.setTextFill(Color.valueOf("#ffda2e"));
        }
        else if (to.equals("ECC Building")){
            choice1.setTextFill(Color.valueOf("#cf2e51"));
            choice2.setTextFill(Color.valueOf("#cf2e51"));
            choice3.setTextFill(Color.valueOf("#cf2e51"));
            choice4.setTextFill(Color.valueOf("#cf2e51"));
            choice5.setTextFill(Color.valueOf("#cf2e51"));
        }
        else if (to.equals("RNP")){
            choice1.setTextFill(Color.valueOf("#1274d2"));
            choice2.setTextFill(Color.valueOf("#1274d2"));
            choice3.setTextFill(Color.valueOf("#1274d2"));
            choice4.setTextFill(Color.valueOf("#1274d2"));
            choice5.setTextFill(Color.valueOf("#1274d2"));
        }
    }


    @FXML
    void back(ActionEvent event) {
        choosePlaceParent.removeMe();
    }

    @FXML
    void ok(ActionEvent event) {

        JFXCheckBox[] arrCount = {choice1, choice2, choice3, choice4, choice5};
        int count = 0;
        for (int i = 0; i<5; i++){
            if (arrCount[i].isSelected() == true) {
                count++;
                placeToWait = arrCount[i].getText();
            }
        }
        // check if no choice is selected or select more than one
        if (count == 0 || count > 1){
            warning.setVisible(true);
        }

        else {
            pane.getChildren().add(Main.confirm.getRoot());
            Main.confirmController.toConfirm(img.getImage(), to, from, time,
                    date, seat, car, placeToWait);
        }

        Main.confirmController.confirmParent = this;

    }

    public void removeMe() {
        pane.getChildren().remove(Main.confirm.getRoot());
    }


}
