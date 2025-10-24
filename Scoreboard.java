import java.util.Scanner;
import java.util.ArrayList;

public class Scoreboard {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in); // creates a new Scanner Object

        // Declare ArrayList Variables
        ArrayList<String> playerNames = new ArrayList<>();
        ArrayList<Integer> playerScores = new ArrayList<>();

        boolean flag = true;

        // while loop to iterate through the menu-interface until the user decides to exit the program
        while (true) {

            // provide user the list of options
            System.out.println("Select an option: ");
            System.out.println("1. Add Player");
            System.out.println("2. Delete Player");
            System.out.println("3. View Players");
            System.out.println("4. Exit");

            System.out.println("Enter your choice [1/2/3/4]: ");
            int choice = Integer.parseInt(in.nextLine());

            if (choice==1){

                // prompt the user the player's name and input it
                System.out.print("Enter player name: ");
                String playerName = in.nextLine();

                // prompt the user the player's score and input it
                System.out.print("Enter player score: ");
                int playerScore = Integer.parseInt(in.nextLine());

                // add the inputted values to the arraylists respectively
                playerNames.add(playerName);
                playerScores.add(playerScore);

                System.out.println("Player added.");

                // clean out the output screen
                System.out.println();
            }
        }
    }
}