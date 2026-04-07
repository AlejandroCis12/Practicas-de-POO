package EjercicioIntegrador;

public class Main {
    public static void main(String[] args) {
        Squirtle Squirtle = new Squirtle();
        Charmander Charmander = new Charmander();
        Bulbasaur Bulbasaur = new Bulbasaur();
        Pikachu Pikachu = new Pikachu();

        Squirtle.atacarPlacaje();
        Squirtle.atacarHidrobomba();
        Charmander.atacarPlacaje();
        Charmander.atacarLanzallamas();
        Bulbasaur.atacarPlacaje();
        Bulbasaur.atacarLatigoCepa();
        Pikachu.atacarPlacaje();
        Pikachu.atacarImpactrueno();

    }
}
