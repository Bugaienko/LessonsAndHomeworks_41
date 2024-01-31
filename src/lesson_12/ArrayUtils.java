package lesson_12;
/*
@date 31.01.2024
@author Sergey Bugaienko
*/

import java.util.Arrays;
import java.util.Random;

/*
Выбирается минимальный элемент массива
минимальное значение меняется местами с первым элементом
Вторая итерация - выбирается мин элемент из оставшейся части массива
меняется местами с первым из оставшихся.

 */
public class ArrayUtils {
    public static void main(String[] args) {

        int[] ints = {11, 0, 77, 33, 24, 56, 83, 99, 105, 45, -8, -15};

        int minIndex = minIndexSearch(ints);
        System.out.println(minIndex + " | " + ints[minIndex]);

        printArr(ints);

        sortArray(ints);

        printArr(ints);

        System.out.println(linearSearch(ints, 100));


        System.out.println(binarySearch(ints, 100));

        int[] testInts = initTestArray(1_000_000);
        int[] searchValues = initTestArray(100);


        long start = System.currentTimeMillis();

        int[] resultOfSearch = new int[10000];

        for (int i = 0; i < 10000; i++) {
            resultOfSearch[i] = linearSearch(testInts, 2005);
        }

        long end = System.currentTimeMillis();

        System.out.println("Linear Search time: " + (end - start));

        start = System.currentTimeMillis();
        sortArray(ints);
        resultOfSearch = new int[10000];

        for (int i = 0; i < 10000; i++) {
            resultOfSearch[i] = binarySearch(testInts, 2005);
        }

        end = System.currentTimeMillis();

        System.out.println("Binary Search time: " + (end - start));


    }

    public static int[] initTestArray(int size) {
        Random random = new Random();
        int[] res = new int[size];

        for (int i = 0; i < res.length; i++) {
            res[i] = random.nextInt(2001) - 1000;
        }

        return res;
    }


    /*
    Делим массив пополам
    Если значение равно искомому - возвращаем индекс.
    Если значение в середине массива больше, чем искомое, значит, если искомое и присутствует в массиве, то оно будет в левой части массива. Значения в правой части можно не проверять
    Если наоборот, значение в середине больше, то искомое может быть только в правой части
    Если оставшуюся часть массива еще можно разделить пополам - возвращаемся в шан номер 1. Делим пополам оставшуюся часть массива
    Если оставшуюся часть уже невозможно разделить - возвращаем -1 - элемент не найден
     */
    public static int binarySearch(int[] array, int searchValue) {

        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0; // счетчик шагов


        // проверяем можно ли разделить массив пополам
        while (startIndex <= endIndex) {
            counter++;

            // вычислить индекс середины
            // 0, 12 -> 0 +  (12-0) / 2 -> 6 |||  7..12 -> 7 + (12-7)/2 -> 9
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // сравниваем на равенство значение "в середине" с искомым
            if (array[middleIndex] == searchValue) {
                System.out.println("Элемент найден! Шагов затрачено: " + counter);
                return middleIndex;
            }

            //надо понять в какой массива может быть искомое значение
            // отбросить не нужную половину массива
            // сместить индексы (указатели)

            if (array[middleIndex] > searchValue) {
                // мы должны отбросить правую часть (то, что справа от "середины"
                endIndex = middleIndex - 1;
            } else {
                // отбрасывает левую часть
                startIndex = middleIndex + 1;
            }
        }

//        System.out.println("Элемент отсутствует. Шагов затрачено: " + counter);
        return -1;

    }

    // Найти элемент в массиве по значению
    // линейный поиск. Индекс элемента на выходы

    public static int linearSearch(int[] ints, int value) {
        // Перебираем все элементы, сравниваем с искомым значением.
        // Если найдено совпадение - возвращаем индекс

        // для того, чтобы сказать / подтвердить, что число отсутствует в массиве
        // нам надо совершить N операций. Сложность / скорость этого алгоритма будет O(n)

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) return i;
        }

        return -1;
    }

    // Сортировка
    public static void sortArray(int[] array) {
        // Мы запускаем цикл. Ищем мин элемент. Меняем местами с "самым левым".
        // Уменьшаем "зону поиска" (смещаем вправо левую границу)

        for (int i = 0; i < array.length; i++) {

            // Находим минимум в текущей части массива
            int minIndex = minIndexSearch(array, i);

            // мне нужно поменять местами значения самого левого и минимального элемента
            // есть индексы. Индекс самого левого элемента i

            int temp = array[i];
            array[i] = array[minIndex]; // одна операция - константная сложность О(1)
            array[minIndex] = temp;

        }
    }

    // Ищем минимальное значение в части массива. Начиная с индекса startIndex
    public static int minIndexSearch(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }


    // метод поиска минимального значения в массиве
    // Будем возвращать индекс минимального элемента
    public static int minIndexSearch(int[] arr) {
        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "]\n"));
        }
    }
}
