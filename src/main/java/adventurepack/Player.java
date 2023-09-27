package adventurepack;

public class Player {
    private Map map =new Map();

    public void move(String retning) {
        map.buildMap();
        Room currentRoom = map.getCurrentRoom();
        Room nextRoom = currentRoom.getRoom(retning);
        if (nextRoom != null) {
            map.setCurrentRoom(nextRoom);
            System.out.println("Going " + retning);
        } else {
            System.out.println("You cannot go that way");
        }
    }
    public void lookAround() {
        System.out.println(map.getCurrentRoom().getName() + ": " + map.getCurrentRoom().getDescription());
    }
    void getHelp() {
        System.out.println("Welcome to help");
        System.out.println("You can write the commands, go north, go east, go south, go west to choose which way to go");
        System.out.println("You can also use the command Look around, to look around the room, and get a description of ur surroundings");
    }
}
