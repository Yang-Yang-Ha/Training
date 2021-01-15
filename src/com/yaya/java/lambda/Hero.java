package lambda;

/**
 * @author Stephen
 */
public class Hero {

    private String name;
    private float hp;

    private int damage;

    Hero(String name, float hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ",hp=" + hp + ",damage=" + damage + "]"+System.getProperty(System.lineSeparator());
    }


    public int compare(Hero hero){
        return Float.compare(hero.getHp(),getHp());
    }
}
