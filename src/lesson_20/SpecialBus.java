package lesson_20;
/*
@date 12.02.2024
@author Sergey Bugaienko
*/

/*
HW
В классе SpecialBus реализовать метод public boolean takePassengerWithBicycle() - посадка в автобус пассажира с велосипедом
 */


public class SpecialBus extends Bus {

    private int bicyclePlaces; // всего мест в автобусе для велосипедов // capacity
    private int bicyclesCount; // по дефолту инициализируется 0 // сколько сейчас в автобусе велосипедов


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


        if (bicyclesCount < bicyclePlaces && takePassenger()) { // место для велосипеда есть, тогда пытаемся взять пассажира
//            boolean isPassengerEntry = takePassenger(); //
//            if (isPassengerEntry) { //  пассажира посадили в автобус


            // Если есть место для вело и пассажир сел в автобус
            bicyclesCount++; // берем на бор велосипед
            System.out.println("Пассажир и велосипед сели а автобус: " + getModel());
            return true;
//            }
        }

        // здесь окажемся, если велосипед и/или пассажир не поместились в автобус
        System.out.println("Пассажир и велосипед НЕ поместились в автобус: " + getModel());
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
