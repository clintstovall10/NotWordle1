package nextgame;

import java.io.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new FileReader ("notWordleHighscore.txt"));
		Scanner scan = new Scanner (System.in);
		boolean gameAttempts = false;
		int turnCounter = 0;
		
		System.out.println("Game: Who's Next\nObjective: Identify the Sequence of 5 numbers betwen 1 and 5 using the fewest turns. If you wish\nto quit guessing and give up, enter a ZERO for one of your guesses and the game will display the\nsolution and quit.\nGOOD LUCK!!! ");
		System.out.print("\n");
		NextGame nextgame = new NextGame();
		
		int[] array = nextgame.randomize();
		 
		 while (!gameAttempts) {
			 System.out.print("== Turn " + turnCounter + " == Number Sequence: ");
			 
			 
			 int [] array2 = nextgame.getUserNumbers();
			 gameAttempts = nextgame.compareUserInputToSequence(array, array2);
			 
			 turnCounter++;
		 }
		 System.out.print("\n");
		 System.out.println("You guessed the sequence in " + turnCounter + " turns");
		 System.out.print("\n\n");
		 System.out.println("Game Number Sequence");
		 System.out.println("--------------------");
		 for (int index = 0; index < array.length; index++ ) {
			 System.out.printf ("| %d ", array[index]);
		 }
		 System.out.print("|");
		 System.out.print("\n");
		 System.out.println("--------------------");
		
		
		
		
		 br.close();
		 scan.close();
	}

}
