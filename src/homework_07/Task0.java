package homework_07;
/*
@date 25.01.2024
@author Sergey Bugaienko
*/

import java.util.Scanner;

/*
Перепишите решение задачи с использованием switch вместо if-else:

Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
а программа вывести, "вы ввели число один (два/три)

 */
public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3:");
        // Shift + ALt + L - выравнивание кода

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Вы ввели число один");
                break;
            case 2:
                System.out.println("Вы ввели число два");
                break;
            case 3:
                System.out.println("Вы ввели число три");
                break;
            default:
                System.out.println("Я же просил 1, 2 или 3");
        }


    }
}
