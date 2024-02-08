package lesson_17.ra;
/*
@date 07.02.2024
@author Sergey Bugaienko
*/

public class ArrayTest {
    public static void main(String[] args) {

        RubberArray ra = new RubberArray();

        ra.add(10, 15, -6, -1, -16, 99, 0, 15);

        System.out.println(ra.toString());

        System.out.println("size: " + ra.size());

        System.out.println(ra.get(3));
        System.out.println(ra.get(9));


        System.out.println(ra.toString());

        int[] ints = {10, 56, -53, 0, 1, 77, 43};
        RubberArray rubberArray = new RubberArray(ints);

        System.out.println("arrayArray from array: " + rubberArray.toString());
        System.out.println(rubberArray.indexOf(-53));
        System.out.println(rubberArray.indexOf(10000));

        System.out.println("remove: " + rubberArray.remove(2));
        System.out.println(rubberArray.toString());


        rubberArray.showCursor();

        rubberArray.add(100);
        System.out.println(rubberArray.toString());

        rubberArray.removeByValue(100);
        rubberArray.removeByValue(10);
        rubberArray.add(55, 55, 55, 18, 55);
        System.out.println(rubberArray.toString());

        System.out.println(rubberArray.removeByValue(1000));


    }
}
