package homework_11;
/*
@date 31.01.2024
@author Sergey Bugaienko
*/

/*
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Перегрузить метод,
если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке,
а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

Еще одна перегрузка: метод принимает массив и булевый флаг.
Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
 */
public class HW11_Task1 {
    public static void main(String[] args) {
        int[] testArr = {1, 4, 3, 6, 7};
        printReverseArray(testArr, 2);

        printReverseArray(testArr);

        printReverseArray(testArr, false);

    }

    public static void printReverseArray(int[] array, int index) {
        // 1. надо перебрать индексы по возрастанию от 0 до index и распечатать все элементы с этими индексами
        // 2. надо перебрать индексы по убыванию от index до максимального индекса в массиве (длина - 1) и распечатать все элементы с этими индексами

        System.out.print("[");
        for (int i = 0; i < index; i++) { // при index = 0 ни разу не выполнится
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : ""));
        }

        for (int i = array.length - 1; i >= index; i--) { // при index = array.length
            System.out.print(array[i] + ((i > 0) ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void printReverseArray(int[] array) {
        printReverseArray(array, 0);
    }

    public static void printReverseArray(int[] array, boolean flag) {
        if (flag) { // печатает массив в обратном порядке
            printReverseArray(array);
        } else { // прямой порядок
            printReverseArray(array, array.length);
        }
    }

}
