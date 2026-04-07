package Polimorfismo;

public class Circulo extends Figuras {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void area() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Área del círculo: " + area);
    }
}
