package lesson_29;
/*
@date 23.02.2024
@author Sergey Bugaienko
*/

import util.MyLinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();


        linkedList.add(100);
        System.out.println(linkedList);

        linkedList.addFirst(50);
        System.out.println(linkedList);


        linkedList.add(200);
        linkedList.add(300);

        linkedList.addFirst(10);

        System.out.println(linkedList);

        System.out.println("remove Value: " + linkedList.remove());
        System.out.println(linkedList);

        System.out.println("remove Value: " + linkedList.remove());
        System.out.println(linkedList);


        System.out.println("removeLast(): " + linkedList.removeLast());
        System.out.println(linkedList);

        System.out.println("removeLast(): " + linkedList.removeLast());
        System.out.println("removeLast(): " + linkedList.removeLast());
        System.out.println(linkedList);

        System.out.println("removeLast(): " + linkedList.removeLast());

        linkedList.add(555);
        System.out.println(linkedList);

        System.out.println("lastIndexOf(555): " + linkedList.lastIndexOf(555));
        linkedList.remove();

        System.out.println(linkedList.lastIndexOf(151));

        System.out.println("\n =============== \n");


        linkedList.addAll(0, 1, 2, 3, 4, 5, 6, 7);
        System.out.println(linkedList);

        int index = linkedList.indexOf(3);
        System.out.println("index 3: " + index);
        System.out.println(linkedList.indexOf(7));
        System.out.println(linkedList.indexOf(100));

        Integer[] result = linkedList.toArray();
        System.out.println(Arrays.toString(result));

    }
}
