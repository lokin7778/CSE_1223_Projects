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
        }
    }
}