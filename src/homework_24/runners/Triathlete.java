package homework_24.runners;
/*
@date 19.02.2024
@author Sergey Bugaienko
*/


/*
Создайте интерфейсы Swimmer и Runner с методами swim и run соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.

Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class Triathlete implements Swimmer, Runner{

    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Триатлет " + name + " бежит");
    }

    @Override
    public void swim() {
        System.out.println("Триатлет " + name + " плывет");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
