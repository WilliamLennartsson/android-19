
public class Pikachu extends Pokemon implements Fighter{

    public Pikachu(int hp, int level) {
        super("Pikachu", "Electric", hp, level);
    }

    public void talk() {
        System.out.println("Pika pika");
    }

    @Override
    public int attack() {
        if (!this.isFainted()) {
            System.out.println(this.getName() + " used Blixtar å dunder");
            return 20;
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
        System.out.println("PIKAAAaaaa...a.");
    }
}
