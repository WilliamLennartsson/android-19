
public class Pokemon {
    private String name;
    private String type;
    private int hp;
    private int fullHp;
    private int level;
    private boolean isFainted = false;

    public Pokemon(String name, String type, int hp, int level){
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.fullHp = hp;
        this.level = level;
    }

    public String toString() {
        return "Level: " + this.level + " " + this.name + ". Hp left: " + this.hp;
    }

    public void healPokemonToFull() {
        this.hp = this.fullHp;
    }
    public String getName() {
        return this.name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isFainted() {
        return isFainted;
    }

    public void setFainted(boolean fainted) {
        this.isFainted = fainted;
    }
}
