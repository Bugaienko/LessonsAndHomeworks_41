package lesson_12;
/*
@date 31.01.2024
@author Sergey Bugaienko
*/

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

    }

    // Сортировка
    public static  void  sortArray(int[] array) {
        // Мы запускаем цикл. Ищем мин элемент. Меняем местами с "самым левым".
        // Уменьшаем "зону поиска" (смещаем вправо левую границу)

        for (int i = 0; i < array.length; i++) {

            // Находим минимум в текущей части массива
            int minIndex = minIndexSearch(array, i);

            // мне нужно поменять местами значения самого левого и минимального элемента
            // есть индексы. Индекс самого левого элемента i

            int temp = array[i];
            array[i] = array[minIndex];
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

    public static void  printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length -1 ) ? ", " : "]\n"));
        }
    }
}
