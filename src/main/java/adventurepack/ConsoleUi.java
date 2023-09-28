package adventurepack;

import adventurepack.Adventure;
import java.util.Scanner;

public class ConsoleUi {
    Scanner scanner = new Scanner(System.in);
    boolean fortsæt = true;
    private Adventure adventure = new Adventure();



    public void run() {
        adventure = new Adventure();
        while (fortsæt) {
            System.out.println("Welcome to the adventure game");
            System.out.println("\nMENU: ");
            System.out.println("1: Start game");
            System.out.println("2: Get help");
            System.out.println("3: Exit program");

            System.out.println("Choose an option: ");
            int menuValg = scanner.nextInt();

            switch (menuValg) {
                case 1:
                    startGame();
                    break;
                case 2:
                    getHelp();
                    break;
                case 3:
                    fortsæt = false;
                    break;
                default:
                    System.out.println("Invalid imput");
            }
        }
    }

    private void startGame() {
        // Build the map

        while (true) {
            System.out.println("Enter a command: ");
            String command = new Scanner(System.in).nextLine();

            switch (command) {
                case "go north":
                    adventure.move("north");
                    break;
                case "go east":
                    adventure.move("east");
                    break;
                case "go south":
                    adventure.move("south");
                    break;
                case "go west":
                    adventure.move("west");
                    break;
                case "look around":
                    adventure.look();
                    break;
                case "pick up":
                    adventure.pickUp();
                    break;
                case "drop":
                    adventure.drop();
                    break;
                case "inventory":
                    adventure.getInventury();
                    break;
                case "help":
                    getHelp();
                    break;
                case "quit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    private void getHelp() {
        System.out.println("Welcome to help");
        System.out.println("You can write the commands, go north, go east, go south, go west to choose which way to go");
        System.out.println("You can also use the command Look around, to look around the room, and get a description of ur surroundings");
    }
}