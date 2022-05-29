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
//import Main.RPG;

public class MapScene {
	
	@FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private static int xLocation;
    private static int yLocation;
    //Q: When I call this scene, will the Location been RESET?
    //Setting Scene
    NovicePlayer Player = NamingScene.CreateToMap();
    private void LocatePlayer() {
    	//read the kind of Player;
    	//put Player image in mid;
    }
    private void SetMap() {
    	//Set Array;
    	//Read x and y Location
    	//Array To Picture
    }
    //Use Movement script to control;
    
}
