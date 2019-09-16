
public class Weedle extends Pokemon implements Fighter{

    public Weedle(int hp, int level) {
        super("Weedle", "Bug", hp, level);
    }

    @Override
    public int attack() {
        if (!this.isFainted()) {
            System.out.println(this.getName() + " used poison sting!");
            return 9;
        }
        return 0;
    }

    @Override
    public void takeDamage(int damage) {
        this.setHp(this.getHp() - damage);
        if (this.getHp() < 1) {
            this.faint();
        }
    }

    @Override
    public void faint() {
        this.setFainted(true);
        System.out.println("Weeeeee...e.. :(");
    }
}
