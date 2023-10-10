package adventurepack;

public class Enemy {
private String name;
private String race;
private int health;
private Weapon axe;

public Enemy(String name,String race,int health,Weapon axe){
    this.name=name;
    this.race=race;
    this.health=health;
    this.axe=new MeleeWeapon("axe","Bloody axe",15);
}

Enemy troll= new Enemy("jason","troll",90,axe);

public Item deadEnemy(){
    if (troll.health==0){
        System.out.println("enemy dead");
    }
    return axe;
}

public void enemyAttack(){

    }

}
