package lesson_24.transport;
/*
@date 16.02.2024
@author Sergey Bugaienko
*/

public abstract class Transport {

    protected int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract void takePassenger();

    public int getCapacity() {
        return capacity;
    }
}
