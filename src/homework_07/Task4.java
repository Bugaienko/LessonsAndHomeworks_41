package homework_07;
/*
@date 25.01.2024
@author Sergey Bugaienko
*/

/*
Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка.
Используем цикл while
 */
public class Task4 {
    public static void main(String[] args) {
        int i = 1; // счетчики цикла общепринято называть i, j, k

        int countNumber = 0;

        while (i <= 100 && countNumber < 7) { // true && true
            System.out.println("Текущее число:" + i);

            if (i % 5 == 0) {
                System.out.println("========== Делится на 5 без остатка! ======== " + i);
                countNumber++;
                i += 5;
            } else {
                i++;
            }
        }
    }
}
