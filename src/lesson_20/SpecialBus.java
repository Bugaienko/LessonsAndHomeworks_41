package lesson_20;
/*
@date 12.02.2024
@author Sergey Bugaienko
*/

public class SpecialBus extends Bus {

    private int bicyclePlaces;
    private int bicyclesCount; // по дефолту инициализируется 0


    public SpecialBus(String model, int yearManufactured, int capacity, int bicyclePlaces) {
        super(model, yearManufactured, capacity);
        this.bicyclePlaces = bicyclePlaces;
    }

    public boolean takePassengerWithBicycle() {
        // Есть ли место для
        // 1. Пассажира
        // 2. Велосипеда.
        // если место для обоих - обоих на борт
        // если для кого-то нет места - никого не садим в автобус

        return false;
    }

    public int getBicyclePlaces() {
        return bicyclePlaces;
    }


    public int getBicyclesCount() {
        return bicyclesCount;
    }

    public int example() {
        return super.getCapacity();
    }




}
