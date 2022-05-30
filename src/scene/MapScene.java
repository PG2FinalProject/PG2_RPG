package scene;

import java.io.IOException;


import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import Main.RPG;
import moveMent.MapMovement;

public class MapScene
{
	@FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
	private ImageView PlayerImage;
	private ImageView MapImage;
	private ImageView[] MapImages;
    
	@FXML
    public void BattleButton(ActionEvent event) throws IOException
    {
        root = FXMLLoader.load(getClass().getResource("BattleScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
	
	public void callBattle() {
		
	}
	
	//SetMap(Initialize)
	public void SettingMap_Initial() {
		
	}
	//Set PlayerImage(Initialize)
	public void SettingPlayer_initial() {
		PlayerImage.setVisible(true);
		PlayerImage.setImage(RPG.player.getplayerImageStandByLeft());
	}
	
	//PlayerImage.setImage = RPG.Player.setImage;
	//Player_image;
	//call battle
	//KeyController(Set Player Image to Walk);
	public void keyPressed(KeyEvent key) {
	    switch(key.getCode()) {
	    case W:
	    	MapMovement.Move(0);
	    	break;
	    case A:
	    	MapMovement.Move(2);
	    	break;
	    case S:
	    	MapMovement.Move(1);
	    	break;
	    case D:
	    	MapMovement.Move(3);
	    	break;
		default:
			break;
	    }
	} 
	//
	
	public void MoveMap(int direction) {//0:UP, 1:DOWN, 2:LEFT, 3:RIGHT
		Line Move = new Line();
		PathTransition Pt = new PathTransition();
		Pt.setNode(MapImage);
		Pt.setDuration(Duration.seconds(3));
		Pt.setPath(Move);
		Pt.setCycleCount(1);
		Pt.setAutoReverse(true);
		Pt.play();
	}
	
	//Load Map
	//
	//MapMovement(after Movement, Update Image & ImageView Location);
	
}
