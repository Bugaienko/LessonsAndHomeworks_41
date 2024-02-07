package lesson_17;
/*
@date 07.02.2024
@author Sergey Bugaienko
*/

public class Person {
    String name;
    int age;
    String hobby;

    public Person(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String toString() {
        return "Person " + name + "; age: " + age + ";  hobby: " + hobby;
    }


}
