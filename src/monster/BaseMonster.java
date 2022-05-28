package monster;

public class BaseMonster {
    
    private int hp;
	private int mp;

	private final int strNum; 
	private final int defNum;  
	private final int exp; 
	private final int maxHP; 
	private final int maxMP;
    //private final int money = 10;

    public BaseMonster(int strNum, int defNum, int exp, int maxHP, int maxMP) {
        this.strNum = strNum;
        this.defNum = defNum;
        this.exp = exp;
        this.maxHP = maxHP;
        this.maxMP = maxMP;
    }

    public void setHP(int hp) {
        if (hp <= 0) { 
            this.hp = 0; 
        }
        else if (hp >= maxHP) { 
            this.hp = this.maxHP; 
        }
        else { 
            this.hp = hp; 
        }
    }
    
    public int getHP(){
        return this.hp;
    }
    
    public void setMP(int mp) {
        if (mp <= 0) { 
            this.mp = 0; 
        }
        else if (mp >= maxMP) { 
            this.mp = this.maxMP; 
        }
        else { 
            this.mp = mp; 
        }
    }

    public int getMP(){
        return this.mp;
    }

    public int getStrNum(){
        return this.strNum;
    }

    public int getDefNum(){
        return this.defNum;
    }

    public int getExp(){
        return this.exp;
    }
    
    public int getMaxHP(){
        return this.maxHP;
    }

    public int getMaxMP(){
        return this.maxMP;
    }
}
