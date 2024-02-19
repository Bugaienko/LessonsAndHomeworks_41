package lesson_25;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/

public class GenericMethods {
    public static <T> void printBoxes(GenericsBox<T>[] boxes) {
        for (GenericsBox<T> box : boxes) {
            System.out.println(box + "; ");
        }
    }

    // в контексте
}
