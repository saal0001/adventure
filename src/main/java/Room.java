public class Room {
    private Room room;
private Room roomWest;
private Room roomEast;
private Room roomNorth;
private Room roomSouth;
private String description;
private String name;

public Room(String name, String description){
    this.description=description;
    this.name=name;
}

public void setRoomWest(Room roomWest){
    this.roomWest=roomWest;
}

    public void setRoomNorth(Room roomNorth){
        this.roomNorth=roomNorth;
    }

    public void setRoomEast(Room roomEast){
        this.roomEast=roomEast;
    }
    public void setRoomSouth(Room roomSouth){
        this.roomSouth=roomSouth;
    }

    public Room getRoomNorth(){
        return roomNorth;
    }

    public Room getRoomSouth(){
        return roomSouth;
    }

    public Room getRoomEast(){
        return roomEast;
    }

    public Room getRoomWest(){
        return roomWest;
    }


public Room getRoom(Room Room){
    return room;
}

public String getName(){
    return name;
}
public String getDescription(){
    return description;
}

}
