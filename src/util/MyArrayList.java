package util;
/*
@date 06.02.2024
@author Sergey Bugaienko
*/

public class MyArrayList <T> implements MyList<T> {

    private T[] array;
    private int cursor; // присвоено значение по умолчанию 0
    private static final int MULTIPLAYER = 2;



    @SuppressWarnings("unchecked") // подавляем предупреждение компилятора о непроверяемом приведении типа
    public MyArrayList() {
        array = (T[]) new Object[10];
    }

    // ++ Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
    @SuppressWarnings("unchecked")
    public MyArrayList(int[] ints) {
        array = (T[]) new Object[ints.length * MULTIPLAYER];

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }

    // Добавлять в массив элемент
    @Override
    public void add(T value) {
        // Добавлять значение в наш массив

        // проверка. Есть ли место в нашем внутреннем массиве?

        if (cursor > array.length * 0.9) {
            expandArray(); // метод расширяющий наш массив
        }

        array[cursor++] = value;
    }

    //Добавлять в массив сразу несколько элементов
    public void add(int... ints) {
        // ints - я могу с ним обращаться точно так же как с ссылкой на массив

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }


    // Динамическое изменение размера массива
    @SuppressWarnings("unchecked")
    private void expandArray() {
//        System.out.println("Расширяем массив! ================= " + cursor);
        // 1. создать новый массив бОльшего размера
        // 2. Переписать значения из старого массива в новый
        // 3. Перебросить ссылку

        T[] newArray = (T[]) new Object[array.length * MULTIPLAYER]; // создаю новый массив, в 2 раза больше предыдущего

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписать значения из старого массива в новый
        }

        array = newArray; // 3. Перебросить ссылку. Переменная array теперь хранит ссылку на "новый" массив
        //System.out.println("Расширение массива завершено ==================\n");
    }

    //Вывод в консоль значений массива
    public String toString() {
        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

    // Текущее количество элементов в массиве
    public int size() {
        return cursor;
    }

    //Возвращение значения по индексу
    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            return Integer.MIN_VALUE; // хорошего решения на этой стадии нет
            //TODO Поправить потом
        }
    }

    // Поиск элемента по значению (у нас есть значение, надо узнать есть ли такое значение в массиве
    public int indexOf(int value) {
        // так int, в качестве значение, а не индекса - проверять нам его не нужно
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) return i;
        }

        return -1;
    }

    public void showCursor() {
        System.out.println("array[cursor-1]= " + array[cursor-1]);
        System.out.println("array[cursor]= " + array[cursor]);
    }

    //    Удаление элемента по индексу
    public int remove(int index) {
        // 1. Проверка
        if (index < 0 && index >= cursor) {
            // такого индекса в массиве нет
            return Integer.MIN_VALUE;
        }

        int value = array[index];

        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }

        cursor--;

        return value;
    }

    public boolean removeByValue(int value){
        // Понять есть ли такой элемент в массиве
        // Если нет - вернуть false и закончить работу методы
        // если есть - получить его индекс
        // переиспользовать метод, удаляющий по индексу.

        int index = indexOf(value);
        // Ctrl + Alt + <- вернуть курсор на предыдущую позицию

        if (index == -1) return false;

        remove(index);
        return true;

    }


}

/*
+ 1. Динамическое изменение размера массива
+ 2. Добавлять в массив элемент
3. Добавлять в массив сразу несколько элементов
+ 4. Вывод в консоль значений массива
++ Текущее количество элементов в массиве
++ Возвращение значения по индексу
++ Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
++ Поиск элемента по значению
++ Удаление элемента по индексу
++ Удаление элемента по значению
Замена значения по индексу (есть индекс и новое значение)
Замена значения по значению (есть старое и новое значение)

 */

/*
В резиновом массиве должны быть реализованы методы:

 */