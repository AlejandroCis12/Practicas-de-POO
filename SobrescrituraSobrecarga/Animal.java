// Sobrescritura y Sobrecarga en Java
package SobrescrituraSobrecarga;
public abstract class Animal {
    // Método para sobrescribir
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    // Métodos para sobrecargar
    public void hacerSonido(String sonido) {
        System.out.println("El animal hace el sonido: " + sonido);
    }

    // Sobrecarga con diferentes parámetros
    public void hacerSonido(String sonido, int veces) {
        System.out.println("El animal hace el sonido: " + sonido + " " + veces + " veces");
    }
    
    public abstract void comer(); // Método abstracto para que las subclases lo implementen
}