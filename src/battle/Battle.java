package battle;

import monster.*;
import players.NovicePlayer;

public class Battle {
    private BaseMonster monster1;
    private BaseMonster monster2;

    public Battle() {
        //Create Monster
        int monsterSelecting = (int)Math.random()*3;
        while(monsterSelecting == 3)
            monsterSelecting = (int)Math.random()*3;
        if(monsterSelecting == 0)
            this.monster1 = new GoblinMonster();
        else if(monsterSelecting == 1)
            this.monster1 = new JWMonster();
        else if(monsterSelecting == 2)
            this.monster1 = new ZombieMonster();
        monsterSelecting = (int)Math.random()*3;
        while(monsterSelecting == 3)
            monsterSelecting = (int)Math.random()*3;
        if(monsterSelecting == 0)
            this.monster2 = new GoblinMonster();
        else if(monsterSelecting == 1)
            this.monster2 = new JWMonster();
        else if(monsterSelecting == 2)
            this.monster2 = new ZombieMonster();
    }

    public BaseMonster getMonster1() {
        return this.monster1;
    }

    public BaseMonster getMonster2() {
        return this.monster2;
    }

    public void attackPlayer(NovicePlayer player, BaseMonster monster) {
        monster.setHP(monster.getHP() - player.getStrNum());
    }

    public void attackMonster(BaseMonster monster, NovicePlayer player) {
        player.setHP(player.getHP() - monster.getStrNum());
    }

    public void getExp(NovicePlayer player, int... exps){
        for(int exp : exps){
            player.setExp(exp);
        }
    }

    /*
    public void magic(NovicePlayer player, BaseMonster monster) {
        monster.setHP(monster.getHP() - player.getStrNum());
        if(monster.getHP() == 0){

        }
    }*/
}
