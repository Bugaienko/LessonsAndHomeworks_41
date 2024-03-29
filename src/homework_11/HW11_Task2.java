package homework_11;
/*
@date 31.01.2024
@author Sergey Bugaienko
*/

/*
Написать метод принимающий целое число и проверяющий является ли число простым.
Если является, метод должен вернуть true, не является - false
 */

/*
Написать метод, принимающий массив целых чисел.
Метод должен вернуть количество простых чисел в массиве.

Для проверки на "простоту" числа рекомендуется использовать метод из Task 1
 */
public class HW11_Task2 {
    public static void main(String[] args) {
        System.out.println(isPrime(73));

        int[] testArray = {3, 6, 11, 31, 66, 100, 121, 73, 75, 19, 0 , -12, -56};
        System.out.println(countPrimeInArray(testArray));

    }


    public static int countPrimeInArray(int[] arr) {
        // 1. Перебрать все значения в массиве
        // 2. Проверить каждое на простоту.
        // 3. При нахождение простого - увеличить счетчик на +
        // 4. После перебора всех - вернуть значение счетчика


        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
