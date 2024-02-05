package homework_14;
/*
@date 05.02.2024
@author Sergey Bugaienko
*/

/*
Написать метод, принимающий строку и один или два индекса (перегрузка).
Метод должен возвращать подстроку начиная с первого индекса (включительно) и заканчивая вторым индексом (не включительно)
Если индекс 1 - начиная с индекса и до конца строки.

Функционал повторяет метод String.substring(), так что этот метод использовать не нужно.
Оригинальный метод ломает программу, если введены не корректные индексы. Наш метод аварийно завершать программу не должен.
 */

public class HW14_Task2 {

    public static void main(String[] args) {
        String str = "0123456789"; // 2, 5 --> char[3]; 0 .. 2

        System.out.println(substring(str, 2 ,5));
        System.out.println(substring(str, 2));
        System.out.println(substring(str, 5, 3));
    }


    public static String substring(String string, int startIdx) {
        return substring(string, startIdx, string.length());
    }

    public static String substring(String string, int startIdx, int endIndex) {

        if (string == null || startIdx < 0
                || startIdx > string.length()
                || endIndex > string.length()
                || endIndex <= startIdx ) return "";

        // Option 1
        char[] chars = new char[endIndex - startIdx];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = string.charAt(i + startIdx);
        }


        String result = "";

        //Option 2
        for (int i = startIdx; i < endIndex; i++) {
            result += "" + string.charAt(i);
        }

//        return result;
        return String.valueOf(chars);
    }
}
