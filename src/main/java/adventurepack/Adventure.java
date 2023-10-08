package adventurepack;

import java.util.ArrayList;
import java.util.Scanner;

public class Adventure {
    private Weapon weapon;
    private Map map;
    private Player player;
    private Item item;

    public Adventure() {
        weapon = new Weapon();
        map = new Map();
        map.buildMap();
        player = new Player();
        player.setCurrentRoom(map.getStarterRoom());
        player.setCurrentWeapon(weapon.getStarterWeapon());
    }

    public void move(String retning) {
        player.move(retning);
    }

    public void look() {
        player.lookAround();
    }

    public void pickUp(String itemName) {
        player.pickUp(itemName);
    }

    public void drop(String itemName) {
        player.drop(itemName);
    }

    public void getInventury() {
        player.getInventory();
    }

    public ArrayList<Item> getRoomItems() {
        return player.getCurrentRoom().getRoomItems();
    }

    public int getHealth() {
        return player.getHealth();
    }

    public void eat(String itemName) {
        player.eat(itemName);
    }

    public void equip(String itemName) {
        player.equip(itemName);
    }
    public void attack(){
        Weapon weapon2 = player.getCurrentWeapon();
        if (weapon2 instanceof RangedWeapon){
            RangedWeapon rangedWeapon = (RangedWeapon) weapon2;
            if (rangedWeapon.getAmo() <= 0){
                System.out.println("out of ammo");
                return;
            }
            System.out.println("you are shooting with Ranged weapon");
            System.out.println("you are doing " + rangedWeapon.getDamage());
            System.out.println("you have " + rangedWeapon.getAmo() + " shots left");
            rangedWeapon.shoot();
        } else if (weapon2 instanceof MeleeWeapon) {
            MeleeWeapon meleeWeapon = (MeleeWeapon) weapon2;
            System.out.println("you are swinging ur Sword");
            System.out.println("you are doing" + meleeWeapon.getDamage());
        } else {
            System.out.println("no weapon, u cannot attack anything");

        }
    }

}



