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

            System.out.print("Enter your choice [1/2/3/4]: ");
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

            else if (choice==2){

                // prompt the user for the index which they want to remove the player in
                int arraylistlength = playerScores.size()-1;
                System.out.print("Enter the index of the player to delete (0 to " + arraylistlength + ") : " );
                int indexToDelete = Integer.parseInt(in.nextLine());

                // for-loop to parse through the arrays and delete the target set of data
                for (int i = 0; i < playerScores.size(); i++){

                    // if branch to check if the target index is equal to the index in the arraylist
                    if (indexToDelete==i){
                        playerNames.remove(i); // delete the playername
                        playerScores.remove(i); // delete the player score
                        i--;
                    }
                }

                System.out.print("Player deleted.");
                System.out.println();

            }

            else if (choice==3){

                // output formatting

                System.out.println("Player List:");
                System.out.println("------------------");

                // parse through both the arraylists and print out the results

                for (int i = 0; i < playerNames.size(); i++){

                    // print out the player's name and score in a proper formatting
                    System.out.println(playerNames.get(i) + " - " + playerScores.get(i));
                }

                System.out.println();
            }

            else if (choice==4){
                flag = false;
            }
        }
    }
}