package lesson_22;
/*
@date 14.02.2024
@author Sergey Bugaienko
*/

public class Hamster extends Animal{

    @Override // Аннотация.
    public void voice() {
        System.out.println("Hamster say Hrum-hrum");
    }

    // Перегрузка = статический полиморфизм.
    public void voice(String string) {
        System.out.println("Hamster say: " + string);
    }

    @Override // Переопределяем метод toString класса Object
    public String toString() {
        return "Hamster";
    }
}
