package lesson_19;
/*
@date 09.02.2024
@author Sergey Bugaienko
*/

import lesson_19.dontShow.Main;

public class Main19 {
    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo(15);
        FinalDemo finalDemo1 = new FinalDemo(25);

        finalDemo.printArray();

        String s;

        finalDemo.setNewValue();
        finalDemo.printArray();

        System.out.println(FinalDemo.PI);
        // FinalDemo.PI = 55; Значение константы неизменяемо

//        finalDemo.setNewSize(15);

        FinalDemo.INTS[0] = 150; // Вполне себе допустимая операция
        FinalDemo.INTS[1] = 200; // Вполне себе допустимая операция

        System.out.println(Math.E);

    }
}
