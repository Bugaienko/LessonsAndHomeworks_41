package lesson_03;
/*
@date 18.01.2024
@author Sergey Bugaienko
*/

public class Variables {
    public static void main(String[] args) {

//        Ctrl + D
//        Alt + Shift + стрелка вверх / вниз

        int myFirstVariable; // Объявление (декларация) переменной типа int

        myFirstVariable = 1; // Первое присвоение значения называется инициализацией. Присвоение значения переменной.

        int mySecondVariable = 25; // объявление и инициализация в одной строке

        System.out.println(mySecondVariable);

        mySecondVariable = 50; // присвоение нового значения переменной

        System.out.println("mySecondVariable: " + mySecondVariable);

        byte byteVar = 125; // объявление и инициализация переменной типа byte
        byteVar = 0;
        System.out.println("Значение переменной byteVar: " + byteVar);


        short shortVar; // объявление переменной типа short
        shortVar = 31000; // инициализация переменной

        long longVariable = 2_100_000_000_000_000_000L; // знак _ не влияет на значение переменной. Исключительно для лучшего визуального понимания числа
        System.out.println("longVariable: " + longVariable);
        //L в конце числа - сказать компилятору, что это число в формате long

        double doubleVar = 10.5421;
        System.out.println("doubleVar= " + doubleVar);

        float floatVar = 11.65F; // число в формате float
    }
}
