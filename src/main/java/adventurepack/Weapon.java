package adventurepack;

public class Weapon extends Item {
    private int damage;
    public Weapon(String name, String description,int damage) {
        super(name, description);
        this.damage=damage;
    }
}
