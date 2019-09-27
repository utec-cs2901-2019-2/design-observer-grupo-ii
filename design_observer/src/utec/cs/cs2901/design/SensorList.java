package utec.cs.cs2901.design;
import java.util.ArrayList;
import java.util.List;

public class SensorList {
    private List<MetStation> sensorList=new ArrayList<MetStation>();

    public void attach(MetStation station){
        sensorList.add(station);
    }
    public void notifyList(){
        for(MetStation s:sensorList){
            s.update();
        }
    }

}
