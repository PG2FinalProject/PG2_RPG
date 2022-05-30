package player;

import javafx.scene.image.Image;

public class MagicianPlayer extends NovicePlayer{

    public MagicianPlayer(String name, int level) {
        super(name, level);
        setLevel();
        setHP(getMaxHP());
        setMP(getMaxMP());
        setExp(this.lastlvupExp);
        setImage();
    }
    
    public void setLevel() {
        this.level = this.getLevel();
        this.strNum = 30 + 8 * getLevel();
        this.intNum = 50 + 12 * getLevel();
        this.dexNum = 20 + 8 * getLevel();
        this.defNum = 20 + 7 * getLevel();
        this.maxHP = 120 + 15 * getLevel();
        this.maxMP = 100 + 15 * getLevel();
        this.lvupExp = (int) Math.ceil(Math.pow(10, Math.log(getLevel() + 1)/Math.log(2)));
        this.lastlvupExp = (int) Math.ceil(Math.pow(10, Math.log(getLevel())/Math.log(2)));
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
