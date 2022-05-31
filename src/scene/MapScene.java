package scene;

import java.io.IOException;

import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.VLineTo;
import javafx.stage.Stage;
import javafx.util.Duration;
import Main.RPG;
import moveMent.MapMovement;

public class MapScene
{
	
	MapMovement move_ment = new MapMovement();
	private boolean walking = false;
	private int status = -1;
	private boolean opening = true;
	
	@FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
	private ImageView PlayerImage;
    private Pane OpeningPane;
    private Button BattleButton;
	private ImageView[][] MapImages = {{new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView()},
		{new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView()},
		{new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView()},
		{new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView()},
		{new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView(),new ImageView()},
	};
	@FXML
    public void BattleButton_click(ActionEvent event) throws IOException
    {
		BattleButton.setVisible(false);
		BattleButton.setDisable(true);
		//BattleButton invisible
        root = FXMLLoader.load(getClass().getResource("BattleScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
	//call battle
	public void callBattle() {
		//BattleButten visible;
		BattleButton.setVisible(true);
		BattleButton.setDisable(false);
	}
	//SetMap(Initialize)
	public void Map_Initial() {
		//When changing Map
		//1. Reset Player image
		//2. Reset Player Location
		//3. Reset Player MapLocation
		this.Player_initial();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 7; j++) {
				MapImages[i][j].setVisible(true);
				MapImages[i][j].setImage(move_ment.newMapFragment(i, j));
			}
		}
		RPG.player.setLocation(2, 2);
	}
	//Set PlayerImage(Initialize)
	public void Player_initial() {
		PlayerImage.setVisible(true);
		PlayerImage.setImage(RPG.player.getplayerImageStandByLeft());
	}
	//wasd controller
	public void keyPressed(KeyEvent key) {
		int direction = 0;
		if(opening) {
			this.Map_Initial();
			BattleButton.setVisible(false);
			BattleButton.setDisable(true);
			OpeningPane.setVisible(false);
			opening = !opening;
		}else if(!walking) {
			switch(key.getCode()) {
			case W:
				walking = true;
				PlayerImage.setImage(RPG.player.getplayerImageRunningByLeft());
				direction = 0;
				status = move_ment.Move(0);
	    		break;
			case A:
				walking = true;
				PlayerImage.setImage(RPG.player.getplayerImageRunningByLeft());
				direction = 2;
				status = move_ment.Move(2);
				break;
			case S:
				walking = true;
				PlayerImage.setImage(RPG.player.getplayerImageRunningByRight());
				direction = 1;
				status = move_ment.Move(1);
				break;
			case D:
				walking = true;
				PlayerImage.setImage(RPG.player.getplayerImageRunningByRight());
				direction = 3;
				status = move_ment.Move(3);
				break;
			default:
				status = -1;
				break;
			}
			switch(status) {
			case 0://Move
				MoveMap(direction);
			break;
			case 1://Don't Move
				DontMove(direction);
			case 2://Battle
				callBattle();
			case 3://Chest
				MoveMap(direction);
			case 4://Floor bf Door
				MoveMap(direction);
			case 5://Change Map
				RPG.player.setMapLocation(2);
				Map_Initial();
			case 6://Change Map
				callBattle();
				Map_Initial();
			default :
				break;
			}
		}
	}
	//if cannot move, switch back to Stand gif
	public void DontMove(int direction) {
		walking = false;
		switch(direction) {
			case 0:PlayerImage.setImage(RPG.player.getplayerImageStandByLeft());break;
			case 1:PlayerImage.setImage(RPG.player.getplayerImageStandByRight());break;
			case 2:PlayerImage.setImage(RPG.player.getplayerImageStandByLeft());break;
			case 3:PlayerImage.setImage(RPG.player.getplayerImageStandByRight());break;
		}
	}
	//the Animation to move Map image views
	public void MoveMap(int direction) {//0:UP, 1:DOWN, 2:LEFT, 3:RIGHT
		Path path = new Path();
		switch(direction) {
			case 0:
				path.getElements().add(new VLineTo(-150)); break;
			case 1:
				path.getElements().add(new VLineTo(150)); break;
			case 2:
				path.getElements().add(new HLineTo(-150));break;
			case 3:
				path.getElements().add(new HLineTo(150));break;
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 7; j++) {
				PathTransition Pt = new PathTransition();
				Pt.setNode(MapImages[i][j]);
				Pt.setDuration(Duration.seconds(1));
				Pt.setPath(path);
				Pt.setCycleCount(1);
				final int fi = i, fj = j;
				Pt.setOnFinished(e -> {
					MapImages[fi][fj].setImage(move_ment.newMapFragment(fi, fj));
					switch(direction) {
					case 0:
						PlayerImage.setImage(RPG.player.getplayerImageStandByLeft());
						MapImages[fi][fj].yProperty().add(150); break;
					case 1:
						PlayerImage.setImage(RPG.player.getplayerImageStandByRight());
						MapImages[fi][fj].yProperty().add(-150); break;
					case 2:
						PlayerImage.setImage(RPG.player.getplayerImageStandByLeft());
						MapImages[fi][fj].xProperty().add(150); break;
					case 3:
						PlayerImage.setImage(RPG.player.getplayerImageStandByRight());
						MapImages[fi][fj].xProperty().add(-150); break;
					}
					walking = false;
				});
				Pt.play();
			}
		}
	}

}
