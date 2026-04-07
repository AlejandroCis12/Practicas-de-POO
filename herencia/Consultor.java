package herencia;
public class Consultor extends Persona {

    String especialidad;
    double tarifa;

    public Consultor() {
    }

    public Consultor(int id, String nombre, String apellido, String direccion, String telefono, String especialidad, double tarifa) {
        super(id, nombre, apellido, direccion, telefono);
        this.especialidad = especialidad;
        this.tarifa = tarifa;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public static void main(String[] args) {
    }
    
}
