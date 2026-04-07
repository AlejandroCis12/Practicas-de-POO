package SobrescrituraSobrecarga;

public class Perro extends Animal {
    // Sobrescribiendo el método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    // Implementando el método abstracto comer
    @Override
    public void comer() {
        System.out.println("El perro come croquetas");
    }
    
}
