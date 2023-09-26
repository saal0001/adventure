
public class Adventure {
    private Room currentRoom;


    Room room1 = new Room("room 1", "you are in a dark big room with a waterfall and skeletons at the wall");
    Room room2 = new Room("room 2", "you are in a room with no ceiling. you can see the sun and a bright rainbow");
    Room room3 = new Room("room 3", "you are in a room full of diffrent minerals verry bright and beautyfull");
    Room room4 = new Room("room 4", "you are in a smelly room full of feces ");
    Room room5 = new Room("room 5", "you made it out the cave");
    Room room6 = new Room("room 6", "you are in a verry hot room. the stones a glowing a bit");
    Room room7 = new Room("room 7", "you are in a room filled with water. you have to croos the lake to get to the other room");
    Room room8 = new Room("room 8", "you are in a battle arena");
    Room room9 = new Room("room 9", "you are in a room that looks like a kitchen or what used to be one");

    public void buildMap() {
        int start=0;

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
        currentRoom=room1;

    }





    Room nextRoom=null;

    public void move(String retning) {

        //currentRoom=room1;
        // Får det aktuelle rum
        Room currentRoom = this.currentRoom;

        // Kontrollerer om man kan flytte i den angivne retning

        switch (retning){
            case "go north":
                nextRoom=currentRoom.getRoomNorth();
                break;
            case "go south":
                nextRoom=currentRoom.getRoomSouth();
                break;
            case "go east":
                nextRoom=currentRoom.getRoomEast();
                break;
            case "go west":
                nextRoom=currentRoom.getRoomWest();
        }
       // Room nextRoom = currentRoom.getRoom();
        if (nextRoom != null) {
            currentRoom =
            // Flytter til det nye rum
            this.currentRoom = nextRoom;

            // Udskriver bevægelsesretning
            //System.out.println("Going " + retning);
        } else {
            // Udskriver fejlmeddelelse
            System.out.println("You cannot go that way");
        }
    }
                       
    public Room getCurrentRoom(){
        return currentRoom;
    }

    public void help() {
        switch () {
            case "help","h","Help":
                System.out.println("welcome to help");
                System.out.println("you can write go north, go east, go south, go west to choose witch way to go");
                System.out.println("you can look around the room youre in to get a description of the room");
        }
    }

}

