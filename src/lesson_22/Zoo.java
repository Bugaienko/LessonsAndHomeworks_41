package lesson_22;
/*
@date 14.02.2024
@author Sergey Bugaienko
*/

public class Zoo {
    public static void main(String[] args) {



        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.voice();

        Hamster hamster = new Hamster();
        hamster.voice();

        Dog dog = new Dog();
        dog.voice();

        /// Переопределение методов
        // Method Overriding - динамический полиморфизм - времени выполнения (Runtime)

        // Статический полиморфизм (компиляционный) - перегрузка методов

        String test = "Test " + animal + " " + hamster;
        System.out.println(test);

        System.out.println(animal);
        System.out.println(hamster);

    }
}
