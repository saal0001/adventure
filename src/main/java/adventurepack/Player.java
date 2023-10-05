package adventurepack;

import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
private int health=100;
private Weapon currentWeapon;



public void equip(String itemName){
    for (Item item : inventory){
        if (item.getName().equalsIgnoreCase(itemName)){
            if (item instanceof Weapon){
                item=currentWeapon;
                System.out.println(currentWeapon);
                inventory.remove(item);
            }
        }
        else System.out.println("item not equippable");
    }
    System.out.println("item not in inventory");
}




    public void eat(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                if (item instanceof Food) {
                    health = ((Food) item).getHealthPoints() + health;
                    inventory.remove(item);
                }
            }
            else System.out.println("not edible");
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

    public void setCurrentRoom(Room newRoom) {
        this.currentRoom = newRoom;
    }

    public void move(String retning) {
        Room nextRoom = currentRoom.getRoom(retning);
        if (nextRoom != null) {
            currentRoom = nextRoom;

            System.out.println("Going " + retning);
        } else {
            // Udskriver fejlmeddelelse
            System.out.println("You cannot go that way");
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
