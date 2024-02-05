package lesson_15;
/*
@date 05.02.2024
@author Sergey Bugaienko
*/


/*
Имя, цвет, возраст
мяукать, спать, бежать
 */
public class Cat {
    String name;
    String color;
    int age;


    public Cat() {

    }

    // Перегруженный конструктор
    public Cat(String catName) {
        System.out.println("Конструктор 2");
        name = catName;
    }

    public void whoAmI() {
        System.out.println("Я котик " + name + ", мой возраст: " +
                age + "; цвет: " + color);

    }

    void sleep () {
        System.out.println("Я сплю");
    }
    void sayMeow() {
        System.out.println("Meow!!!");
    }
        void run () {
        System.out.println("Run");
    }
}
