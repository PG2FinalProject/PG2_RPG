package scenes;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import main_RPG.*;
import player.*;

public class NamingScene {

    @FXML
    private TextField namingTextField;
    private static String playerNameNaming;
    public BasicObj BO = new BasicObj();
    String b = BO.a;
    NovicePlayer a = BO.playerN;
    String name = a.getName();
    int k = BO.Testing();
    //BO.playerN
    @FXML
    public void submitNamingBottom(ActionEvent e) throws IOException
    {
        playerNameNaming = namingTextField.getText();
    }

    public String getplayerNameNaming() {
        return this.playerNameNaming;
    }

}
