package homework_22.transport;
/*
@date 15.02.2024
@author Sergey Bugaienko
*/

/*
Создайте иерархию классов для разных типов транспортных средств:

Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы).

Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.

Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).

Создайте массив транспортных средств разных типов.
Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.
 */

public class Vehicle {

    private final long id;
    private static long idCounter;

    private Engine engine;

    public Vehicle() {
        this.id = idCounter++;
    }

    public void startEngine() {
        // метод без базовой реализации
    }

    public long getId() {
        return id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
