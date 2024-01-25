package lesson_06;
/*
@date 23.01.2024
@author Sergey Bugaienko
*/

public class BooleanExample_2 {
    public static void main(String[] args) {

        // XOR ^ - логическое исключающее ИЛИ
        // Если две части выражения разные - выдает true
        // Если две части выражения одинаковые - выдает false

        boolean bl = true ^ false;
        System.out.println("true ^ false -> " + bl);
        System.out.println("false ^ true -> " + (false ^ true));
        System.out.println("true ^ true -> " + (true ^ true));
        System.out.println("false ^ false -> " + (false ^ false));

        // Логическое сокращенное И (AND) - && - по выдаваемому результату работает аналогично с &

        int a = 5;
        int b = 10;

        a = 0;

        boolean b2 = (a != 0) && (b / a > 5);  //  a=0: false & (???) -> false | a=1: true && (true/false) -?
         System.out.println("(a != 0) && (b / a > 5) -> " + b2);


         // Логическое сокращенное ИЛИ || (OR)  - по выдаваемому результату работает аналогично с |

        boolean b3 = (a == 0) || (b / a > 5); // a =0: true || (???)
        System.out.println("(a != 0) || (b / a > 5) -> " + b3);


        System.out.println("=======================\n");

        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);

        // Порядок выполнения логических операций:


        /*
        1 - !; 2 - &; 3 - ^; 4- |; 5 - &&; 6 - ||
         */

        System.out.println("=============\n");
        System.out.println(true ^ true && false);
        System.out.println(false && false);
        System.out.println(false );

        System.out.println(" ========================== \n");
        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;

        // !;  &;  ^;  |;  &&;  ||

        System.out.println(aa | bb | cc < 100 & !aa ^ qq == 5);
        System.out.println(true | false | 25 < 100 & !true ^ 2 ==5);
        System.out.println(true | false | true & !true ^ false);
        System.out.println(true | false | true & false ^ false);
        System.out.println(true | false | false ^ false);
        System.out.println(true | false | false);
        System.out.println(true | false);
        System.out.println(true);


    }
}
