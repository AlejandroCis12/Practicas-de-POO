package EjercicioIntegrador;

public class Pikachu extends Pokemon implements Ielectrico{

    public Pikachu() {
    }
    
    @Override
    public void atacarPlacaje() {
        System.out.println("Pikachu ataca con Placaje!");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Pikachu ataca con aranazo!");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Pikachu ataca con mordisco!");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu ataca con impactrueno!");
    }

    @Override 
    public void atacarPunioTrueno() {
        System.out.println("Pikachu ataca con punio trueno!");
    }

}
