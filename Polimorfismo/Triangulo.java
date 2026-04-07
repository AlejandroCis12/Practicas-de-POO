package Polimorfismo;

public class Triangulo extends Figuras {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void area() {
        double area = 0.5 * base * altura;
        System.out.println("Área del triángulo: " + area);
    }
}
