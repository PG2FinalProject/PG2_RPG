package moveMent;

import Main.RPG;

public class MapMovement {
	private int boundaryUP = 0, boundaryDOWN = 13;
	private int boundaryLEFT = 0, boundaryRIGHT = 13;
	private static int[][] MapArray_1 = {
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
	private static int[][] MapArray_2 = {
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
	//Using to return the correct images of Map & Player
	public static void Move(int direction) {
		int x = RPG.player.getX_Location();
		int y = RPG.player.getY_Location();
		int[][]map;
		map = RPG.player.getMapLocation() == 1 ? MapArray_1 : MapArray_2;
		switch(direction) {//0:UP, 1:DOWN, 2:LEFT, 3:RIGHT
		case 0:
			if(map[x][y-1] != 1) {
				
			}
			break;
		case 1:
			if(map[x][y-1] == 0) {
				//call Map move
			}else if(map[x][y+1] == 2) {
				//call Map move & Battle
			}
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}
}
