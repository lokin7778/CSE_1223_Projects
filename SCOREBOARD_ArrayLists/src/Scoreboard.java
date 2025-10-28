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

            // prompt the user with the given options
            System.out.println("Select an option: ");
            System.out.println("1. Add Player");
            System.out.println("2. Delete Player");
            System.out.println("3. View Players");
            System.out.println("4. Exit");

            // prompt the user to enter their choice

            System.out.print("Enter your choice [1/2/3/4]: ");
            int choice = in.nextInt();
            in.nextLine();



        }


    }
}