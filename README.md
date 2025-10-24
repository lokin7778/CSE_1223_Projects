# CSE_1223_Projects

# Scoreboard.java 

    In this project, I'll create and manage a scoreboard with an Arraylist as the data structure as it can be dynamically resized.
    Keep note of the formatting too as while printing the scoreboard, the person with the highest score must have 50 stars next to his name
    and the subsequent entries must have the number of stars in the following format -

    noOfStars = (score/maxScore) * 50

    This project must also handle zero as the input of a score, so we should be careful of the zero division error

    # SAMPLE OUTPUTS

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


    # IMPORTANT IN-PROJECT MANIPULATIONS

        Line 8 : Created a scanner object 'in'  