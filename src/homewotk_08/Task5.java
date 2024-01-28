package homewotk_08;

/*
Дан массив строк. Вывести на экран все символы из самой длинной строки массива

{ “One”, “Two”, “Twenty” } -->
 */
public class Task5 {
    public static void main(String[] args) {

        String[] strings = {"One", "Two", "Twenty", "hello", "world"};

        String longestStr = strings[0];

        int i = 0;
        while (i < strings.length) {
            String currentElement = strings[i];
            if (currentElement.length() > longestStr.length()) {
                longestStr = currentElement;
            }
            i++;
        }

        System.out.println("Longest: " + longestStr);

        char[] chars = longestStr.toCharArray(); // преобразует строку в соответствующий массив символо

        int k = 0;
        while (k < chars.length) {
            System.out.println(chars[k++]);
        }

        System.out.println(" ======================== ");

        int j = 0;
        while (j < longestStr.length()) {
            System.out.println(longestStr.charAt(j++));
        }


    }
}
