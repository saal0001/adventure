package adventurepack;

import java.util.ArrayList;
import java.util.Scanner;

public class Adventure {
    private Weapon weapon;
    private Map map;
    private Player player;

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

    public void attack() {
        player.attack();
    }

    public void unequip(String itemName) {
        player.unequip(itemName);
    }


}



