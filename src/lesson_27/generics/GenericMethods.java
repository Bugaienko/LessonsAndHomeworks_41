package lesson_27.generics;
/*
@date 21.02.2024
@author Sergey Bugaienko
*/

import util.MyList;

public class GenericMethods {

    // Ограничиваем диапазон принимаемых типов данных.
    // Ограничение сверху
    public static <T extends Number> int sum(T... elements) {
        int sum = 0;
        for (T value: elements) {
            sum += value.intValue();
        }

        return sum;
    }


    // ? - Wild Card  - "любой тип данных, являющиеся наследником Number
    public static double printListSum(MyList<? extends Number> listNumber) {
        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();
        }

        System.out.println("Сумма элементов: " + sum);
        return sum;
    }
}
