package homework_23.woldOfMagic;
/*
@date 16.02.2024
@author Sergey Bugaienko
*/

public class MagicApp {
    public static void main(String[] args) {

        GameCharacter warrior = new Warrior(100);
        GameCharacter archer = new Archer(50);

        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = warrior;
        characters[1] = archer;
        characters[2] = new Warrior(75);

        for (GameCharacter character : characters) {
            character.attack();
        }

    }
}
