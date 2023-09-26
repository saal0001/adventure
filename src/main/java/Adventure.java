import java.util.Scanner;

public class Adventure {
    private String retning;
    private String help;
    private Room currentRoom;

    public void buildMap() {
        Room room1 = new Room("room1", "dark big room with a waterfall and skeletons at the wall");
        Room room2 = new Room("room2", "you are in a room with no ceiling. you can see the sun and a bright rainbow");
        Room room3 = new Room("room3", "you are in a room full of diffrent minerals verry bright and beautyfull");
        Room room4 = new Room("room4", "you are in a smelly room full of ");
        Room room5 = new Room("room5", "dark big room with a waterfall and skeletons at the wall");
        Room room6 = new Room("room6", "dark big room with a waterfall and skeletons at the wall");
        Room room7 = new Room("room7", "dark big room with a waterfall and skeletons at the wall");
        Room room8 = new Room("room8", "dark big room with a waterfall and skeletons at the wall");
        Room room9 = new Room("room9", "dark big room with a waterfall and skeletons at the wall");

        room1.setRoomEast(room2);
        room1.setRoomSouth(room4);
        room2.setRoomWest(room1);
        room2.setRoomEast(room3);
        room3.setRoomWest(room2);
        room3.setRoomSouth(room6);
        room4.setRoomNorth(room1);
        room4.setRoomSouth(room7);
        room5.setRoomSouth(room8);
        room6.setRoomSouth(room9);
        room6.setRoomNorth(room3);
        room7.setRoomNorth(room4);
        room7.setRoomEast(room8);
        room8.setRoomEast(room9);
        room8.setRoomWest(room7);
        room8.setRoomNorth(room5);
        room9.setRoomNorth(room6);
        room9.setRoomWest(room8);
    }

    public String getRetning() {
        return retning;
    }

    Scanner keyboard = new Scanner(System.in);

    public void move(Room retning) {
        // Får det aktuelle rum
        Room currentRoom = this.currentRoom;

        // Kontrollerer om man kan flytte i den angivne retning
        Room nextRoom = currentRoom.getRoom();
        if (nextRoom != null) {
            // Flytter til det nye rum
            this.currentRoom = nextRoom;

            // Udskriver bevægelsesretning
            System.out.println("Going " + retning);
        } else {
            // Udskriver fejlmeddelelse
            System.out.println("You cannot go that way");
        }
    }

    public String getHelp() {
        return help;
    }

    public void help(String tekst) {
        switch (tekst) {
            case "help":
                System.out.println("welcome to help");
                System.out.println("you can write go north, go east, go south, go west to choose witch way to go");
                System.out.println("you can look around the room youre in to get a description of the room");
        }
    }
}
