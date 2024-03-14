package homework_41;
/*
@date 14.03.2024
@author Sergey Bugaienko
*/

import java.util.*;
import java.util.stream.Collectors;

/*
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе
и выведите результат на экране
 */
public class HW41_Task1_2_3 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 11, 8, 68, 342, 0, 37, 77777, 83);

        integers.stream()
                .filter(i -> i > 10)
//                .sorted((i1, i2) -> (i1 % 10) - (i2 % 10))
                .sorted(Comparator.comparingInt(i -> i % 10))
                .forEach(i -> System.out.println("i: " + i));

        List<String> strings = List.of("FFfff", "Aaaa", "ddddddddddd", "ee");

        strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);


//        task2();
        task3();
//        taskByIvan();
    }

    private static void task3() {
        /*
        Необходимо отфильтровать этот список, оставив только чётные числа,
        затем каждое число умножить на 2, и собрать результат в новый список
         */

        List<Integer> integers = List.of(1, 4, 7, 2, 11, 44, 10, 31, 50);

        List<Integer> integerList = integers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println(integerList);
    }

    /*
    Имеется список строк. Используя Stream API, найдите строку с максимальной длиной.

     */
    private static void task2() {
        List<String> strings = new ArrayList<>(List.of("FFfff", "Aaaa", "ddddddddddd", "eeeeeeeeeee", "ee"));
        strings.add(null);

        // пустой список
//        strings = new ArrayList<>();

        Optional<String> optionalString = strings.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(String::length));

        String string;
        string = optionalString.orElse("Пришел null");

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Что-то пошло не так"));

        System.out.println("Max str: " + string);

        string = strings.stream()
                .filter(Objects::nonNull)
                .max((s1, s2) -> s1.length() - s2.length())
//                .max(Comparator.comparingInt(String::length))
                .orElse("Что-то пошло не туда!");

        System.out.println("String opt3: " + string);

        List<String> list = strings.stream()
                .filter(Objects::nonNull)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .limit(2)
                .collect(Collectors.toList());
//                .forEach(System.out::println);

        System.out.println(list);
        // 11 : List<String>>
        // 5: List<String>
        // 4 : List<String>


    }

    private static void taskByIvan() {
        List<String> strings = new ArrayList<>(List.of("FFfff", "Aaaa", "ddddddddddd", "eeeeeeeeeee", "ee"));


        int maxLength = strings.stream()
                .filter(Objects::nonNull)
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse("")
                .length();

        System.out.println(maxLength);

        List<String> maxLengthStrings = strings.stream()
                .filter(Objects::nonNull)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .takeWhile(s -> s.length() == maxLength)
//                .dropWhile(s -> s.length() == maxLength)
                .collect(Collectors.toList());

        System.out.println(maxLengthStrings);

    }
}
