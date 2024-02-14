package homework_21;
/*
@date 14.02.2024
@author Sergey Bugaienko
*/

public class Memory extends Component{

    private int capacity;

    public Memory(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }
}
