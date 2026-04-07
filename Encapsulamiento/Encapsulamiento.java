package Encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {
        Alumno alumno2 = new Alumno();
        Alumno alumno1 = new Alumno(1, "Juan", "Pérez");
        System.out.println("ID: " + alumno1.getId());
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Apellido: " + alumno1.getApellido());

        // Modificando los datos del alumno
        alumno1.setNombre("Carlos");
        alumno1.setApellido("Gómez");
        System.out.println("Nombre modificado: " + alumno1.getNombre());
        System.out.println("Apellido modificado: " + alumno1.getApellido());
    }
}
