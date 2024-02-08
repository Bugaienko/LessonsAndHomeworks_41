package lesson_18;
/*
@date 08.02.2024
@author Sergey Bugaienko
*/

public class Lesson18 {
    public static void main(String[] args) {

        int sum = MathUtils.sumOfInts(1, 4, 5, 6);
        System.out.println("sum: " + sum);

        System.out.println(MathUtils.minus(10, 45));

        Car car = new Car("Test", 100);
        Car car2 = new Car("Car", 200);

        car.info();
        System.out.println(Car.getCountCar());

        /*
        1. Не-статические методы могут обращаться к нестатическим полям и методам
        2. Не-статические методы могут обращаться к статическим полям и методам
        3. Статические методы могут обращаться к статическим полям и методам
        4. Статические методы НЕ могут обращаться к НЕ-статическим полям и методам

         */

    }
}
