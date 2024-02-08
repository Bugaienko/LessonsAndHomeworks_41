package lesson_18;
/*
@date 08.02.2024
@author Sergey Bugaienko
*/

public class MathUtils {

    public static int sumOfInts(int x, int...ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }

        return sum;
    }

    public static int minus (int x, int y) {
        return x - y;
    }
}
