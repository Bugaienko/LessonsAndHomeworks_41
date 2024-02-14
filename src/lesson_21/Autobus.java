package lesson_21;
/*
@date 13.02.2024
@author Sergey Bugaienko
*/

public class Autobus {
    // Для создания связи типа HAS-A мы определяем поле класса,
    // которое будет хранить ссылку на объект другого класса
    //Направленность связи - однонаправленная или двунаправленная связь

    //Кардинальность связи - определяет, сколько объектов одного класса,
    // может быть ассоциировано с объектом другого класса.


    /*
    One-to-One
    Один к одному: Автобус и двигатель. Каждый автобус может иметь только один двигатель.
    И на каждый двигатель приходится только один автобус

    One-to-Many
    Один ко многим - Автобус и пассажиры. Один автобус может перевозить много пассажиров
    У автобуса будет массив пассажиров

    Many-to-Many
    Многие ко многим: Список автобусов и список остановок
    Каждый автобус может останавливаться на множестве остановок.
    Каждая остановка может "обслуживать" множество автобусов
    */


    private BusDriver driver; // агрегация ("мягкая" связь)
    private final Autopilot autopilot; // композиция ("жесткая / не разрывная)

    private int capacity;

    // Организуем связь пассажиров с автобусом. One-to-Many
    private final Passenger[] passengers; // список пассажиров, которые сейчас в автобусе
    private int countPassenger; //количество пассажиров в автобусе в данный момент. И заодно индекс массива?

    //

    public Autobus(BusDriver busDriver, int capacity) {
        this.driver = busDriver;
        busDriver.setAutobus(this);
        autopilot = new Autopilot("AP-005");
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    // посадка пассажира в автобус
    public boolean takePassenger(Passenger passenger) {
        // Надо проверить свободное место.
        // Если есть - добавить пассажира в автобус (в массив пассажиров)
        // возвратить boolean - дающий отчет об "успешности" посадки
        if (countPassenger < capacity) {
            //свободное место есть
            // добавляем пассажира в автобус
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.println("Пассажир сел автобус!");
            return true;

        } else {
            //свободного места нет
            System.out.println("Мест нет. Посадить пассажира в автобус не удалось!");
            return false;
        }
    }


    public void setDriver(BusDriver driver) {
        this.driver = driver;
        driver.setAutobus(this);
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    /*
    HW
    Воспроизвести код, написанный на уроке.

    Переписать метод public String toString()в классе Autobus, используя StringBuilder для формирования строки.
    Добавить в строку информации об автобусе список пассажиров.
     */
    public String toString() {
        //TODO переписать, используя StringBuilder
        //Добавить в эту строку - список пассажиров.
        StringBuilder sb = new StringBuilder("Autobus: { driver: ");
        sb.append(driver.getLicenseNumber())
                .append("; autopilot: ").append(autopilot.getSoftwareVersion()).append("; ");
        sb.append("passengers: ").append(createStringByPassengersList());
        sb.append(" }");

        return sb.toString();

//        return "Autobus: {" + " driver: " + driver.getLicenseNumber() + "; autopilot: "
//                + autopilot.getSoftwareVersion() + " }";
    }

    public String createStringByPassengersList() {
        // Перебрать список пассажиров. "Приклеить" к строке пассажира (в едином виде. id + name)
        // Т.к. пассажир - ссылочный тип данных - приклеивать только не null ссылки
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                //добавляю инфо о пассажире
                Passenger current = passengers[i];
                sb.append("{Passenger: id: ").append(current.getId()).append("; name: ").append(current.getName()).append("}");
                sb.append("; ");
            }
        }

        //Нам надо проверить - был ли добавлен хоть один пассажир.
        // Если был - отрезать 2 последниx символа
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}

/*
Посадка пассажира в автобус
Выход из автобуса
Распечатать список пассажиров в автобусе
 */