
public class Main {

    public static void main(String[] args) {

        Ash ash = new Ash();

        Pikachu pika = new Pikachu(100, 1);
        Weedle weedle = new Weedle(50, 2);

        ash.catchPokemon(pika);
        ash.catchPokemon(weedle);

        Ash misty = new Ash();
        Pokemon mistysWeedle = new Weedle(100, 3);
        misty.catchPokemon(mistysWeedle);

        if (ash.initBattle(misty)) {
            trainerBattle(ash, misty);
        }

    }

    public static void trainerBattle(Trainer t1, Trainer t2) {
        if (t1 instanceof Ash) {
            Ash ash = (Ash)t1;
            Ash misty = (Ash)t2;
            Fighter ashsFirstPokemon = (Fighter) ash.pokemons.get(0);
            Fighter mistysFirstPokemon = (Fighter) misty.pokemons.get(0);
            fight(ashsFirstPokemon, mistysFirstPokemon);
        }
    }

    public static void fight(Fighter fighter1, Fighter fighter2) {
        while(true) {
            int f1Damage = fighter1.attack();
            fighter2.takeDamage(f1Damage);

            int f2Damage = fighter2.attack();
            fighter1.takeDamage(f2Damage);

            if (fighter1.isFainted() || fighter2.isFainted()) {
                break;
            }
        }
        System.out.println(fighter1);
        System.out.println(fighter2);
    }

    /*
    
    public static void fight(Pokemon p1, Pokemon p2) {
         weedle -> pokemon
           pokemon -> weedle, pikachu
        if (p1 instanceof Weedle){
            System.out.println("Shit run dude");
            Weedle weedle = (Weedle)p1;
        }

        System.out.println(p1);
        System.out.println("VS.");
        System.out.println(p2);
        System.out.println("FIGHT!");

        p2.takeDamage(p1.attack());
        p1.takeDamage(p2.attack());

        System.out.println(p1);
        System.out.println(p2);

    }*/

    public static void hospitalize(Pokemon p) {
        p.healPokemonToFull();
    }

}
