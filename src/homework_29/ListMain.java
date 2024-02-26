package homework_29;
/*
@date 26.02.2024
@author Sergey Bugaienko
*/

import util.MyLinkedList;
import util.MyList;
import util.MyQueue;

import java.util.Arrays;

public class ListMain {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();
//        list.add("Str");

        String[] strings = list.toArray();

        System.out.println(Arrays.toString(strings));

        System.out.println(list.remove("Str"));
        System.out.println(list);

        list.addAll("Str1", "Str2", "Str3", "Str4", "Str5", "Str6", "Str7");
        System.out.println(list.remove(0));
        System.out.println(list);

        System.out.println(list.remove(4));
        System.out.println(list);

        MyLinkedList<Integer> list1 = new MyLinkedList<>();

//        list1.addAll(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        MyList<Integer> list2 = new MyLinkedList<>();
        MyQueue<Integer> queue = new MyLinkedList<>();


    }
}
