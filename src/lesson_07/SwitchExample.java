package lesson_07;
/*
@date 24.01.2024
@author Sergey Bugaienko
*/

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        int x = 8;

        if (x == 5) {
            System.out.println("if x == 5");
        } else if (x == 7) {
            System.out.println("if x == 7");
        } else {
            System.out.println("else х имеет другое значение");
        }


//        String name = "Fred";
        switch (x) {
            case 5:
                System.out.println("switch x == 5");
                break;
            case 7:
            case 8:
                System.out.println("switch x == 7 or 8");
                break;
            default:
                System.out.println("switch х имеет другое значение");
        }

        System.out.println("Продолжение программы");


        /*
        У ребенка есть карманные деньги. Допустим сейчас есть 100 денег.
        Ребенок получает  в школе оценки (от 1 до 5)
        За хорошие оценки получает деньги, за плохие отбирают:
        5 -> +20 денег
        4 -> +10
        3 -> не изменяется
        2 -> -20
        1 -> - все деньги

        вывести: У ребенка сейчас ххх денег
         */

        Random random = new Random();
        int money = 100;
        int note = random.nextInt(5) + 1; // Генерирует случайную оценку от 1 до 5


        note = 1;
        double w = 1.0;
        System.out.println("Оценка: " + note);

        // byte, short, char, int
        // Byte, Short, Charter, Integer
        // String (начиная с 7 версии Java)
        // Перечисления Enum

        switch (note) {
            case 5:
                money += 20;
                break;
            case 4:
                money += 10;
                break;
            case 3:
                break;
            case 2:
                money -= 20;
                break;
            case 1:
                money = 0;
                break;
            default:
                System.out.println("Ребенок, таких оценок не бывает");
        }


        //Code vor v Java 14 or higher
//        money = switch (note) {
//            case 5 -> money + 20;
//            case 4 -> money + 10;
//            case 2 -> money - 20;
//            case 1, 6, 7 -> 0;
//            default -> money;
//        };

        switch (note) {
            case 5:
                money += 20;
                break;
            case 4:
                money += 10;
                break;
            case 3:
                break;
            case 2:
                money -= 20;
                break;
            case 1:
                money = 0;
                break;
            default:
                System.out.println("Ребенок, таких оценок не бывает");
        }

        System.out.println("У ребенка сейчас " + money + " денег.");

        // //Code vor v Java 17 or higher
//        String str = """
//                65yehteyethyeryhtreyt
//                erytrytyeteyt655yt6w45y6
//                ghdthyetuy5ytue
//                """;


        //
    }
}
