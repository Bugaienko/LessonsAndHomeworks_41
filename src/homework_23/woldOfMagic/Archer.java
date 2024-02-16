package homework_23.woldOfMagic;
/*
@date 16.02.2024
@author Sergey Bugaienko
*/

import homework_23.woldOfMagic.GameCharacter;

public class Archer extends GameCharacter {

    public Archer(int health) {
        super(health);
    }

    @Override
    protected void attack() {
        System.out.println("Archer attack with " + health);
    }
}
