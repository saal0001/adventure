package adventurepack;

public class Item {
    private String name;
    private String description;
    private Item item1;
    private Item item2;
    private Item item3;
    private Item item4;
    private Item item5;
    private Item item6;

    public Item(String name, String description){
        this.name=name;
        this.description=description;
    }

    public void Items(){
        item1=new Item("flash light", "can light up the room");
        item2=new Item("fishing rod", "piece of useles metal");
        item3=new Item("hammer", "weak weapon");
        item4=new Item("sword", "good weapon");
        item5=new Item("shield", "use to defend");
        item6=new Item("keys", "use to open up a room");
    }

    public Item getItem1(){
        return item1;
    }



}
