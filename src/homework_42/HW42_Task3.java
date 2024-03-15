package homework_42;
/*
@date 15.03.2024
@author Sergey Bugaienko
*/

import lesson_42.groupBy.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HW42_Task3 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", 2500, 25, "developer", "IT"),
                new Employee("Silvia", 1500, 22, "trainee", "IT"),
                new Employee("Stefan", 2500, 30, "PM", "IT"),
                new Employee("Olivia", 2700, 25, "manager", "Management"),
                new Employee("Sebastian", 3500, 25, "chef", "Management"),
                new Employee("Hanna", 1300, 25, "Cleaner", "Cleaning"),
                new Employee("John", 3200, 19, "chef", "IT")
        ));

//        task1(employees);
        task3(employees);

    }

    private static void task1(List<Employee> employees) {
        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(map);
    }

    /*
    Дан список Employee.
    Вычислите среднюю зарплату сотрудников в каждом отделе и найдите отдел с максимальной средней зарплатой.
     */

    private static void task3(List<Employee> employees) {

        //группировка по отделам с вычислением средней зп

        Map<String, Double> averageSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(empl -> empl.getSalary())));

        /*
        System.out.println(averageSalaries.keySet());
        System.out.println(averageSalaries.values());

        Set<Map.Entry<String, Double>> entrySet = averageSalaries.entrySet();

        for (Map.Entry<String, Double> entry : entrySet) {
            System.out.println("key: " +  entry.getKey());
            System.out.println("value: " + entry.getValue());
        }
         */

        System.out.println(averageSalaries);

        Map.Entry<String, Double> maxAverage = averageSalaries.entrySet()
                .stream()
                .max((entry1, entry2) ->  entry1.getValue().compareTo(entry2.getValue()))
                .orElse(null);

        Map.Entry<String, Double> maxAverage2 = averageSalaries.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        //

        System.out.println("Отдел с максимальной зарплатой:");
        if (maxAverage != null) {
            System.out.println(maxAverage.getKey() + " | ср.зп: " + maxAverage.getValue());
        }

        System.out.println(maxAverage2.getKey() + " | ср.зп: " + maxAverage2.getValue());


    }
}
