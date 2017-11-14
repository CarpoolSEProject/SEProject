package sample;

import CarpoolDB.Database;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class passengerProfileController {

    @FXML
    private Text navBar_home;

    @FXML
    private Text navBar_profile;

    @FXML
    private Text navBar_logout;

    @FXML
    private Pane block1;

    @FXML
    private ImageView img1;

    @FXML
    private Text TO_1;

    @FXML
    private Text FROM_1;

    @FXML
    private Text Arrive_1;

    @FXML
    private Text date1;

    @FXML
    private Text time1;

    @FXML
    private Text from1;

    @FXML
    private Text to1;

    @FXML
    private Pane block2;

    @FXML
    private ImageView img2;

    @FXML
    private Text TO_2;

    @FXML
    private Text FROM_2;

    @FXML
    private Text Arrive_2;

    @FXML
    private Text date2;

    @FXML
    private Text time2;

    @FXML
    private Text from2;

    @FXML
    private Text to2;

    @FXML
    private Pane block3;

    @FXML
    private ImageView img3;

    @FXML
    private Text TO_3;

    @FXML
    private Text FROM_3;

    @FXML
    private Text Arrive_3;

    @FXML
    private Text date3;

    @FXML
    private Text time3;

    @FXML
    private Text from3;

    @FXML
    private Text to3;

    @FXML
    private Pane block4;

    @FXML
    private ImageView img4;

    @FXML
    private Text TO_4;

    @FXML
    private Text FROM_4;

    @FXML
    private Text Arrive_4;

    @FXML
    private Text date4;

    @FXML
    private Text time4;

    @FXML
    private Text from4;

    @FXML
    private Text to4;

    @FXML
    void Home(MouseEvent event) {
        Main.callStage.setScene(Main.feed);
    }

    @FXML
    void LogOut(MouseEvent event) {
        Main.callStage.setScene(Main.sample);

    }

    @FXML
    void Profile(MouseEvent event) {
        Main.callStage.setScene(Main.passengerProfile);

    }

    @FXML
    public void initialize() {
        EntityManager em = Database.getConnection().createEntityManager();
        TypedQuery<JoinEvent> pull = em.createQuery("SELECT e FROM JoinEvent e", JoinEvent.class);
        for (JoinEvent ev : pull.getResultList()) {
            if (ev.getEvent().getEventID() == 1) {
                block1.setVisible(true);
                to1.setText(ev.getEvent().getTo());
                from1.setText(ev.getEvent().getFrom());
                time1.setText(ev.getEvent().getTime());
                date1.setText(ev.getEvent().getDate());

                if (ev.getEvent().getTo().equals("E12 Building")) {
                    img1.setImage(new Image("place/E12.png"));
                    TO_1.setFill(Color.valueOf("#1bb64f"));
                    FROM_1.setFill(Color.valueOf("#1bb64f"));
                    Arrive_1.setFill(Color.valueOf("#1bb64f"));
                } else if (ev.getEvent().getTo().equals("RNP")) {
                    img1.setImage(new Image("place/RNP.png"));
                    TO_1.setFill(Color.valueOf("#1274d2"));
                    FROM_1.setFill(Color.valueOf("#1274d2"));
                    Arrive_1.setFill(Color.valueOf("#1274d2"));
                } else if (ev.getEvent().getTo().equals("A Cafeteria")) {
                    img1.setImage(new Image("place/A.png"));
                    TO_1.setFill(Color.valueOf("#fd9139"));
                    FROM_1.setFill(Color.valueOf("#fd9139"));
                    Arrive_1.setFill(Color.valueOf("#fd9139"));
                } else if (ev.getEvent().getTo().equals("Central Library")) {
                    img1.setImage(new Image("place/library.png"));
                    TO_1.setFill(Color.valueOf("#a12fb5"));
                    FROM_1.setFill(Color.valueOf("#a12fb5"));
                    Arrive_1.setFill(Color.valueOf("#a12fb5"));
                } else if (ev.getEvent().getTo().equals("Faculty of Science")) {
                    img1.setImage(new Image("place/sci.png"));
                    TO_1.setFill(Color.valueOf("#92b923"));
                    FROM_1.setFill(Color.valueOf("#92b923"));
                    Arrive_1.setFill(Color.valueOf("#92b923"));
                } else if (ev.getEvent().getTo().equals("ECC Building")) {
                    img1.setImage(new Image("place/ECC.png"));
                    TO_1.setFill(Color.valueOf("#cf2e51"));
                    FROM_1.setFill(Color.valueOf("#cf2e51"));
                    Arrive_1.setFill(Color.valueOf("#cf2e51"));
                } else if (ev.getEvent().getTo().equals("Prathep Building")) {
                    img1.setImage(new Image("place/prathep.png"));
                    TO_1.setFill(Color.valueOf("#ffda2e"));
                    FROM_1.setFill(Color.valueOf("#ffda2e"));
                    Arrive_1.setFill(Color.valueOf("#ffda2e"));
                } else if (ev.getEvent().getTo().equals("Kae Ki")) {
                    img1.setImage(new Image("place/kaeki.png"));
                    TO_1.setFill(Color.valueOf("#55b4f1"));
                    FROM_1.setFill(Color.valueOf("#55b4f1"));
                    Arrive_1.setFill(Color.valueOf("#55b4f1"));
                }
            } else if (ev.getEvent().getEventID() == 2) {
                block2.setVisible(true);
                to2.setText(ev.getEvent().getTo());
                from2.setText(ev.getEvent().getFrom());
                time2.setText(ev.getEvent().getTime());
                date2.setText(ev.getEvent().getDate());

                if (ev.getEvent().getTo().equals("E12 Building")) {
                    img2.setImage(new Image("place/E12.png"));
                    TO_2.setFill(Color.valueOf("#1bb64f"));
                    FROM_2.setFill(Color.valueOf("#1bb64f"));
                    Arrive_2.setFill(Color.valueOf("#1bb64f"));
                } else if (ev.getEvent().getTo().equals("RNP")) {
                    img2.setImage(new Image("place/RNP.png"));
                    TO_2.setFill(Color.valueOf("#1274d2"));
                    FROM_2.setFill(Color.valueOf("#1274d2"));
                    Arrive_2.setFill(Color.valueOf("#1274d2"));
                } else if (ev.getEvent().getTo().equals("A Cafeteria")) {
                    img2.setImage(new Image("place/A.png"));
                    TO_2.setFill(Color.valueOf("#fd9139"));
                    FROM_2.setFill(Color.valueOf("#fd9139"));
                    Arrive_2.setFill(Color.valueOf("#fd9139"));
                } else if (ev.getEvent().getTo().equals("Central Library")) {
                    img2.setImage(new Image("place/library.png"));
                    TO_2.setFill(Color.valueOf("#a12fb5"));
                    FROM_2.setFill(Color.valueOf("#a12fb5"));
                    Arrive_2.setFill(Color.valueOf("#a12fb5"));
                } else if (ev.getEvent().getTo().equals("Faculty of Science")) {
                    img2.setImage(new Image("place/sci.png"));
                    TO_2.setFill(Color.valueOf("#92b923"));
                    FROM_2.setFill(Color.valueOf("#92b923"));
                    Arrive_2.setFill(Color.valueOf("#92b923"));
                } else if (ev.getEvent().getTo().equals("ECC Building")) {
                    img2.setImage(new Image("place/ECC.png"));
                    TO_2.setFill(Color.valueOf("#cf2e51"));
                    FROM_2.setFill(Color.valueOf("#cf2e51"));
                    Arrive_2.setFill(Color.valueOf("#cf2e51"));
                } else if (ev.getEvent().getTo().equals("Prathep Building")) {
                    img2.setImage(new Image("place/prathep.png"));
                    TO_2.setFill(Color.valueOf("#ffda2e"));
                    FROM_2.setFill(Color.valueOf("#ffda2e"));
                    Arrive_2.setFill(Color.valueOf("#ffda2e"));
                } else if (ev.getEvent().getTo().equals("Kae Ki")) {
                    img2.setImage(new Image("place/kaeki.png"));
                    TO_2.setFill(Color.valueOf("#55b4f1"));
                    FROM_2.setFill(Color.valueOf("#55b4f1"));
                    Arrive_2.setFill(Color.valueOf("#55b4f1"));
                }
            } else if (ev.getEvent().getEventID() == 3) {
                block3.setVisible(true);
                to3.setText(ev.getEvent().getTo());
                from3.setText(ev.getEvent().getFrom());
                time3.setText(ev.getEvent().getTime());
                date3.setText(ev.getEvent().getDate());

                if (ev.getEvent().getTo().equals("E12 Building")) {
                    img3.setImage(new Image("place/E12.png"));
                    TO_3.setFill(Color.valueOf("#1bb64f"));
                    FROM_3.setFill(Color.valueOf("#1bb64f"));
                    Arrive_3.setFill(Color.valueOf("#1bb64f"));
                } else if (ev.getEvent().getTo().equals("RNP")) {
                    img3.setImage(new Image("place/RNP.png"));
                    TO_3.setFill(Color.valueOf("#1274d2"));
                    FROM_3.setFill(Color.valueOf("#1274d2"));
                    Arrive_3.setFill(Color.valueOf("#1274d2"));
                } else if (ev.getEvent().getTo().equals("A Cafeteria")) {
                    img3.setImage(new Image("place/A.png"));
                    TO_3.setFill(Color.valueOf("#fd9139"));
                    FROM_3.setFill(Color.valueOf("#fd9139"));
                    Arrive_3.setFill(Color.valueOf("#fd9139"));
                } else if (ev.getEvent().getTo().equals("Central Library")) {
                    img3.setImage(new Image("place/library.png"));
                    TO_3.setFill(Color.valueOf("#a12fb5"));
                    FROM_3.setFill(Color.valueOf("#a12fb5"));
                    Arrive_3.setFill(Color.valueOf("#a12fb5"));
                } else if (ev.getEvent().getTo().equals("Faculty of Science")) {
                    img3.setImage(new Image("place/sci.png"));
                    TO_3.setFill(Color.valueOf("#92b923"));
                    FROM_3.setFill(Color.valueOf("#92b923"));
                    Arrive_3.setFill(Color.valueOf("#92b923"));
                } else if (ev.getEvent().getTo().equals("ECC Building")) {
                    img3.setImage(new Image("place/ECC.png"));
                    TO_3.setFill(Color.valueOf("#cf2e51"));
                    FROM_3.setFill(Color.valueOf("#cf2e51"));
                    Arrive_3.setFill(Color.valueOf("#cf2e51"));
                } else if (ev.getEvent().getTo().equals("Prathep Building")) {
                    img3.setImage(new Image("place/prathep.png"));
                    TO_3.setFill(Color.valueOf("#ffda2e"));
                    FROM_3.setFill(Color.valueOf("#ffda2e"));
                    Arrive_3.setFill(Color.valueOf("#ffda2e"));
                } else if (ev.getEvent().getTo().equals("Kae Ki")) {
                    img3.setImage(new Image("place/kaeki.png"));
                    TO_3.setFill(Color.valueOf("#55b4f1"));
                    FROM_3.setFill(Color.valueOf("#55b4f1"));
                    Arrive_3.setFill(Color.valueOf("#55b4f1"));
                }
            } else if (ev.getEvent().getEventID() == 4) {
                block4.setVisible(true);
                to4.setText(ev.getEvent().getTo());
                from4.setText(ev.getEvent().getFrom());
                time4.setText(ev.getEvent().getTime());
                date4.setText(ev.getEvent().getDate());

                if (ev.getEvent().getTo().equals("E12 Building")) {
                    img4.setImage(new Image("place/E12.png"));
                    TO_4.setFill(Color.valueOf("#1bb64f"));
                    FROM_4.setFill(Color.valueOf("#1bb64f"));
                    Arrive_4.setFill(Color.valueOf("#1bb64f"));
                } else if (ev.getEvent().getTo().equals("RNP")) {
                    img4.setImage(new Image("place/RNP.png"));
                    TO_4.setFill(Color.valueOf("#1274d2"));
                    FROM_4.setFill(Color.valueOf("#1274d2"));
                    Arrive_4.setFill(Color.valueOf("#1274d2"));
                } else if (ev.getEvent().getTo().equals("A Cafeteria")) {
                    img4.setImage(new Image("place/A.png"));
                    TO_4.setFill(Color.valueOf("#fd9139"));
                    FROM_4.setFill(Color.valueOf("#fd9139"));
                    Arrive_4.setFill(Color.valueOf("#fd9139"));
                } else if (ev.getEvent().getTo().equals("Central Library")) {
                    img4.setImage(new Image("place/library.png"));
                    TO_4.setFill(Color.valueOf("#a12fb5"));
                    FROM_4.setFill(Color.valueOf("#a12fb5"));
                    Arrive_4.setFill(Color.valueOf("#a12fb5"));
                } else if (ev.getEvent().getTo().equals("Faculty of Science")) {
                    img4.setImage(new Image("place/sci.png"));
                    TO_4.setFill(Color.valueOf("#92b923"));
                    FROM_4.setFill(Color.valueOf("#92b923"));
                    Arrive_4.setFill(Color.valueOf("#92b923"));
                } else if (ev.getEvent().getTo().equals("ECC Building")) {
                    img4.setImage(new Image("place/ECC.png"));
                    TO_4.setFill(Color.valueOf("#cf2e51"));
                    FROM_4.setFill(Color.valueOf("#cf2e51"));
                    Arrive_4.setFill(Color.valueOf("#cf2e51"));
                } else if (ev.getEvent().getTo().equals("Prathep Building")) {
                    img4.setImage(new Image("place/prathep.png"));
                    TO_4.setFill(Color.valueOf("#ffda2e"));
                    FROM_4.setFill(Color.valueOf("#ffda2e"));
                    Arrive_4.setFill(Color.valueOf("#ffda2e"));
                } else if (ev.getEvent().getTo().equals("Kae Ki")) {
                    img4.setImage(new Image("place/kaeki.png"));
                    TO_4.setFill(Color.valueOf("#55b4f1"));
                    FROM_4.setFill(Color.valueOf("#55b4f1"));
                    Arrive_4.setFill(Color.valueOf("#55b4f1"));
                }
            }


        }
    }

    public void refresh() {
        EntityManager em = Database.getConnection().createEntityManager();
        TypedQuery<JoinEvent> pull = em.createQuery("SELECT e FROM JoinEvent e", JoinEvent.class);
        for (JoinEvent ev : pull.getResultList()) {
            if (ev.getEvent().getEventID() == 1) {
                block1.setVisible(true);
                to1.setText(ev.getEvent().getTo());
                from1.setText(ev.getEvent().getFrom());
                time1.setText(ev.getEvent().getTime());
                date1.setText(ev.getEvent().getDate());

                if (ev.getEvent().getTo().equals("E12 Building")) {
                    img1.setImage(new Image("place/E12.png"));
                    TO_1.setFill(Color.valueOf("#1bb64f"));
                    FROM_1.setFill(Color.valueOf("#1bb64f"));
                    Arrive_1.setFill(Color.valueOf("#1bb64f"));
                } else if (ev.getEvent().getTo().equals("RNP")) {
                    img1.setImage(new Image("place/RNP.png"));
                    TO_1.setFill(Color.valueOf("#1274d2"));
                    FROM_1.setFill(Color.valueOf("#1274d2"));
                    Arrive_1.setFill(Color.valueOf("#1274d2"));
                } else if (ev.getEvent().getTo().equals("A Cafeteria")) {
                    img1.setImage(new Image("place/A.png"));
                    TO_1.setFill(Color.valueOf("#fd9139"));
                    FROM_1.setFill(Color.valueOf("#fd9139"));
                    Arrive_1.setFill(Color.valueOf("#fd9139"));
                } else if (ev.getEvent().getTo().equals("Central Library")) {
                    img1.setImage(new Image("place/library.png"));
                    TO_1.setFill(Color.valueOf("#a12fb5"));
                    FROM_1.setFill(Color.valueOf("#a12fb5"));
                    Arrive_1.setFill(Color.valueOf("#a12fb5"));
                } else if (ev.getEvent().getTo().equals("Faculty of Science")) {
                    img1.setImage(new Image("place/sci.png"));
                    TO_1.setFill(Color.valueOf("#92b923"));
                    FROM_1.setFill(Color.valueOf("#92b923"));
                    Arrive_1.setFill(Color.valueOf("#92b923"));
                } else if (ev.getEvent().getTo().equals("ECC Building")) {
                    img1.setImage(new Image("place/ECC.png"));
                    TO_1.setFill(Color.valueOf("#cf2e51"));
                    FROM_1.setFill(Color.valueOf("#cf2e51"));
                    Arrive_1.setFill(Color.valueOf("#cf2e51"));
                } else if (ev.getEvent().getTo().equals("Prathep Building")) {
                    img1.setImage(new Image("place/prathep.png"));
                    TO_1.setFill(Color.valueOf("#ffda2e"));
                    FROM_1.setFill(Color.valueOf("#ffda2e"));
                    Arrive_1.setFill(Color.valueOf("#ffda2e"));
                } else if (ev.getEvent().getTo().equals("Kae Ki")) {
                    img1.setImage(new Image("place/kaeki.png"));
                    TO_1.setFill(Color.valueOf("#55b4f1"));
                    FROM_1.setFill(Color.valueOf("#55b4f1"));
                    Arrive_1.setFill(Color.valueOf("#55b4f1"));
                }
            } else if (ev.getEvent().getEventID() == 2) {
                block2.setVisible(true);
                to2.setText(ev.getEvent().getTo());
                from2.setText(ev.getEvent().getFrom());
                time2.setText(ev.getEvent().getTime());
                date2.setText(ev.getEvent().getDate());

                if (ev.getEvent().getTo().equals("E12 Building")) {
                    img2.setImage(new Image("place/E12.png"));
                    TO_2.setFill(Color.valueOf("#1bb64f"));
                    FROM_2.setFill(Color.valueOf("#1bb64f"));
                    Arrive_2.setFill(Color.valueOf("#1bb64f"));
                } else if (ev.getEvent().getTo().equals("RNP")) {
                    img2.setImage(new Image("place/RNP.png"));
                    TO_2.setFill(Color.valueOf("#1274d2"));
                    FROM_2.setFill(Color.valueOf("#1274d2"));
                    Arrive_2.setFill(Color.valueOf("#1274d2"));
                } else if (ev.getEvent().getTo().equals("A Cafeteria")) {
                    img2.setImage(new Image("place/A.png"));
                    TO_2.setFill(Color.valueOf("#fd9139"));
                    FROM_2.setFill(Color.valueOf("#fd9139"));
                    Arrive_2.setFill(Color.valueOf("#fd9139"));
                } else if (ev.getEvent().getTo().equals("Central Library")) {
                    img2.setImage(new Image("place/library.png"));
                    TO_2.setFill(Color.valueOf("#a12fb5"));
                    FROM_2.setFill(Color.valueOf("#a12fb5"));
                    Arrive_2.setFill(Color.valueOf("#a12fb5"));
                } else if (ev.getEvent().getTo().equals("Faculty of Science")) {
                    img2.setImage(new Image("place/sci.png"));
                    TO_2.setFill(Color.valueOf("#92b923"));
                    FROM_2.setFill(Color.valueOf("#92b923"));
                    Arrive_2.setFill(Color.valueOf("#92b923"));
                } else if (ev.getEvent().getTo().equals("ECC Building")) {
                    img2.setImage(new Image("place/ECC.png"));
                    TO_2.setFill(Color.valueOf("#cf2e51"));
                    FROM_2.setFill(Color.valueOf("#cf2e51"));
                    Arrive_2.setFill(Color.valueOf("#cf2e51"));
                } else if (ev.getEvent().getTo().equals("Prathep Building")) {
                    img2.setImage(new Image("place/prathep.png"));
                    TO_2.setFill(Color.valueOf("#ffda2e"));
                    FROM_2.setFill(Color.valueOf("#ffda2e"));
                    Arrive_2.setFill(Color.valueOf("#ffda2e"));
                } else if (ev.getEvent().getTo().equals("Kae Ki")) {
                    img2.setImage(new Image("place/kaeki.png"));
                    TO_2.setFill(Color.valueOf("#55b4f1"));
                    FROM_2.setFill(Color.valueOf("#55b4f1"));
                    Arrive_2.setFill(Color.valueOf("#55b4f1"));
                }
            } else if (ev.getEvent().getEventID() == 3) {
                block3.setVisible(true);
                to3.setText(ev.getEvent().getTo());
                from3.setText(ev.getEvent().getFrom());
                time3.setText(ev.getEvent().getTime());
                date3.setText(ev.getEvent().getDate());

                if (ev.getEvent().getTo().equals("E12 Building")) {
                    img3.setImage(new Image("place/E12.png"));
                    TO_3.setFill(Color.valueOf("#1bb64f"));
                    FROM_3.setFill(Color.valueOf("#1bb64f"));
                    Arrive_3.setFill(Color.valueOf("#1bb64f"));
                } else if (ev.getEvent().getTo().equals("RNP")) {
                    img3.setImage(new Image("place/RNP.png"));
                    TO_3.setFill(Color.valueOf("#1274d2"));
                    FROM_3.setFill(Color.valueOf("#1274d2"));
                    Arrive_3.setFill(Color.valueOf("#1274d2"));
                } else if (ev.getEvent().getTo().equals("A Cafeteria")) {
                    img3.setImage(new Image("place/A.png"));
                    TO_3.setFill(Color.valueOf("#fd9139"));
                    FROM_3.setFill(Color.valueOf("#fd9139"));
                    Arrive_3.setFill(Color.valueOf("#fd9139"));
                } else if (ev.getEvent().getTo().equals("Central Library")) {
                    img3.setImage(new Image("place/library.png"));
                    TO_3.setFill(Color.valueOf("#a12fb5"));
                    FROM_3.setFill(Color.valueOf("#a12fb5"));
                    Arrive_3.setFill(Color.valueOf("#a12fb5"));
                } else if (ev.getEvent().getTo().equals("Faculty of Science")) {
                    img3.setImage(new Image("place/sci.png"));
                    TO_3.setFill(Color.valueOf("#92b923"));
                    FROM_3.setFill(Color.valueOf("#92b923"));
                    Arrive_3.setFill(Color.valueOf("#92b923"));
                } else if (ev.getEvent().getTo().equals("ECC Building")) {
                    img3.setImage(new Image("place/ECC.png"));
                    TO_3.setFill(Color.valueOf("#cf2e51"));
                    FROM_3.setFill(Color.valueOf("#cf2e51"));
                    Arrive_3.setFill(Color.valueOf("#cf2e51"));
                } else if (ev.getEvent().getTo().equals("Prathep Building")) {
                    img3.setImage(new Image("place/prathep.png"));
                    TO_3.setFill(Color.valueOf("#ffda2e"));
                    FROM_3.setFill(Color.valueOf("#ffda2e"));
                    Arrive_3.setFill(Color.valueOf("#ffda2e"));
                } else if (ev.getEvent().getTo().equals("Kae Ki")) {
                    img3.setImage(new Image("place/kaeki.png"));
                    TO_3.setFill(Color.valueOf("#55b4f1"));
                    FROM_3.setFill(Color.valueOf("#55b4f1"));
                    Arrive_3.setFill(Color.valueOf("#55b4f1"));
                }
            } else if (ev.getEvent().getEventID() == 4) {
                block4.setVisible(true);
                to4.setText(ev.getEvent().getTo());
                from4.setText(ev.getEvent().getFrom());
                time4.setText(ev.getEvent().getTime());
                date4.setText(ev.getEvent().getDate());

                if (ev.getEvent().getTo().equals("E12 Building")) {
                    img4.setImage(new Image("place/E12.png"));
                    TO_4.setFill(Color.valueOf("#1bb64f"));
                    FROM_4.setFill(Color.valueOf("#1bb64f"));
                    Arrive_4.setFill(Color.valueOf("#1bb64f"));
                } else if (ev.getEvent().getTo().equals("RNP")) {
                    img4.setImage(new Image("place/RNP.png"));
                    TO_4.setFill(Color.valueOf("#1274d2"));
                    FROM_4.setFill(Color.valueOf("#1274d2"));
                    Arrive_4.setFill(Color.valueOf("#1274d2"));
                } else if (ev.getEvent().getTo().equals("A Cafeteria")) {
                    img4.setImage(new Image("place/A.png"));
                    TO_4.setFill(Color.valueOf("#fd9139"));
                    FROM_4.setFill(Color.valueOf("#fd9139"));
                    Arrive_4.setFill(Color.valueOf("#fd9139"));
                } else if (ev.getEvent().getTo().equals("Central Library")) {
                    img4.setImage(new Image("place/library.png"));
                    TO_4.setFill(Color.valueOf("#a12fb5"));
                    FROM_4.setFill(Color.valueOf("#a12fb5"));
                    Arrive_4.setFill(Color.valueOf("#a12fb5"));
                } else if (ev.getEvent().getTo().equals("Faculty of Science")) {
                    img4.setImage(new Image("place/sci.png"));
                    TO_4.setFill(Color.valueOf("#92b923"));
                    FROM_4.setFill(Color.valueOf("#92b923"));
                    Arrive_4.setFill(Color.valueOf("#92b923"));
                } else if (ev.getEvent().getTo().equals("ECC Building")) {
                    img4.setImage(new Image("place/ECC.png"));
                    TO_4.setFill(Color.valueOf("#cf2e51"));
                    FROM_4.setFill(Color.valueOf("#cf2e51"));
                    Arrive_4.setFill(Color.valueOf("#cf2e51"));
                } else if (ev.getEvent().getTo().equals("Prathep Building")) {
                    img4.setImage(new Image("place/prathep.png"));
                    TO_4.setFill(Color.valueOf("#ffda2e"));
                    FROM_4.setFill(Color.valueOf("#ffda2e"));
                    Arrive_4.setFill(Color.valueOf("#ffda2e"));
                } else if (ev.getEvent().getTo().equals("Kae Ki")) {
                    img4.setImage(new Image("place/kaeki.png"));
                    TO_4.setFill(Color.valueOf("#55b4f1"));
                    FROM_4.setFill(Color.valueOf("#55b4f1"));
                    Arrive_4.setFill(Color.valueOf("#55b4f1"));
                }
            }


        }
    }

}
