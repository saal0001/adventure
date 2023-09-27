package adventurepack;

import java.util.Scanner;

public class Adventure {
    private Maps maps=new Maps();
    private String retning;
    private String help;


    public void lookAround() {
        System.out.println(maps.currentRoom.getName() + ": " + maps.currentRoom.getDescription());
    }


    public Adventure() {
    }

    public void move(String retning) {
        Room currentRoom = maps.currentRoom;
        Room nextRoom = currentRoom.getRoom(retning);
        if (nextRoom != null) {
            maps.currentRoom = nextRoom;

            System.out.println("Going " + retning);
        } else {
            // Udskriver fejlmeddelelse
            System.out.println("You cannot go that way");
        }
    }

    public String getHelp() {
        return help;
    }


}
