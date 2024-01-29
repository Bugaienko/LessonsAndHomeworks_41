package homework_09;
/*
@date 29.01.2024
@author Sergey Bugaienko
*/

/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл for.

Пусть сумма вклада будет представлять тип float.

Введите сумму вклада: 100
Введите срок вклада в месяцах: 1
После 1 месяцев сумма вклада составит 107,00
 */

import java.util.Scanner;

public class HW09_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentPerMonth = 7;

        float sumDeposit;
        int months;

        System.out.println("Сколько денег Вы готовы доверить нашему банку?");
        sumDeposit = scanner.nextFloat();

        System.out.println("На какой срок (в месяцах)?");
        months = scanner.nextInt();


        for (int i = 1; i <= months; i++) {
            sumDeposit += sumDeposit * percentPerMonth / 100; // каждый месяц сумма будет увеличиться на percentPerMonth процентов
        }

        System.out.printf("Через %d месяцев мы может быть вернем вам %.2f", months, sumDeposit);
    }
}
