package EjercicioIntegrador;

public class Bulbasaur extends Pokemon implements Iplanta{

    public Bulbasaur() {
    }
    

    @Override
    public void atacarPlacaje() {
        System.out.println("Bulbasaur ataca con Placaje!");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Bulbasaur ataca con aranazo!");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Bulbasaur ataca con mordisco!");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur ataca con latigo cepa!");
    }

    @Override 
    public void atacarDrenadoras() {
        System.out.println("Bulbasaur ataca con drenadoras!");
    }

    @Override
    public void atacarParalizadora() {
        System.out.println("Bulbasaur ataca con paralizadora!");
    }
    
    
}
