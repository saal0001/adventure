package adventurepack;

import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory=new ArrayList<>();
    private Item pickup;

    public void pickUp(Item item){
        inventory.add(item);
    }
public void setCurrentRoom(Room newRoom){
    this.currentRoom=newRoom;
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
        System.out.println(currentRoom.getName() + ": " + currentRoom.getDescription());
    }

}
