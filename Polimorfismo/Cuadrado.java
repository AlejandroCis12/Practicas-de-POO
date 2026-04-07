package Polimorfismo;

public class Cuadrado extends Figuras {
    
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void area() {
        double area = Math.pow(lado, 2);
        System.out.println("Área del cuadrado: " + area);
    }
}
