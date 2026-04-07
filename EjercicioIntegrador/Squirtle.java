package EjercicioIntegrador;

public class Squirtle extends Pokemon implements Iagua{

    public Squirtle() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Squirtle ataca con Placaje!");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Squirtle ataca con aranazo!");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Squirtle ataca con mordisco!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataca con pistola agua!");
    }

    @Override 
    public void atacarHidrobomba() {
        System.out.println("Squirtle ataca con hidrobomba!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataca con burbuja!");
    }
    
}
