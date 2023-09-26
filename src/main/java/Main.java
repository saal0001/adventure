import java.util.Scanner;
public class Main {
    public static void main(String[]args){
Adventure adventure = new Adventure();
Scanner keyboard = new Scanner(System.in);

String retning= keyboard.nextLine();


    adventure.move(retning);
        System.out.println(adventure.getRetning());



    }
}
