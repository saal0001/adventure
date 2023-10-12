package adventurepack;

public class Enemy {
    private String name;
    private String race;
    private int health;
    private Weapon weapon;


    public Enemy(String name, String race, int health, Weapon axe) {
        this.name = name;
        this.race = race;
        this.health = health;
        this.weapon = new MeleeWeapon("axe", "Bloody axe", 15);
    }


    public void enemyAttack() {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
