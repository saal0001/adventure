package adventurepack;
import java.util.ArrayList;
import java.util.Scanner;

public class Adventure {
private Map map;
private Player player;
private Item item;
    public Adventure() {
        map = new Map();
        map.buildMap();
        player=new Player();
        player.setCurrentRoom(map.getStarterRoom());
    }

public void move(String retning){
        player.move(retning);
}

public void look(){
        player.lookAround();
}

public void pickUp(String itemName){
        player.pickUp(itemName);
}

public void drop(){
        player.drop(item);
}

public void getInventury(){
        player.getInventory();
}

public ArrayList<Item> getRoomItems(){
        return player.getCurrentRoom().getRoomItems();
}


}



