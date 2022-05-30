package moveMent;

import Main.RPG;
import javafx.scene.image.Image;

public class MapMovement {
	private final static int boundaryUP = 0, boundaryDOWN = 13;
	private final static int boundaryLEFT = 0, boundaryRIGHT = 13;
	private int[][] MapArray_1 = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,0,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,0,0,0,2,0,0,0,0,0,0,1,1},
			{1,1,1,1,1,0,1,0,1,1,1,0,1,1},
			{1,1,2,0,0,2,1,0,1,2,1,0,1,1},
			{1,1,0,1,1,0,1,0,1,0,1,0,1,1},
			{1,1,0,2,1,2,1,0,0,0,1,0,1,1},
			{1,1,1,1,1,0,1,1,1,1,1,0,1,1},
			{1,1,0,2,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,1,1,0,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,0,0,0,0,0,0,1,1,1},
			{1,1,2,0,0,0,1,1,1,1,5,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,0,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,0,1,1,1}
	};
	private int[][] MapArray_2 = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,0,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,0,0,0,2,0,0,0,0,0,0,1,1},
			{1,1,1,1,1,0,1,0,1,1,1,0,1,1},
			{1,1,2,0,0,2,1,0,1,2,1,0,1,1},
			{1,1,0,1,1,0,1,0,1,0,1,0,1,1},
			{1,1,0,2,1,2,1,0,0,0,1,0,1,1},
			{1,1,1,1,1,0,1,1,1,1,1,0,1,1},
			{1,1,0,2,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,1,1,0,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,0,0,0,0,0,0,1,1,1},
			{1,1,2,0,0,0,1,1,1,1,6,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,0,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,0,1,1,1}
	};
	//Using to return the correct images of Map & Player
	public int Move(int direction) {//1: Don't Move, 0: Move, 5:Change Map, 2:Battle
		int x = RPG.player.getX_Location();
		int y = RPG.player.getY_Location();
		int[][]map;
		map = RPG.player.getMapLocation() == 1 ? MapArray_1 : MapArray_2;
		switch(direction) {//0:UP, 1:DOWN, 2:LEFT, 3:RIGHT
		case 0:
			if(map[x][y+1] == 2) map[x][y+1] = 0;
			return map[x][y+1];
		case 1:
			if(map[x][y+1] == 2) map[x][y+1] = 0;
			return map[x][y-1];
		case 2:
			if(map[x][y+1] == 2) map[x][y+1] = 0;
			return map[x-1][y];
		case 3:
			if(map[x][y+1] == 2) map[x][y+1] = 0;
			return map[x+1][y];
		default:
			return 9;
		}
	}
	//
	public Image newMapFragment(int i, int j) {
		//use i, j, Player Location to figure out what image should it be;
		return new Image(getClass().getResourceAsStream("../playerPictures/NoviceStandByLeft.gif"));
	}
}
