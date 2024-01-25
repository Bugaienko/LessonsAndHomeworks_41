package homework_06;
/*
@date 24.01.2024
@author Sergey Bugaienko
*/

/*
Программа предлагает пользователю ввести четырехзначное число
Причем: мы можем получать от пользователя ТОЛЬКО строки. Данные в формате String
Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается
Проверить, является ли число "счастливым билетом". Т.е. совпадает ли сумма цифр первых двух цифр числа с суммой третьей и четвертой цифры
Пример:

число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое
число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 4-х значное число");
        String number = scanner.nextLine();
        System.out.println(number);

        if (number.length() == 4) {
            // код обработки строки длинной 4 символа

            char ch0 = number.charAt(0);
            if (ch0 < 48 || ch0 > 57) {
                System.out.println("Это не цифра");
                System.exit(0);
            }


            int leftSum = number.charAt(0) + number.charAt(1);
            int rightSum = number.charAt(2) + number.charAt(3);

            System.out.println("leftSum: " + leftSum);
            System.out.println("rightSum: " + rightSum);

            if ( leftSum == rightSum) {
                System.out.println("Ура! Число счастливое! (v1)");
            } else {
                System.out.println("Не счастливое (v1)");
            }

        } else {
            System.out.println("Вы ввели не 4-х значное число");
        }

        // Option 1

        if (number.length() == 4) {
            int digit = Integer.parseInt(number); // пытается вытащить из строки число и записать его в int
            System.out.println("Получили число из строки: " + digit);

            // откусывать по 1-й циферке

            //1234
            int digit0 = digit % 10;
            digit = digit  /10; // -> 123

            //123
            int digit1 = digit % 10;
            digit /= 10;

            //12
            int digit2 = digit % 10;
            int digit3 = digit / 10;

            System.out.println(digit0 + " | " + digit1 + " | " +  digit2 + " | " +  digit3);

            if (digit0 + digit1 == digit2 + digit3) {
                System.out.println("Ура! Число счастливое! (v2)");
            } else {
                System.out.println("Не счастливое (v2)");
            }







        } else {
            System.out.println("Вы ввели не 4-х значное число");

        }

    }
}
