package adventurepack;

public class Player {
    private Room currentRoom;

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
