package player;

import javafx.scene.image.Image;

public class ShieldPlayer extends NovicePlayer{

    public ShieldPlayer(String name) {
        super(name);
        setLevel();
        setHP(getMaxHPNum());
        setMP(getMaxMPNum());
        setExp(this.lastlvupExp);
        setImage();
    }
    
    
    public void setLevel() {
        this.levelNum = this.getLevelNum();
        this.strNum = 40 + 8 * getLevelNum();
        this.intNum = 20 + 5 * getLevelNum();
        this.dexNum = 20 + 4 * getLevelNum();
        this.defNum = 50 + 12 * getLevelNum();
        this.maxHPNum = 250 + 20 * getLevelNum();
        this.maxMPNum = 50 + 5 * getLevelNum();
        this.lvupExp = (int) Math.ceil(Math.pow(10, Math.log(getLevelNum() + 1)/Math.log(2)));
        this.lastlvupExp = (int) Math.ceil(Math.pow(10, Math.log(getLevelNum())/Math.log(2)));
    }
    
    /*
    public void specialSkill() {
        if (getMP() - 5 * getLevelNum() > 0) {
            setHP(getHP() + 10 * getLevelNum());
            setMP(getMP() - 5 * getLevelNum());
            //well define
        }
    }*/

    public void setImage(){
        this.playerImageStandByRight = new Image(getClass().getResourceAsStream("../playerPictures/ShieldStandByRight.gif"));
        this.playerImageStandByLeft = new Image(getClass().getResourceAsStream("../playerPictures/ShieldStandByLeft.gif"));
    }

}
