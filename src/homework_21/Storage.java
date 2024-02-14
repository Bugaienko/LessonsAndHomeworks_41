package homework_21;
/*
@date 14.02.2024
@author Sergey Bugaienko
*/

public class Storage extends Component{

    private int volume;

    public Storage(String brand, String model, int volume) {
        super(brand, model);
        this.volume = volume;
    }
}
