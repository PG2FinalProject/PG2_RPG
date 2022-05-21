package scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class StartScene {

    @FXML
    private URL location;
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    public void newGame(ActionEvent e) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("NamingScene.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void exitGame(ActionEvent e) throws IOException
    {
        Platform.exit();
    }
}
