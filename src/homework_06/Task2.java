package homework_06;
/*
@date 24.01.2024
@author Sergey Bugaienko
*/

import java.util.Random;

/*
Запишите в 4 переменные случайные числа от 0 до 100
Выведите все 4 на экран
Программа должна определить максимальное из этих четырех чисел
Результат вывести на экран
 */
public class Task2 {
    public static void main(String[] args) {
        // Ctrl + D - продублировать строку или часть кода

        Random random = new Random();

        int var = random.nextInt(101); // 0..100 включительно
        int var1 = random.nextInt(101); // 0..100 включительно
        int var2 = random.nextInt(101); // 0..100 включительно
        int var3 = random.nextInt(101); // 0..100 включительно

        System.out.println(var + " | " + var1 + " | " + var2 + " | " + var3 );

        int max = var;

        if (max < var1) {
            max = var1;
        }
        if (max < var2) {
            max = var2;
        }

        if (max < var3) {
            max = var3;
        }

        System.out.println("Max: " + max);


    }
}
