package utec.cs.cs2901.design;

public class Main {

    public static void main(String[] args) {
        SensorListUI s1 = new SensorListUI();
        DeviceListUI s2 = new DeviceListUI();

        Sensor s = new Sensor();

        s.attach(s1);
        s.attach(s2);

        s.setState(5);

        s.notifyList();
    }
}
