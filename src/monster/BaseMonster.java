package monster;

public class BaseMonster {
    
    private int hp;
	private int mp;

	private final int attack; 
	private final int def;  
	private final int exp; 
	private final int maxHP; 
	private final int maxMP;
    //private final int money = 10;

    public BaseMonster(int attack, int def, int exp, int maxHP, int maxMP) {
        this.attack = attack;
        this.def = def;
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

    public int getAttack(){
        return this.attack;
    }

    public int getDef(){
        return this.def;
    }

    public int getExp(){
        return this.exp;
    }
    
    public int getMaxHP(){
        return this.hp;
    }

    public int getMaxMP(){
        return this.mp;
    }
}
