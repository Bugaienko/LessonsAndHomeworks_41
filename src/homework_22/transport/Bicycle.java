package homework_22.transport;
/*
@date 15.02.2024
@author Sergey Bugaienko
*/

public class Bicycle extends Vehicle{

    @Override
    public String toString() {
        return "Bicycle {id: " + getId() + "; engine: Двигателя нет, только педали}";
    }

    @Override
    public void startEngine() {
        System.out.println("У велосипеда двигателя нет");
    }
}
