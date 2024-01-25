package lesson_06;
/*
@date 23.01.2024
@author Sergey Bugaienko
*/

import java.util.Locale;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // говорим что нам нужен сканер для чтения из консоли
        scanner.useLocale(Locale.US); // Меняем локализацию нашего сканера. Разделителем будет "."
        scanner.useLocale(Locale.GERMANY); // Меняем локализацию нашего сканера. Разделителем будет ","

        System.out.println("Введи ваше имя:"); // Приглашение к вводу данных

        String name = scanner.nextLine(); // Читает строку ввода, включая пробелы до символа перевода каретки (до нажатой кнопки Enter)


        System.out.println("Введи ваш возраст: ");
        int age = scanner.nextInt(); // считывает введенное число из консоли
        scanner.nextLine();

        System.out.println("Введите число с запятой");
        double dbl = scanner.nextDouble(); // число с плавающей точкой

        System.out.println("Получили имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Дабл: " + dbl);
    }
}
