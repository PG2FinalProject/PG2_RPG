package scene;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import player.NovicePlayer;
//import javafx.scene.Node;
import Main.RPG;

public class MapScene {
	
	@FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    
    NovicePlayer Player = NamingScene.CreateToMap();
    private void LocatePlayer() {
    	//read the kind of Player;
    	//put Player image in mid;
    }
    
}
