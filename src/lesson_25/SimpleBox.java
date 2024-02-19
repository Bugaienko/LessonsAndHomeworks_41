package lesson_25;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/

public class SimpleBox {

    private Object value;

    public SimpleBox(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SimpleBox {" +
                "value=" + value +
                '}';
    }
}
