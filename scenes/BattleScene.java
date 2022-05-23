package scenes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BattleScene {

    @FXML
    private ImageView playerBattleImageView;
    private ImageView monsterBattleImageView1;
    private ImageView monsterBattleImageView2;

    private Image playerBattleImage;
    private Image monsterBattleImage1;
    private Image monsterBattleImage2;

    @FXML
    void initialize() {
        playerBattleImage = new Image(getClass().getResourceAsStream("../playerPictures/ShieldStandByRight.gif"));
        playerBattleImageView.setImage(playerBattleImage);
    }

}
