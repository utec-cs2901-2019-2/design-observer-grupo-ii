package utec.cs.cs2901.design;
import java.util.ArrayList;
import java.util.List;

public class SensorList {
    private List<MetStation> sensorList=new ArrayList<MetStation>();

    private int state;

    public SensorList() {
        state = 0;
    }

    public void setState(int new_state) {
        state = new_state;
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
