package adventurepack;

public class Adventure {
    private Map map =new Map();
    private String retning;
    private String help;


    public void lookAround() {
        System.out.println(map.getCurrentRoom().getName() + ": " + map.getCurrentRoom().getDescription());
    }


    public Adventure() {
    }

    public void move(String retning) {
        Room currentRoom = map.getCurrentRoom();
        Room nextRoom = currentRoom.getRoom(retning);
        if (nextRoom != null) {
            map.setCurrentRoom(nextRoom);

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
