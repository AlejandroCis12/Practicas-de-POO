package Interfaces;

public class Circulo implements Figura , Dibujable, Rotable{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo...");
    }

    @Override
    public void rotar() {
        System.out.println("Rotando el círculo...");
    }
    
}
