package lesson_27.generics;
/*
@date 21.02.2024
@author Sergey Bugaienko
*/

import util.MyArrayList;
import util.MyList;

public class TestExtends {

    public static void main(String[] args) {
        // строгая типизация. На стадии компиляции - ошибка
        System.out.println(GenericMethods.sum(Long.valueOf(1500)));

        System.out.println(GenericMethods.sum(Double.valueOf(5.76), 5.43, 6, 8.43));


        //
        MyList<? super Integer> list = new MyArrayList<Number>();
        list.add(123);

        Integer intg = (Integer) list.get(0);
        System.out.println(intg);

        MyList<Integer> integerList = new MyArrayList<>();
        integerList.addAll(100, 34, 54);

        MyList<String> stringList = new MyArrayList<>();
        stringList.addAll("Srting", "hello");

        double result = GenericMethods.printListSum(integerList);
        System.out.println(result);

        // Ошибка на этапе компиляции
        // double result1 = GenericMethods.printListSum(stringList);

    }
}
