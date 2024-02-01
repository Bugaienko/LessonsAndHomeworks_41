package homework_12;
/*
@date 01.02.2024
@author Sergey Bugaienko
*/

/*
на вход принимает массив целых чисел и число - длину нового массива.
Метод должен создать и распечатать массив заданной в параметрах длинны.
В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
 */
public class HW12_Task3 {
    public static void main(String[] args) {
        int[] testArr = {0, 1, 2, 3, 4, 5, 6};

        copyOfArray(testArr, 3);


    }

    public static void copyOfArray(int[] ints, int newLength) {
        int[] result = new int[newLength];


        for (int i = 0; i < result.length && i < ints.length; i++) {
            result[i] = ints[i];
        }

        printArray(result);


    }

    public static void printArray(int[] ints) {
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? "; " : "]\n"));

        }
    }
}
