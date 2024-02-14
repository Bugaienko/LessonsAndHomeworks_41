package lesson_22;
/*
@date 14.02.2024
@author Sergey Bugaienko
*/

public class Cat extends Animal {


    // переопределение родительского метода voice
    @Override
    public void voice() {
        System.out.println("Cat say MEOW!!!");
    }

    public void eat() {
        System.out.println("Cat eating");
    }



}
