package homework_07;
/*
@date 25.01.2024
@author Sergey Bugaienko
*/

/*
Распечатать 10 строк: “Task1”. “Task2”. … “Task10”.
Используем цикл while
 */
public class Task3 {
    public static void main(String[] args) {

        int count = 1;

        while (count <= 10) {
            System.out.println("Task" + count);
            count++;
        }

    }
}
