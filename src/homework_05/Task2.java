package homework_05;
/*
@date 23.01.2024
@author Sergey Bugaienko
*/
/*
 Создайте строки:

"Java"
"is"
"a"
"powerful"
"language"
Из созданных строк склейте двумя разными способами строку: "Java is a powerful language"

Распечатать эту строку и ее длину

Task 02.2 Заменить в результирующей строке слово "powerful" на "super" Содержит ли строка подстроку "age"?
Создайте переменную boolean типа c ответом
 */
public class Task2 {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = "is";
        String str2 = "a";
        String str3 = "powerful";
        String str4 = "language";

        String concatStr = String.join(" ", str, str1, str2, str3, str4);

        concatStr = str.concat(" ")
                .concat(str1).concat(" ")
                .concat(str2).concat(" ")
                .concat(str3).concat(" ")
                .concat(str4);

        System.out.println(concatStr);
        System.out.println("Длина строки: " + concatStr.length()) ;

        boolean isContainAge = concatStr.contains("age");

        System.out.println("isContainAge: " + isContainAge);

    }
}
