package scenes;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

import Main.RPG;

import player.NovicePlayer;

public class NamingScene {

    @FXML
    private TextField namingTextField;

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void submitNamingBottom(ActionEvent event) throws IOException
    {
        try{
            RPG.player = new NovicePlayer(namingTextField.getText());
            System.out.println(RPG.player.getName());
            try{
                root = FXMLLoader.load(getClass().getResource("/scenes/BattleScene.fxml"));
                scene = new Scene(root);
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch(Exception e) {
                e.printStackTrace();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}