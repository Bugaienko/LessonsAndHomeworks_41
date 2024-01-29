package homework_08;

import java.util.Random;

/*
Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.

Вывести на экран:

минимальное значение, хранящееся в массиве
максимальное
среднее арифметическое всех значений в массиве
 */

/*
Task 4
Дан массив целых чисел.
Поменять местами элемент с максимальным и минимальным значением
 */
public class Task3_4 {
    public static void main(String[] args) {

        Random random = new Random();
        int size = random.nextInt(15) + 1;
        System.out.println("size: " + size);


        int[] array = new int[size];


        int i = 0;
        System.out.print("[");
        while (i < array.length) {
            array[i] = random.nextInt(101);
            System.out.print(array[i] + ((i < array.length - 1) ? "; " : ""));
            i++;
        }
        System.out.println("]");

        int min = array[0];
        int max = array[0];

        int sum = 0;

        i = 0;
        while (i < array.length) {
            sum += array[i];

            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
            i++;
        }

        System.out.println("Min: " + min);
        System.out.println("MAx: " + max);
        System.out.println("Average: " + ((double) sum / array.length));


        int minAr = array[0];
        int minIndex = 0;

        int maxAr = array[0];
        int maxIndex = 0;

        i = 1;
        while (i < array.length) {

            if (maxAr < array[i]) {
                maxAr = array[i];
                maxIndex = i;
            }

            if (minAr > array[i]) {
                minAr = array[i];
                minIndex = i;
            }

            i++;
        }

        System.out.println("max: " + maxAr + " index: " + maxIndex);
        System.out.println("min: " + minAr + " index: " + minIndex);

        array[minIndex] = maxAr;
        array[maxIndex] = minAr;

        i = 0;
        System.out.print("[");
        while (i < array.length) {
            System.out.print(array[i] + ((i < array.length - 1) ? "; " : ""));
            i++;
        }
        System.out.println("]");


    }
}
