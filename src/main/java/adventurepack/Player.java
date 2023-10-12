package adventurepack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
    private int health = 100;
    private Weapon currentWeapon;


    public void attack() {
        Weapon weapon2 = getCurrentWeapon();
        if (weapon2 instanceof RangedWeapon) {
            RangedWeapon rangedWeapon = (RangedWeapon) weapon2;
            if (rangedWeapon.getAmo() <= 0) {
                System.out.println("out of ammo");
                return;
            }
            System.out.println("you are shooting with " + getCurrentWeapon().getName());
            System.out.println("you are doing " + rangedWeapon.getDamage() + " damage");
            System.out.println("you have " + rangedWeapon.getAmo() + " shots left");
            rangedWeapon.shoot();
        } else if (weapon2 instanceof MeleeWeapon) {
            MeleeWeapon meleeWeapon = (MeleeWeapon) weapon2;
            System.out.println("you are swinging ur " + getCurrentWeapon().getName());
            System.out.println("you are doing" + meleeWeapon.getDamage() + " damage");
        } else {
            System.out.println("no weapon, u cannot attack anything");

        }
    }

    public void unequip(String itemName) {
        if (currentWeapon.getName().equals(itemName)) {
            inventory.add(currentWeapon);
        }
        currentWeapon = null;
    }

    //equp metoden virker
    public void equip(String itemName) {
        Item found = null;
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                if (item instanceof Weapon) {
                    found = item;
                    System.out.println(found);
                    this.setCurrentWeapon((Weapon) item);
                } else System.out.println("not equippable");
            }
        }
        inventory.remove(found);
    }


    public void eat(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                if (item instanceof Food) {
                    health = ((Food) item).getHealthPoints() + health;
                    inventory.remove(item);
                }
            } else System.out.println("not edible");
        }
        System.out.println("not in inventory");
    }


    public void pickUp(String itemName) {
        Item found = null;
        for (Item item : currentRoom.getRoomItems())
            if (item.getName().equals(itemName)) {
                inventory.add(item);
                found = item;
            }
        currentRoom.getRoomItems().remove(found);
    }

    public void drop(String itemName) {
        Item found = null;
        for (Item item : currentRoom.getRoomItems())
            if (item.getName().equals(itemName)) {
                inventory.remove(item);
            }
        currentRoom.getRoomItems().add(found);
    }

    public void getInventory() {
        if (inventory != null) {
            System.out.println(inventory);
        }
    }

    public void setCurrentWeapon(Weapon newWeapon) {
        this.currentWeapon = newWeapon;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentRoom(Room newRoom) {
        this.currentRoom = newRoom;
    }

    public void move(String retning) {
        Room nextRoom = currentRoom.getRoom(retning);
        if (nextRoom != null) {
            currentRoom = nextRoom;
            if (nextRoom.getEnemy() != null) {
                System.out.println("there is an enemy u have to fight in this room");
                fight(currentRoom.getEnemy());
            }
            System.out.println("Going " + retning);
        } else {
            // Udskriver fejlmeddelelse
            System.out.println("You cannot go that way");
        }
    }

    public void fight(Enemy fightenemy) {
        int enemyhealth = fightenemy.getHealth();
        while (true) {
            System.out.println("enter command");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            switch (command) {
                case "attack":
                    if (getCurrentWeapon() != null) {
                        enemyhealth = enemyhealth - getCurrentWeapon().getDamage();
                        if (enemyhealth <= 0) {
                            System.out.println("The enemy is dead, it drops its weapon");
                            this.currentRoom.addWeapon(fightenemy.getWeapon());
                            this.currentRoom.setEnemy(null);
                            return;
                        }
                        System.out.println("ur enemy has " + enemyhealth + " health, u hit him for " + getCurrentWeapon().getDamage());
                        Weapon enemyweapon = fightenemy.getWeapon();
                        health = health - enemyweapon.getDamage();
                        System.out.println("u have " + health + " health, he hit u for " + enemyweapon.getDamage() + " 1damage");

                    } else {
                        System.out.println("u cant attack");
                        return;


                    }
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }

    }

    public void lookAround() {
        System.out.println(currentRoom.getName() + ": " + currentRoom.getDescription() + " " + currentRoom.getRoomItems());
    }


    public Room getCurrentRoom() {
        return currentRoom;
    }

    public int getHealth() {
        return health;
    }

}
