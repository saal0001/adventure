package adventurepack;

import java.time.LocalDate;

public class Map {
    private Room starterRoom;
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;
    private Room room6;
    private Room room7;
    private Room room8;
    private Room room9;

    public Map() {

    }


    public void buildMap() {

        room1 = new Room("room1", "dark big room with a waterfall and skeletons at the wall");
        room1.addItem("flashlight", "use to light up the room");
        room1.addFood("apple", "can increase your health with 10 after consumption", 10);
        room2 = new Room("room2", "you are in a room with no ceiling. you can see the sun and a bright rainbow");
        room2.addItem("bottle", "can hold water");
        room3 = new Room("room3", "you are in a room full of diffrent minerals very bright and beautifull");
        room4 = new Room("room4", "you are in a smelly room full of eggshells");
        room4.addRangedWeapon("Bow", "use to fight monsters", 20, 10);
        room4.addFood("expired bread", "old piece of bread with mold around it", -5);
        room5 = new Room("room5", "This room is very dark, u can only see the waterhole in the middle");
        room5.addItem("necklace of perseverance", "a necklace worn by the legendary hero of soandia");
        room6 = new Room("room6", "very bright room filled with mushrooms, and flowers");
        room7 = new Room("room7", "this room only has a door, nothing else");
        room7.addMeleeWeapon("sword", "use to fight monsters", 15);
        room7.setEnemy(new Enemy("gargoyle", "troll", 60, new Weapon("axe", "Bloody axe which looks cool", 15)));
        room8 = new Room("room8", "there is only 2 chairs and a table in this room, its painted red");
        room9 = new Room("room9", "big cave, with drawings on the wall and old dead rat on the floor");
        room9.addFood("a weird looking potion", "could increase or decrease a stat", -15);


        this.room1.setEast(this.room2);
        this.room1.setSouth(this.room4);

        room2.setWest(this.room1);
        room2.setEast(this.room3);

        room3.setWest(this.room2);
        room3.setSouth(this.room6);

        room4.setNorth(this.room1);
        room4.setSouth(this.room7);

        room5.setSouth(this.room8);

        room6.setSouth(this.room9);
        room6.setNorth(this.room3);

        room7.setNorth(this.room4);
        room7.setEast(this.room8);

        room8.setEast(this.room9);
        room8.setWest(this.room7);
        room8.setNorth(this.room5);

        room9.setNorth(this.room6);
        room9.setWest(this.room8);

    }

    public Room getStarterRoom() {
        return starterRoom = room1;
    }


}
