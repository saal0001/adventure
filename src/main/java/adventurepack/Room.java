package adventurepack;

import java.time.LocalDate;
import java.util.ArrayList;

public class Room {
    private Room west;
    private Room east;
    private Room north;
    private Room south;
    private String description;
    private String name;
    private String Room;
    private ArrayList<Item> roomItems=new ArrayList<Item>();

    public Room(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public void setWest(Room west) {
        if (this.west != west) {
            this.west = west;
            west.setEast(this);
        }
    }

    public void setNorth(Room north) {
        if (this.north != north) {
            this.north = north;
            north.setSouth(this);
        }
    }

    public void setEast(Room east) {
        if (this.east != east) {
            this.east = east;
            east.setWest(this);
        }
    }

    public void setSouth(Room south) {
        if (this.south != south) {
            this.south = south;
            south.setNorth(this);
        }


    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Room getRoom(String direction) {
        switch (direction) {
            case "north":
                return north != null ? north : null;
            case "east":
                return east != null ? east : null;
            case "south":
                return south != null ? south : null;
            case "west":
                return west != null ? west : null;
            default:
                return null;


        }
    }

    public ArrayList<Item> getRoomItems(){
        return roomItems;
    }

public void addItem(String name, String description){
        roomItems.add(new Item(name,description));
}

public void addFood(String name, String description,int healthPoints){
        roomItems.add(new Food(name, description,healthPoints));
}

public void addWeapon(String name, String description,int damage){
        roomItems.add(new Weapon(name,description,damage));
}

}




