# CSE_1223_Projects

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
