package homework_42;

import java.util.Arrays;
import java.util.function.Function;

/*
@date 15.03.2024
@author Sergey Bugaienko
*/
/*
Разбейте строку на слова, используя в качестве разделителя пробел.
Используя функцию reduce верните суммарное количество букв в словах, которые длиннее 4 символов
 */
public class HW42_Task1 {
    public static void main(String[] args) {

        String text = "Hello, world and good! afternoon";
        int countLetters = countLetters(text);
        System.out.println("countLetters: " + countLetters);
        System.out.println("countLetters2: " + countLetters2(text));
    }

    private static int countLetters(String text) {
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        return Arrays.stream(words)
                .map(String::length)
                .filter(i -> i > 4)
               //                .reduce(0, (i1, i2) -> i1 + i2)
                .reduce(0, Integer::sum);

    }

    private static int countLetters2(String text) {
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        long count = Arrays.stream(words)
                .filter(word -> word.length() > 4)
                .flatMapToInt(String::chars)
                .count();
//                .mapToObj(i -> (char) i)
//                .filter(Character::isAlphabetic)
//                .peek(System.out::println)
//                .count();

        return (int)count;

    }

}
