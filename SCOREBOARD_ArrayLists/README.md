# CSE_1223_Projects

# CREATING SCOREBOARD USING ARRAYLISTS

For this project, you will write a Java program that uses ArrayLists to manage a scoreboard for a group of players. This program allows users to dynamically add, delete, and view player names and scores through a menu interface until they exit the program. Upon exiting the program, the final scoreboard is displayed as a bar chart, with scores scaled proportionally to the highest score entered. The program shows four options to manage the scoreborad: 1) Add: The user can add players by providing their name and score. Names and scores are stored in two parallel ArrayLists. 2) Delete: The user can delete a player by specifying their index. 3) View: Display the list of player names and scores entered so far. 4) Exit: Display the final scoreboard and end the program.

An example transcript of how the program should work is shown below (remember that values entered by the user are shown in BOLD and that the output should end with a new line:

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 1
Enter player name: Jo Duffy
Enter player score: 87
Player added.

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 1
Enter player name: John
Enter player score: 42
Player added.

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 1
Enter player name: David William
Enter player score: 65
Player added.

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 3

Player List:
------------------
Jo Duffy - 87
John - 42
David William - 65

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 2
Enter the index of the player to delete (0 to 2): 1
Player deleted.

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 3

Player List:
------------------
Jo Duffy - 87
David William - 65

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 4

Scoreboard
------------------
Jo Duffy      **************************************************
David William *************************************
GoodBye
Storing the input

You will need to create two arraylists to store the data - one to hold player names and one to hold scores. The arraylists will be what is known as parallel arraylist - two values with the same index will be linked to each other. For example, given the transcript above, the arraylist holding names would have the values ["Jo Duffy", "David William"] and the arraylist holding scores would have the values [87, 65].

Once you have read the values into the two arraylists, you can worry about formatting the output.

Formatting the output

The length of the bar for the player with the highest score must be 50 stars. The length of the bars for the other players is determined by using a proportion of their score to the maximum score:

numStars = ( score / maxScore ) * 50
For example, if the highest score is 10 and another player has a score of 8, then the length of the second player's bar will be (8/10)*50 - or 40 stars.

NOTE: Remember that if you want to use fractions in Java you have to do some extra work. You can look back at how you computed the percentage in the guess a number project for one way to solve this. Another way to solve it is to recognize that the above equation can be rewritten using a little bit of algebra as:

numStars = ( score * 50 ) / maxScore
If you do that, you don't have to convert values from int to double and back at all. In general in Java if you don't have to convert between int and double types it is better not to.

NOTE 2: Notice that the bars all line up on the left hand side, with a single space after the longest name that the user entered. There are a number of ways to solve this problem - one way to do it is to use the formatted output that we used in a previous project. This is the best way to do this if you can get it to work!

Another way is to use a loop to append spaces to the end of the shorter names to "pad" them out to the right length. An algorithm to do this might be:

Determine the string with the longest length, call it max.
Start with a variable pos = 0.
With the name stored at index pos, loop to append spaces until its length is the same as the length of max.
Increment pos by 1.
Repeat steps 3 and 4 until all of the strings are the same length.
NOTE 3: Your solution must be able to handle names of length 0 and scores of 0. You can assume that values entered by the user for scores will be non-negative. In the case of scores of 0, no stars should be printed - be careful of division by zero errors when determining your proportions! In the case of names of length 0, no name will be printed but the bar will be printed.

An example where the player name is left blank or score is set to 0 would be:

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 1
Enter player name: John
Enter player score: 74
Player added.

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 1
Enter player name: 
Enter player score: 41
Player added.

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 1
Enter player name: Ju
Enter player score: 0
Player added.

Select an option: 
1. Add Player
2. Delete Player
3. View Players
4. Exit
Enter your choice [1/2/3/4]: 4

Scoreboard
------------------
John **************************************************
     ***************************
Ju  
GoodBye

# DRAGON TRAINERS LAB

For this lab you will be writing two methods for designing a Dragon Trainers game.

The first method you will need to write is getNumberOfMatches. This method takes one parameter - a Scanner. You can see by how it is used in the main method that we will be passing the Scanner object we create in the main method to this method to use. Remember - your program should only ever create ONE Scanner object connected to the keyboard, and parameter passing is the only way to accomplish this.

The getNumberOfMatches method will display the prompt ``How many matches shall we play? and read the user's input. If the user enters a number less than or equal to 0, the method will display the error messageERROR - number of matches must be positive!``` and continue prompting until the user enters a value that is at least 1. The value the user enters is then returned to the calling method.

Once you get this method working (making sure you run it and can see the DEBUG messages in the main program showing you that it is running), you will need to write the second method for this lab promptForDragon. This method also takes a Scanner as a parameter and displays a prompt for the user to respond to. This prompt is Please select a dragon [Plant/Water/Fire]: and allows the user to enter any value EXCEPT a blank line. If the user enters a blank line the method should produce the error message ```ERROR - Dragon prompt cannot be empty" and continue prompting until the user enters a non-blank value.

NOTE If your promptForDragon method keeps giving you a blank value in the DEBUG messages - or skips the first value you type - it is probably actually a problem with how you have written getNumberOfMatches. MAKE SURE YOUR getNumberOfMatches METHOD READS AN ENTIRE LINE FROM THE SCANNER EACH TIME IT READS FROM THE SCANNER! If you are using nextInt() in your method it will NOT read to the end of the line - only to the end of the integer value. Review the earlier lectures on using nextInt() vs. nextLine() to see how to correct this issue in the getNumberOfMatches method! .

NOTE You MUST only declare and instantiation on single Scanner object to be able to run the test cases. And this must be done outside of the main game loop and in the main method. Your methods should NOT create another Scanner object but instead should use the one passed in as a parameter. Note that this is also typically how Scanner objects get used - you create them once and then use the same Scanner object for your entire program.

Note that this "skeleton" of code in the template includes a main method that has already been written for you. Read the main method and make sure you understand what it is doing and how it is calling the other methods in the program. Comments are included to help you understand what each piece of the code is supposed to be accomplishing. DO NOT CHANGE THE CODE IN THE MAIN METHOD TO GET YOUR SOLUTION TO WORK! Full credit for the assignment will only be earned if you can get the code to work without changing the main method provided.

Here is one example of the main method below in action. Note that as always, user inputs are in BOLD:

How many matches will we play? 3
DEBUG: total matches entered 3
Please select a dragon [Plant/Water/Fire]: F
DEBUG: user entered F

Please select a dragon [Plant/Water/Fire]: W
DEBUG: user entered W

Please select a dragon [Plant/Water/Fire]: P
DEBUG: user entered P
Note that if the user enters a non-positive value for the number of matches, the program should reject it and make them enter a positive value, and if the user enters a blank line for the dragon the program should reject it and make them enter some non-empty value:

How many matches will we play? 0
ERROR - number of matches must be positive!
How many matches will we play? -1
ERROR - number of matches must be positive!
How many matches will we play? 1
DEBUG: total matches entered 1
Please select a dragon [Plant/Water/Fire]: 
ERROR - Dragon prompt cannot be empty.
Please select a dragon [Plant/Water/Fire]: P
DEBUG: user entered P
You MUST use the skeleton for your code. Your solution must include the implementation and use of all of the methods defined in this skeleton - think about what each method does. You MUST NOT make any changes to the main method - violating any of these requirements will cause a deduction in the points earned. Remember - a goal for this assignment is to practice writing methods that conform to a particular specification! The test cases for this program are written to let you test the individual methods as well as the final output. Test incrementally! Write one method at a time and then test it rather than waiting until you've written the whole program and testing it all at once! Taking an incremental approach will help you keep the whole assignment manageable by tackling it in pieces. Note also that you can complete the methods in any order.