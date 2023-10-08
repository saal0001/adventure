package adventurepack;

import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
private int health=100;
private Weapon currentWeapon;


//equp metoden virker
public void equip(String itemName){
    Item found = null;
    for (Item item : inventory){
        if (item.getName().equalsIgnoreCase(itemName)){
            if (item instanceof Weapon){
                found= item;
                System.out.println(found);
                this.setCurrentWeapon((Weapon) item);
            }
            else System.out.println("not equippable");
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

    public void setCurrentWeapon(Weapon newWeapon){
    this.currentWeapon=newWeapon;
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
