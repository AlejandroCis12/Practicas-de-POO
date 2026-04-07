package herencia;
public class Empleado extends Persona {
    int idEmpleado;
    String cargo;
    double salario;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String direccion, String telefono, int idEmpleado, String cargo, double salario) {
        super(id, nombre, apellido, direccion, telefono);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void main(String[] args) {
    }
}
