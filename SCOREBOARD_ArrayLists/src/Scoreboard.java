import java.util.Scanner;
import java.util.ArrayList;

public class Scoreboard{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in); // creates a scanner object 'in'

        // create all the necessary arraylist variables
        ArrayList<String> playerNames = new ArrayList<>();
        ArrayList<Integer> playerScores = new ArrayList<>();

        boolean flag = true; // creates a flag variable to be the loop variable for the while loop next

        while(flag){

            // prompts the user with the given options
            System.out.println("Select an option: ");
            System.out.println("1. Add Player");
            System.out.println("2. Delete Player");
            System.out.println("3. View Players");
            System.out.println("4. Exit");

            // prompts the user to enter their choice
            System.out.print("Enter your choice [1/2/3/4]: ");
            int choice = in.nextInt();
            in.nextLine();

            // choice to add a player's records
            if (choice==1){

                // prompts the user to enter player name and inputs it
                System.out.print("Enter player name: ");
                String playerName = in.nextLine();

                // prompts the user to enter player score and inputs it
                System.out.print("Enter player score: ");
                int playerScore = in.nextInt();
                in.nextLine();

                // add the inputted values into the respective arraylists
                playerNames.add(playerName);
                playerScores.add(playerScore);
                System.out.println("Player added.");
                System.out.println(); // to clean the output
            }

            // choice to delete a player's records
            else if (choice==2){

                // prompts the user to enter the index of the player which they want to delete and input it
                int listLength = playerNames.size()-1;
                System.out.print("Enter the index of the player to delete (0 to " + listLength + "): ");
                int indexToDelete = in.nextInt();
                in.nextLine();

                // a for-loop to parse through the arraylists and delete the target element
                for (int i = 0; i < playerNames.size(); i++){

                    if (indexToDelete==i){
                        playerNames.remove(i);
                        playerScores.remove(i);
                    }

                }

                System.out.println("Player deleted.");
                System.out.println(); // clears the output

            }

            // choice to view the player list
            else if (choice==3){

                System.out.println();
                System.out.println("Player List:");
                System.out.println("------------------");

                // for-loop to parse through the arraylists and print out the formatted output
                for (int i = 0; i < playerScores.size(); i++){

                    System.out.println(playerNames.get(i) + " - " + playerScores.get(i));

                }

                System.out.println(); // clear the output
                flag = false;

            }
        }


    }
}