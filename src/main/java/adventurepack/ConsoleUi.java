package adventurepack;

import java.util.Scanner;

public class ConsoleUi {
    Scanner scanner = new Scanner(System.in);
    boolean fortsæt = true;
    private Adventure adventure;
    private Player player;
    private Map map;

    public ConsoleUi(){
        adventure = new Adventure();
        map = new Map();
        player = new Player();

    }


    public void run() {
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
                    player.getHelp();
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
        map.buildMap();

        while (true) {
            System.out.println("Enter a command: ");
            String command = new Scanner(System.in).nextLine();
            switch (command) {
                case "go north":
                    player.move("north");
                    break;
                case "go east":
                    player.move("east");
                    break;
                case "go south":
                    player.move("south");
                    break;
                case "go west":
                    player.move("west");
                    break;
                case "look around":
                    player.lookAround();
                    break;
                case "help":
                    player.getHelp();
                    break;
                case "quit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }


}