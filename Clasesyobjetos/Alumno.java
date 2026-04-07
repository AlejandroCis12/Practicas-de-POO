package Clasesyobjetos;
public class Alumno {
// Atributos de la clase Alumno
    int id;
    String nombre;
    String apellido;

// Constructor de la clase Alumno

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

// Método para saludar al alumno  
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " " + apellido);
    }

    public void saberAprobado(double calificacion){
        if(calificacion >= 6.0){
            System.out.println("El alumno " + nombre + " " + apellido + " ha aprobado con una calificación de " + calificacion);
        } else {
            System.out.println("El alumno " + nombre + " " + apellido + " no ha aprobado con una calificación de " + calificacion);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }


    public static void main(String[] args) {
        // Crear un objeto de la clase Alumno
        Alumno alumno1 = new Alumno(1, "Alejandro", "Sanchez");
        Alumno alumno2 = new Alumno();
        
        // Llamar al método saludar del alumno
        alumno1.saludar();
        
        // Llamar al método saberAprobado con una calificación
        alumno1.saberAprobado(7.5);
        alumno1.saberAprobado(5.0);

        System.out.println("La id del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre del alumno 1 es: " + alumno1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alumno1.getApellido());

        System.out.println("---------------------------------");
        // Usar los setters para asignar valores al alumno2
        alumno2.setId(2);   
        alumno2.setNombre("Maria");
        alumno2.setApellido("Gomez");
        // Llamar al método saludar del alumno2
        alumno2.saludar();  
        System.out.println("La id del alumno 2 es: " + alumno2.getId());
        System.out.println("El nombre del alumno 2 es: " + alumno2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alumno2.getApellido());   
        // Modificar el apellido del alumno1 usando el setter 
        System.out.println("---------------------------------");
        alumno1.setApellido("Cisneros");
        System.out.println("La id del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre del alumno 1 es: " + alumno1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alumno1.getApellido());
    }
}