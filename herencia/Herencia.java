package herencia;

public class Herencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Juan", "Perez", "Calle Falsa 123", "555-1234", 101, "Gerente", 50000.0);

        Consultor consultor1 = new Consultor();
        consultor1.id = 2;
        consultor1.nombre = "Maria";
        consultor1.apellido = "Gomez";
        consultor1.direccion = "Avenida Siempre Viva 456";
        consultor1.telefono = "555-5678";
        consultor1.especialidad = "Consultoría de Negocios";
        consultor1.tarifa = 150.0;

        System.out.println("Empleado:");
        System.out.println("ID: " + empleado1.id);
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Apellido: " + empleado1.apellido);
        System.out.println("Dirección: " + empleado1.direccion);
        System.out.println("Teléfono: " + empleado1.telefono);
        System.out.println("ID Empleado: " + empleado1.idEmpleado);
        System.out.println("Cargo: " + empleado1.cargo);
        System.out.println("Salario: " + empleado1.salario);

        System.out.println("Consultor:");
        System.out.println("ID: " + consultor1.id);
        System.out.println("Nombre: " + consultor1.nombre);
        System.out.println("Apellido: " + consultor1.apellido);
        System.out.println("Dirección: " + consultor1.direccion);
        System.out.println("Teléfono: " + consultor1.telefono);
        System.out.println("Especialidad: " + consultor1.especialidad);
        System.out.println("Tarifa: " + consultor1.tarifa);
    }
}