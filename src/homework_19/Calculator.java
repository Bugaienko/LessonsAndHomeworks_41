package homework_19;
/*
@date 12.02.2024
@author Sergey Bugaienko
*/

/*
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять базовые арифметические операции: сложение, вычитание, умножение и деление.

Класс должен содержать: Статические методы для каждой операции, принимающие два аргумента и возвращающие результат операции.
 */
public class Calculator {

    public static double add(double x, double y) {
        double result = x + y;
        return result;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static int divide(int x, int y) {
        if (y == 0) return Integer.MAX_VALUE;
        return x / y;
    }
}
