package homework_23.woldOfMagic;
/*
@date 16.02.2024
@author Sergey Bugaienko
*/

public class Warrior extends GameCharacter{



    public Warrior(int health) {
        super(health);
    }

    @Override
    public void attack() {
        System.out.println("Warrior attack with " + health);
    }
}
