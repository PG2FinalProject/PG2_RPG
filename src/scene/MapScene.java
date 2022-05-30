package scene;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Main.RPG;
import player.NovicePlayer;

public class MapScene {
	@FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
	
	@FXML
    public void FirstMap(ActionEvent event) throws IOException
    {
        try{
        	root = FXMLLoader.load(getClass().getResource("MapScene.fxml"));
        	scene = new Scene(root);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
	
	//SetMap(Initialize)
	//Set PlayerImage(Initialize)
	
	//KeyController(Set Player Image to Walk);
	//MapMovement(after Movement, Update Image & ImageView Location);
	
}
