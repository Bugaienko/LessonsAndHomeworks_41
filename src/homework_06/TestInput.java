package homework_06;
/*
@date 24.01.2024
@author Sergey Bugaienko
*/

import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        System.out.println("Введите 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        String yourNumber = scanner.next();
        int yourRealNumber;

        if (yourNumber.equals("1") || yourNumber.equals("2") || yourNumber.equals("3")) {
            yourRealNumber = (int) yourNumber.charAt(0);
            System.out.println("Вы ввели: " + yourRealNumber);
        } else {
            System.out.println("Неверный ввод!");
        }
    }
}