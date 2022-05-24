package scenes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

public class BattleScene {

    @FXML
    private ImageView playerBattleImageView;
    private ImageView monsterBattleImageView1;
    private ImageView monsterBattleImageView2;

    private Image playerBattleImage;
    private Image monsterBattleImage1;
    private Image monsterBattleImage2;

    private Label playerBattleName;
    private Label monsterBattleName1;
    private Label monsterBattleName2;

    @FXML
    void initialize() {
        //Player Initialization
        playerBattleImage = new Image(getClass().getResourceAsStream("../playerPictures/ShieldStandByRight.gif"));
        playerBattleImageView.setImage(playerBattleImage);
        //playerBattleName.setText("");
        //Monster1 Initialization
        //Monster2 Initialization
    }

}
