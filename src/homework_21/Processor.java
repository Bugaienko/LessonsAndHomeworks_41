package homework_21;
/*
@date 14.02.2024
@author Sergey Bugaienko
*/

public class Processor extends Component {
    private int tactSpeed;

    public Processor(String brand, String model, int tactSpeed) {
        super(brand, model);
        this.tactSpeed = tactSpeed;
    }
}
