package adventurepack;

public class Weapon extends Item {
    private int damage;
    public Weapon(String name, String description,int damage) {
        super(name, description);
        this.damage=damage;
    }

    public String getName(){
        return super.getName();
    }

    public String getDescription(){
        return super.getDescription();
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name=" + getName() +'\'' +
                ", description="+ getDescription()+ '\'' +
                ", damage=" + damage +
                '}';
    }
}
