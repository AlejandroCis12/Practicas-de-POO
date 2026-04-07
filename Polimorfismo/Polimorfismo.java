package Polimorfismo;

public class Polimorfismo {
    
    public static void main(String[] args) {

        // Creación de objetos de diferentes figuras
        Figuras figura1 = new Circulo(5);
        Figuras figura2 = new Triangulo(4, 6);
        Figuras figura3 = new Cuadrado(3);



        figura1.area();
        figura2.area();
        figura3.area();

    //El polimorfismo hace que podamos tratar a los objetos de diferentes clases de la misma manera, siempre y cuando hereden de una clase común. En este caso, todos los objetos son tratados como instancias de la clase Figuras, lo que nos permite llamar al método area() sin preocuparnos por el tipo específico de figura que estamos manejando.
    Figuras vector [] = new Figuras[3];
    vector[0] = new Circulo(5);
    vector[1] = new Triangulo(4, 6);
    vector[2] = new Cuadrado(3);

    }
}
