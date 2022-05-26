package player;

import javafx.scene.image.Image;

public class MagicianPlayer extends NovicePlayer{

    public MagicianPlayer(String name) {
        super(name);
        setLevel();
        setHP(getMaxHPNum());
        setMP(getMaxMPNum());
        setExp(this.lastlvupExp);
        setImage();
    }
    
    public void setLevel() {
        this.levelNum = this.getLevelNum();
        this.strNum = 30 + 8 * getLevelNum();
        this.intNum = 50 + 12 * getLevelNum();
        this.dexNum = 20 + 8 * getLevelNum();
        this.defNum = 20 + 7 * getLevelNum();
        this.maxHPNum = 120 + 15 * getLevelNum();
        this.maxMPNum = 100 + 15 * getLevelNum();
        this.lvupExp = (int) Math.ceil(Math.pow(10, Math.log(getLevelNum() + 1)/Math.log(2)));
        this.lastlvupExp = (int) Math.ceil(Math.pow(10, Math.log(getLevelNum())/Math.log(2)));
    }
    
    /*
    public void specialSkill() {
        if (getMP() - 5 * getLevel() > 0) {
            setMP(getMP() - 5 * getLevel());
            //undefine the skill
        }
        
    }*/

    public void setImage(){
        this.playerImageStandByRight = new Image(getClass().getResourceAsStream("../playerPictures/MagicianStandByRight.gif"));
        this.playerImageStandByLeft = new Image(getClass().getResourceAsStream("../playerPictures/MagicianStandByLeft.gif"));
    }
}
