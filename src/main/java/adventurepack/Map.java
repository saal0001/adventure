package adventurepack;

public class Map {
    private Room currentRoom;
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;
    private Room room6;
    private Room room7;
    private Room room8;
    private Room room9;


    public void buildMap() {
        this.room1 = new Room("room1", "dark big room with a waterfall and skeletons at the wall");
        this.room2 = new Room("room2", "you are in a room with no ceiling. you can see the sun and a bright rainbow");
        this.room3 = new Room("room3", "you are in a room full of diffrent minerals very bright and beautifull");
        this.room4 = new Room("room4", "you are in a smelly room full of eggshells");
        this.room5 = new Room("room5", "This room is very dark, u can only see the waterhole in the middle");
        this.room6 = new Room("room6", "very bright room filled with mushrooms, and flowers");
        this.room7 = new Room("room7", "this room only has a door, nothing else");
        this.room8 = new Room("room8", "there is only 2 chairs and a table in this room, its painted red");
        this.room9 = new Room("room9", "big cave, with drawings on the wall and old dead rat on the floor");

        this.room1.setEast(this.room2);
        this.room1.setSouth(this.room4);

        this.room2.setWest(this.room1);
        this.room2.setEast(this.room3);

        this.room3.setWest(this.room2);
        this.room3.setSouth(this.room6);

        this.room4.setNorth(this.room1);
        this.room4.setSouth(this.room7);

        this.room5.setSouth(this.room8);

        this.room6.setSouth(this.room9);
        this.room6.setNorth(this.room3);

        this.room7.setNorth(this.room4);
        this.room7.setEast(this.room8);

        this.room8.setEast(this.room9);
        this.room8.setWest(this.room7);
        this.room8.setNorth(this.room5);

        this.room9.setNorth(this.room6);
        this.room9.setWest(this.room8);

        this.currentRoom = this.room1;
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public void setCurrentRoom(Room newRoom){
        this.currentRoom=newRoom;
    }

}
