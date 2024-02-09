package lesson_19.dontShow;
/*
@date 09.02.2024
@author Sergey Bugaienko
*/

public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        Test.setTest(10000);
        System.out.println(test.getTest());

    }
}
