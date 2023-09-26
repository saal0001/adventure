import java.util.Scanner;
public class UserInterface {
    private Adventure adventure=new Adventure();
Scanner keyboard = new Scanner(System.in);

    public void startGame() {
        System.out.println("do you want to start the game(y/n)");
        String question= keyboard.nextLine();
        if (question.equals("y")){
            runTime();
        }
        else {
            System.out.println("end game");
        }

    }

    public void runTime(){
        adventure.buildMap();
        System.out.println("welcome to the adventure game");

        while (adventure.getCurrentRoom()!=adventure.room5){
        System.out.println("you are in "+adventure.getCurrentRoom().getName());
        String retning =keyboard.nextLine();
        adventure.move(retning);
        System.out.println(adventure.getCurrentRoom().getName()+" " + adventure.getCurrentRoom().getDescription());
    }
}
}

