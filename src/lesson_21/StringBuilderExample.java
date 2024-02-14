package lesson_21;
/*
@date 13.02.2024
@author Sergey Bugaienko
*/

public class StringBuilderExample {

    public static void main(String[] args) {

        // StringBuilder - класс для работы с последовательностью символов
        // В отличии от String объекты SB можно изменять после их создания.
        // Это делает его особенно полезным (да и удобным) в ситуациях, когда нам требуется
        // много операций по изменению строки (конкатенация, вставка, вырезание в / из середины строки)
        // Существенно уменьшает нагрузку на память и повышает производительность

        StringBuilder sb = new StringBuilder();

        // append - добавляет строковое представление любого типа данных (строка, число, символ) к текущему объекту SB

        String str = "Hello" + ", " + "World!";
        System.out.println(str);
        sb.append("Hello").append(", ").append("World!");

        //toString - возвращающий строку-представление
        String result = sb.toString();
        System.out.println(result);

        // Hello, World! - написать метод, вставляющий внутрь строки, начиная с индекса Х, другую строку.
        // insert - вставляет строку в указанную позицию текущего SB
        sb.insert(3, "JAVA");
        System.out.println(sb.toString());

        //delete, deleteCharAt - удаление диапазона по индексам, удаление 1 символа по индексу
        sb.delete(3, 6); //первый включительно, второй не включительно. Удалит 3,4,5 символ
        System.out.println(sb.toString());
        sb.deleteCharAt(3);
        System.out.println(sb.toString());

        // reverse() переворачивает содержимое объекта, делая строку зеркальной
        sb.reverse();
        System.out.println(sb.toString());

        // length - возвращает текущее кол-во символов в объекте
        sb.reverse();
        System.out.println(sb.toString());
        System.out.println(sb.length());

        //setLength - устанавливает новую длину последовательности символов
        sb.setLength(11);
        System.out.println(sb.toString());


        // Брат близнец, но работает медленнее, т.к. потокобезопасен.
        StringBuffer stringBuffer = new StringBuffer();


    }
}
