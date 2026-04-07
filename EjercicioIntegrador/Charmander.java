package EjercicioIntegrador;

public class Charmander extends Pokemon implements Ifuego{

    public Charmander() {   
    }
    
    @Override
    public void atacarPlacaje() {
        System.out.println("Charmander ataca con Placaje!");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Charmander ataca con aranazo!");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Charmander ataca con mordisco!");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander ataca con lanzallamas!");
    }

    @Override 
    public void atacarPuniofuego(){
        System.out.println("Charmander ataca con punio fuego!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataca con ascuas!");
    }
}
