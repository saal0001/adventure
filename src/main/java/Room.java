public class Room {
    private String room;
private String roomWest;
private String roomEast;
private String roomNorth;
private String roomSouth;
private String description;
private String name;

public Room(String name, String description){
    this.description=description;
    this.name=name;
}

public void setRoomWest(Room room){
    this.roomWest=roomWest;
}

    public void setRoomNorth(Room room){
        this.roomNorth=roomNorth;
    }

    public void setRoomEast(Room room){
        this.roomEast=roomEast;
    }
    public void setRoomSouth(Room room){
        this.roomSouth=roomSouth;
    }

public String getRoom(){
    return room;
}

public String getName(){
    return name;
}
public String getDescription(){
    return description;
}

}
