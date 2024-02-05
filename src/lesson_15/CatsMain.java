package lesson_15;
/*
@date 05.02.2024
@author Sergey Bugaienko
*/

//Значения по умолчанию для полей
// ссылочные типы данных - null
// числовые примитивы 0 (0.0)
// boolean - false

public class CatsMain {
    public static void main(String[] args) {
        Cat cat = new Cat(); // создаем объект класса Cat
        // Cat() - вызов конструктора класса

        cat.sayMeow();
        cat.run();
        cat.sleep();

        // При создании объекта класса все его поля
        // инициализируются значениями пол умолчанию (за инициализацию отвечает конструктор)

        String catNameVar = cat.name;
        System.out.println("Имя кота: " + catNameVar);
        System.out.println("Возраст кота: " + cat.age);
        System.out.println("Цвет: " + cat.color);


        System.out.println(" ==========================  ");
        // Создаем еще один объект класса Cat

        Cat cat1 = new Cat("Max");

        cat1.run();
        cat1.sleep();
        System.out.println("Имя cat1: " + cat1.name);
        System.out.println("Возраст cat1: " + cat1.age);

        System.out.println("Имя первого кота: " + cat.name);

        System.out.println("+ ====================");
        cat.whoAmI();
        cat1.whoAmI();

    }

}
