package homework_05;
/*
@date 23.01.2024
@author Sergey Bugaienko
*/

/*
Даны строки разной длины (длина - четное число)

"string"
"code"
"Practice"
Необходимо распечатать два средних символа строки.
Например, если дана строка "string" - результат будет "ri", для строки "code" результат "od",
для "Practice" результат "ct".
 */

public class Task3 {
    public static void main(String[] args) {
        // Мультикурсор: Держим Shift + Alt - тыкаем левой кнопкой мыши. Для выхода из режима - Esc
        String str = "string";
        String str1 = "code";
        String str2 = "Practice";

        int middleIndex = str1.length() / 2;

//        System.out.println(str2.charAt(middleIndex));
        String substring = str1.substring(middleIndex - 1, middleIndex + 1);

        System.out.println("substring: " + substring);

        System.out.println("" + str1.charAt(middleIndex -1) + str1.charAt(middleIndex));

    }
}
