package com.careerdevs;

import java.util.Scanner;

public class Main<play, playGame> {

    public static void main(String[] args) {
		mainMenu1();

	    /*
	    *
	    *NUMBER GUESSING GAME
	    *
	    * Main Menu :
	    *   1) play game
	    *   2) display rules
	    *   3) exit program
	    *
	    *   ClI.readString("Select a menu option ",1 ,3 )
	    *
	    *(game menu)
	    *  Step 1 : generate a random number (1-100)- number range could be user selected
	    *
	    *  loop : the user will  keep guessing the number until they get it or use 10  guesses-  could vary with difficulty settings
	    *        When then user guesses incorrect , tell them if they are high or low ,also the number of the guesses left
	    *
	    *   When the loop is over  display the user if they won or lost the game
	    *
	    *   When the game is over return to the Main Menu
	    */
    }

	public static  void mainMenu () {

		System.out.println( "Main Menu :");
		System.out.println("1) play game");
		System.out.println("2) display rules");
		System.out.println("3) exit ");

		int useSelection  = CLI.readInt("Select a menu option ",1,3);

		switch (useSelection) {
			case 1 -> {
				//play game
				playGame();
				mainMenu();
			}
			case 2 -> {
				// display rules
				displayRules();
				mainMenu();
			}
			case 3 ->
					//exit
					System.out.println("\n\n Thank you for using this program ...");
			default -> System.out.println("Something went wrong");
		}

	}

	public static void playGame(){
		System.out.println("Game");
	}

	private static void displayRules() {
		System.out.println("\n RULES\n -----------------\n");
		System.out.println("a random number (1-100)");
		System.out.println(" keep guessing the number until you get it right  or use 10  guesses");
	}



	public static  void mainMenu1 () {

		boolean isGameRunning = true;
		while (isGameRunning){

			System.out.println( "Main Menu :");
			System.out.println("1) play game");
			System.out.println("2) display rules");
			System.out.println("3) exit ");

			int useSelection  = CLI.readInt("Select a menu option ",1,3);

			switch (useSelection) {
				case 1:
					playGame();
					break;

				case 2:
					displayRules();
					break;

				case 3:
					System.out.println("\n\n Thank you for using this program ...");
					isGameRunning = false;
					break;

				default:
					System.out.println("Something went wrong");
					break;
			}

		}


	}


}
