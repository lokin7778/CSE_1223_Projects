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

