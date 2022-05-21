import javafx.stage.Stage;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class RPG extends Application{
    @Override
    public void start(Stage stage) throws Exception{
        Parent root;
        try{
            root = FXMLLoader.load(getClass().getResource("/scenes/StartScene.fxml"));
            Scene scene = new Scene(root);
            
            stage.setScene(scene);
            stage.show();

            
        }catch(IOException e){
        
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

