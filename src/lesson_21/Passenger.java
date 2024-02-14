package lesson_21;
/*
@date 13.02.2024
@author Sergey Bugaienko
*/

public class Passenger {

    private static int counterId;
    private final int id;
    private String name;

    public Passenger(String name) {
        this.name = name;
        this.id = ++counterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
