package utec.cs.cs2901.design;

public class main {

    public static void main(String[] args) {
        SensorListUI s1 = new SensorListUI();
        DevicesListUI s2 = new DevicesListUI();

        SensorList s = new SensorList();

        s.attach(s1);
        s.attach(s2);

        s.setState(5);

        s.notifyList();
    }
}
