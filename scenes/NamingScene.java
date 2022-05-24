package scenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NamingScene {

    @FXML
    private TextField namingTextField;
    private static String playerNameNaming;

    @FXML
    public void submitNamingBottom(ActionEvent e) throws IOException
    {
        playerNameNaming = namingTextField.getText();
        
    }

    public String getplayerNameNaming() {
        return this.playerNameNaming;
    }

}
