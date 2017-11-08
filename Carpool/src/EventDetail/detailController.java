package EventDetail;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import sample.Main;

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

    @FXML
    private JFXButton joinButton;

    @FXML
    private JFXButton backButton;

    String[] choicePlaceToWait;


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

        //locationWaiting[0] = "wait_KaeKi";
//        locationWaiting[1] = "wait_E12";
//        locationWaiting[2] = "wait_A";
//        locationWaiting[3] = "wait_lib";
//        locationWaiting[4] = "wait_sci";
//        locationWaiting[5] = "wait_prathep";
//        locationWaiting[6] = "wait_ecc";
//        locationWaiting[7] = "wait_RNP";
        //Guess DB return locationwaiting as an array na ja
        //Ex. locationWaiting = [1,0,1,0,0,0,0,0]


        // count number of available location waiting
        int countSize = 0;

        for (int i = 0; i< 8; i++){
            if (locationWaiting[i] == 1){
                countSize++;
                if (i == 0){
                    choice1.setText("Kae Ki");
                    choice2.setText("Kae Ki");
                    choice3.setText("Kae Ki");
                    choice4.setText("Kae Ki");
                    choice5.setText("Kae Ki");

                }
                else if (i == 1){
                    choice1.setText("E12 Building");
                    choice2.setText("E12 Building");
                    choice3.setText("E12 Building");
                    choice4.setText("E12 Building");
                    choice5.setText("E12 Building");
                }
                else if (i == 2){
                    choice1.setText("A Cafeteria");
                    choice2.setText("A Cafeteria");
                    choice3.setText("A Cafeteria");
                    choice4.setText("A Cafeteria");
                    choice5.setText("A Cafeteria");
                }
                else if (i == 3){
                    choice1.setText("Central Library");
                    choice2.setText("Central Library");
                    choice3.setText("Central Library");
                    choice4.setText("Central Library");
                    choice5.setText("Central Library");
                }
                else if (i == 4){
                    choice1.setText("Faculty of Science");
                    choice2.setText("Faculty of Science");
                    choice3.setText("Faculty of Science");
                    choice4.setText("Faculty of Science");
                    choice5.setText("Faculty of Science");
                }
                else if (i == 5){
                    choice1.setText("Prathep Building");
                    choice2.setText("Prathep Building");
                    choice3.setText("Prathep Building");
                    choice4.setText("Prathep Building");
                    choice5.setText("Prathep Building");
                }
                else if (i == 6){
                    choice1.setText("ECC Building");
                    choice2.setText("ECC Building");
                    choice3.setText("ECC Building");
                    choice4.setText("ECC Building");
                    choice5.setText("ECC Building");
                }
                else {
                    choice1.setText("RNP");
                    choice2.setText("RNP");
                    choice3.setText("RNP");
                    choice4.setText("RNP");
                    choice5.setText("RNP");
                }

            }
        }



        // set visible to choice of place to wait
        if (countSize == 1){
            choice1.setVisible(true);
            line1.setVisible(true);
            choicePlaceToWait = new String[1];
            choicePlaceToWait[0] = choice1.getText();

        }
        else if (countSize == 2){
            choice1.setVisible(true);
            choice2.setVisible(true);
            line1.setVisible(true);
            line2.setVisible(true);
            choicePlaceToWait = new String[2];
            choicePlaceToWait[0] = choice1.getText();
            choicePlaceToWait[1] = choice2.getText();
        }
        else if (countSize == 3){
            choice1.setVisible(true);
            choice2.setVisible(true);
            choice3.setVisible(true);
            line1.setVisible(true);
            line2.setVisible(true);
            line3.setVisible(true);
            choicePlaceToWait = new String[3];
            choicePlaceToWait[0] = choice1.getText();
            choicePlaceToWait[1] = choice2.getText();
            choicePlaceToWait[2] = choice3.getText();
        }
        else if (countSize == 4){
            choice1.setVisible(true);
            choice2.setVisible(true);
            choice3.setVisible(true);
            choice4.setVisible(true);
            line1.setVisible(true);
            line2.setVisible(true);
            line3.setVisible(true);
            line4.setVisible(true);
            choicePlaceToWait = new String[4];
            choicePlaceToWait[0] = choice1.getText();
            choicePlaceToWait[1] = choice2.getText();
            choicePlaceToWait[2] = choice3.getText();
            choicePlaceToWait[3] = choice4.getText();
        }
        else if (countSize == 5){
            choice1.setVisible(true);
            choice2.setVisible(true);
            choice3.setVisible(true);
            choice4.setVisible(true);
            choice5.setVisible(true);
            line1.setVisible(true);
            line2.setVisible(true);
            line3.setVisible(true);
            line4.setVisible(true);
            line5.setVisible(true);
            choicePlaceToWait = new String[5];
            choicePlaceToWait[0] = choice1.getText();
            choicePlaceToWait[1] = choice2.getText();
            choicePlaceToWait[2] = choice3.getText();
            choicePlaceToWait[3] = choice4.getText();
            choicePlaceToWait[4] = choice5.getText();
        }

    }


    @FXML
    void back(ActionEvent event) {
        Main.callStage.setScene(Main.feed);
    }

    @FXML
    void join(ActionEvent event) {
        Main.callStage.setScene(Main.choosePlacetoWait);
        Main.choosePlaceToWaitController.toChoosePlaceToWait(img.getImage(), to.getText(), from.getText(), time.getText(),
                date.getText(), seat.getText(), car.getText(),choicePlaceToWait);

    }


}
