package player;

import javafx.scene.image.Image;

public class KnightPlayer extends NovicePlayer{

    public KnightPlayer(String name) {
        super(name);
        setLevel();
        setHP(getMaxHPNum());
        setMP(getMaxMPNum());
        setExp(this.lastlvupExp);
        setImage();
    }


    public void setLevel() {
        this.levelNum = this.getLevelNum();
        this.strNum = 50 + 12 * getLevelNum();
        this.intNum = 20 + 5 * getLevelNum();
        this.dexNum = 20 + 8 * getLevelNum();
        this.defNum = 40 + 8 * getLevelNum();
        this.maxHPNum = 200 + 20 * getLevelNum();
        this.maxMPNum = 50 + 5 * getLevelNum();
        this.lvupExp = (int) Math.ceil(Math.pow(10, Math.log(getLevelNum() + 1)/Math.log(2)));
        this.lastlvupExp = (int) Math.ceil(Math.pow(10, Math.log(getLevelNum())/Math.log(2)));
    }

    /*
    public void specialSkill() {
        if (getMP() - 5 * getLevel() > 0) {
            setMP(getMP() - 5 * getLevel());
            //undefine very well
        }
    }*/

    public void setImage(){
        this.playerImageStandByRight = new Image(getClass().getResourceAsStream("../playerPictures/KnightStandByRight.gif"));
        this.playerImageStandByLeft = new Image(getClass().getResourceAsStream("../playerPictures/KnightStandByLeft.gif"));
    }
}
