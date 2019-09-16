
import java.util.ArrayList;

public class Ash implements Trainer{
    ArrayList<Pokemon> pokemons = new ArrayList<>();
    int ballsRemaining = 5;


    @Override
    public boolean initBattle(Trainer t) {
        return true;
    }

    @Override
    public void hypeBattle() {
        System.out.println("GO TEAM ASH");
    }

    @Override
    public void catchPokemon(Pokemon p) {
        pokemons.add(p);
    }
}
