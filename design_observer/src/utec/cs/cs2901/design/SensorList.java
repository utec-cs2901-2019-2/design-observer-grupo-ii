package utec.cs.cs2901.design;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SensorList {
    private List<MetStation> sensorList=new ArrayList<MetStation>();

    private int state;

    public SensorList() {
        state = 0;
    }

    private void setState(int new_state) {
        Random rand=new Random();
        state = rand.nextInt(50);
        notifyList();
    }

    public int getState(int new_state) {
        return state;
    }

    public void attach(MetStation station){
        sensorList.add(station);
    }
    public void notifyList(){
        for(MetStation s:sensorList){
            s.update();
        }
    }

}
