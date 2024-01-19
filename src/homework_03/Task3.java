package homework_03;
/*
@date 19.01.2024
@author Sergey Bugaienko
*/

/*
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
Вычислите среднюю температуру за неделю и выведете ее на печать.
 */
public class Task3 {
    public static void main(String[] args) {
        int t1 = 8;
        int t2 = 5;
        int t3 = 5;
        int t4 = 5;
        int t5 = 5;
        int t6 = 5;
        int t7 = 5;

        double averageTemp = ((double) t1 + t2 + t3 + t4 + t5 + t6 + t7) / 7;

        System.out.println("averageTemp: " + averageTemp);


    }
}
