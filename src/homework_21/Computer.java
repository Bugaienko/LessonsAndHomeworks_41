package homework_21;
/*
@date 14.02.2024
@author Sergey Bugaienko
*/

/*
Компьютер и компоненты

Создайте базовый класс Component с полями brand (бренд) и model (модель).

Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
Реализуйте отношение композиции между Computer и компонентами.
Компонент не может существовать без компьютера.
 */

public class Computer {
    private String model;

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(String model) {
        this.model = model;
        processor = new Processor("AMD", "Ryzen-7",  2500);
        memory = new Memory("Samsung", "EVo PRO", 16000);
        storage = new Storage("WD", "Baracuda", 1000);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Computer {");
        stringBuilder.append("processor: ").append(processor.getModel()).append("; ");
        stringBuilder.append("}");

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Computer computer = new Computer("ROG-AMD");
        System.out.println(computer.toString());
    }
}


