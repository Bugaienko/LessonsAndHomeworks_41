package homework_07;

import java.util.Scanner;

/*
@date 25.01.2024
@author Sergey Bugaienko
*/
/*
Программа просит пользователя ввести число от 1 до 7
Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
Если 6 или 7 – “Выходной”.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 7");
        int userInputDay = scanner.nextInt();

        switch (userInputDay) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 6:
            case 7:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Ваш ввод не распознан");

        }

    }
}
