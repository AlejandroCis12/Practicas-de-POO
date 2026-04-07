package Interfaces;

public class Cuadrado implements Figura, Dibujable{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double x, double y, double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado...");
    }

}
