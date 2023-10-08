package adventurepack;

import adventurepack.Weapon;
public class RangedWeapon extends Weapon {

    private int amo;
    public RangedWeapon(String name, String description, int damage,int amo) {
        super(name, description, damage);
        this.amo=amo;
    }

    public int getAmo() {
        return amo;
    }
    public void shoot(){
        amo = amo -1;
    }
}
