package homework_08;

import java.util.Scanner;

/*
Программа просит пользователя ввести произвольное число
Вывести сумму цифр этого числа

567432 -> 5+6+7+4+3+2 -> 27
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите какое-то число");
        int userNumber = scanner.nextInt();

        if (userNumber < 0) {
            userNumber *= -1;
        }

        int sum = 0;

        int sum2 = 0;
        int userNumberV2 = userNumber;


        // 12345 ->

        while (userNumber > 0) {
            int currentDigit = (userNumber % 10);

            String add;
            if (userNumber > 10) {
                add = " + ";
            } else {
                add = " = ";
            }

            System.out.print(currentDigit + add);
//            System.out.print(currentDigit + ((userNumber > 10) ? " + " : " = "));
            sum += currentDigit;
            userNumber = userNumber / 10;
        }

        System.out.println(sum);

        // 4587899 -> / 1_000_000  -> 587899

        String numStr = String.valueOf(userNumberV2); //  Переводит что-либо в строку "4587899"
        int len = numStr.length();

        while (len > 0) {
            int pow = (int) Math.pow(10, (len -1)); // 10 в n степени
            int digit = userNumberV2 / pow;
            sum2 += digit;
            System.out.print(digit + ((len > 1) ? " + " : " = "));
            userNumberV2 %= pow;
            len--;
        }

        System.out.println(sum2);



        int number = 10;
        String result;

//        if (number >= 0 ) {
//            result = "Положительное";
//        } else {
//            result = "Отрицательное";
//        }

        result = (number >= 10) ? "Положительное" : "Отрицательное";

        System.out.println("Наше число " + result);

    }
}
