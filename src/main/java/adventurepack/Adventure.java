package adventurepack;
import java.util.Scanner;

public class Adventure {
private Map map;
private Player player;
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



}


