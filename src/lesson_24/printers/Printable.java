package lesson_24.printers;
/*
@date 16.02.2024
@author Sergey Bugaienko
*/

public interface Printable {

    // Константа. По умолчанию имеет: public static final. Поменять нельзя
    int POWER = 220;


    // Интерфейс абстрактный косвенно.
    // Каждый метод в интерфейсе косвенно абстрактный и публичный
    // Нам не нужно писать public abstract, эти модификаторы уже есть по умолчанию у каждого метода интерфейса
    void print();

    //перегрузка метода
    void print(int number);

    // методы по умолчанию (с JDK 8)
    default void sayHello(String string) {
        System.out.println("Hello, " + string + ";  " + POWER);
        privateMethod();
    }

    //с JDK 8 доступны статические методы
    static void staticMethod() {
        System.out.println("Iam static");
        // доступен только статический контент
        staticPrivateMethod();
    }

//    private
    static void staticPrivateMethod() {
        System.out.println("I am staticPrivate");
    }


    //с JDK9 мы можем определять private методы.

    private void privateMethod() {
        System.out.println("Iam private");
    }


}
