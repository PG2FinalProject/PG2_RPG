package scenes;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import Main.RPG;

import monster.*;

public class BattleScene implements Initializable {

    

    @FXML
    private ImageView playerBattleImageView;
    @FXML
    private ImageView monsterBattleImageView1;
    @FXML
    private ImageView monsterBattleImageView2;

    @FXML
    private Label playerBattleName;
    @FXML
    private Label monsterBattleName1;
    @FXML
    private Label monsterBattleName2;

    @FXML
    private Label dialogue;

    @FXML
    private Button attackButton;
    @FXML
    private Button magicButton;
    @FXML
    private Button itemButton;
    @FXML 
    private Button retrieveButton;
    @FXML
    private Button monsterButton1;
    @FXML
    private Button monsterButton2;

    @FXML
    private ProgressBar hpBar;
    @FXML
    private ProgressBar mpBar;

    @FXML
    private Label hpLabel;
    @FXML
    private Label mpLabel;
    @FXML
    private Label hpValueLabel;
    @FXML
    private Label mpValueLabel;
    @FXML
    private Label strLabel;
    @FXML
    private Label intLabel;
    @FXML
    private Label defLabel;
    @FXML
    private Label dexLabel;

    private BaseMonster monster1;
    private BaseMonster monster2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Create Monster
        int monsterSelecting = (int)Math.random()*3;
        while(monsterSelecting == 3)
            monsterSelecting = (int)Math.random()*3;
        if(monsterSelecting == 0)
            monster1 = new GoblinMonster();
        else if(monsterSelecting == 1)
            monster1 = new JWMonster();
        else if(monsterSelecting == 2)
            monster1 = new ZombieMonster();
        monsterSelecting = (int)Math.random()*3;
        while(monsterSelecting == 3)
            monsterSelecting = (int)Math.random()*3;
        if(monsterSelecting == 0)
            monster2 = new GoblinMonster();
        else if(monsterSelecting == 1)
            monster2 = new JWMonster();
        else if(monsterSelecting == 2)
            monster2 = new ZombieMonster();

        //Player Initialization
        playerBattleImageView.setImage(RPG.player.getplayerImageStandByRight());
        playerBattleName.setText(RPG.player.getName());
        
        //Monster1 Initialization
        monsterBattleImageView1.setVisible(true);
        monsterBattleImageView1.setImage(RPG.player.getplayerImageStandByLeft());
        monsterBattleName1.setVisible(true);
        monsterBattleName1.setText("Monster1");

        //Monster2 Initialization
        monsterBattleImageView2.setVisible(true);
        monsterBattleImageView2.setImage(RPG.player.getplayerImageStandByLeft());
        monsterBattleName2.setVisible(true);
        monsterBattleName2.setText("Monster2");
        
        //Dialogue
        showDialogue();

    }

    private void showDialogue()
    {
        dialogue.setVisible(true);
        dialogue.setText("Two monsters showed up!!");
    }

    @FXML
    public void closeDialogue(MouseEvent event)
    {
        dialogue.setVisible(false);

        //Show Control Terminal
        attackButton.setVisible(true);
        magicButton.setVisible(true);
        itemButton.setVisible(true);
        retrieveButton.setVisible(true);

        hpBar.setVisible(true);
        hpBar.setProgress(RPG.player.getHP() / RPG.player.getMaxHPNum());
        mpBar.setVisible(true);
        mpBar.setProgress(RPG.player.getMP() / RPG.player.getMaxMPNum());

        hpLabel.setVisible(true);
        mpLabel.setVisible(true);

        hpValueLabel.setVisible(true);
        hpValueLabel.setText(Integer.toString(RPG.player.getHP()) + "/" + Integer.toString(RPG.player.getMaxHPNum()));
        mpValueLabel.setVisible(true);
        mpValueLabel.setText(Integer.toString(RPG.player.getMP()) + "/" + Integer.toString(RPG.player.getMaxMPNum()));

        strLabel.setVisible(true);
        strLabel.setText("str: "+ Integer.toString(RPG.player.getStrNum()));
        intLabel.setVisible(true);
        intLabel.setText("int: "+ Integer.toString(RPG.player.getIntNum()));
        dexLabel.setVisible(true);
        dexLabel.setText("dex: "+ Integer.toString(RPG.player.getDexNum()));
        defLabel.setVisible(true);
        defLabel.setText("def: "+ Integer.toString(RPG.player.getDefNum()));
    }

    @FXML
    public void attackButtonAction(ActionEvent event){
        attackButton.setVisible(false);
        magicButton.setVisible(false);
        itemButton.setVisible(false);
        retrieveButton.setVisible(false);

        monsterButton1.setVisible(true);
        monsterButton2.setVisible(true);
    }
}
