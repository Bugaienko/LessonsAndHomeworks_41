package homework_04;
/*
@date 22.01.2024
@author Sergey Bugaienko
*/

/*
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.
Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.
Затем преобразуйте каждую букву в верхний регистр, используя арифметические операции, и выведите результат.
 */
public class HW04_Task1 {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';

        System.out.println("До: " + ch1);
        // Ваш код
//        ch1 = (char) (ch1 - 32);
        ch1 -= 32; // ch1 = ch1 - 32;
        System.out.println("После: " + ch1);
        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;
        ch5 -= 32;

        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);
        System.out.print(ch4);
        System.out.println(ch5);
//        System.out.printf("%d", 1);
        System.out.println("" + ch1 + ch2 + ch3 + ch4 + ch5);



    }
}

