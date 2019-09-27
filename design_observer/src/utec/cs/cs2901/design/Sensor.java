package utec.cs.cs2901.design;

public class Sensor {
    String nombre;
    int state;

    public String getNombre() {
        return nombre;
    }

    public void setState(int new_state) {}
        state = new_state;
        notifyList();
    }

    public void setState(int new_state) {}
        state = new_state;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
