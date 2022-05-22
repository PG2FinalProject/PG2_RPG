package scenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NamingScene {

    @FXML
    private TextField namingTextField;
    private String playerName;

    @FXML
    public void submitNamingBottom(ActionEvent e) throws IOException
    {
        playerName = namingTextField.getText();
        System.out.println(playerName);
    }

}
