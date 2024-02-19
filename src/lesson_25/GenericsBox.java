package lesson_25;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/

public class GenericsBox <T> { // E, K, V
    private T value;

    public GenericsBox(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void  setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericsBox {" +
                "value=" + value +
                '}';
    }
}
