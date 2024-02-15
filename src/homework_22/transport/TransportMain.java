package homework_22.transport;
/*
@date 15.02.2024
@author Sergey Bugaienko
*/

public class TransportMain {
    public static void main(String[] args) {
        Engine engine = new Engine(150, "Diesel");

        Car car = new Car(engine);
        System.out.println(car);
    }
}
