package lesson_23.transport;
/*
@date 15.02.2024
@author Sergey Bugaienko
*/

public class SuperScooter extends Scooter {
    @Override
    public void startEngine() {
        System.out.println("Start");
    }

    @Override
    public void hello(String string) {
        super.hello();
        System.out.println(string);
    }
}
