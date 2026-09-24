package nextgame;

import java.io.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new FileReader ("notWordleHighscore.txt"));
		Scanner scan = new Scanner (System.in);
		String name;
		boolean gameAttempts = true;
		
		System.out.println("What is Your Name?");
		name = scan.nextLine();
		
		NextGame nextgame = new NextGame();
		
		int[] array = nextgame.randomize();
		 
		 System.out.println("Enter numbers:");
		 
		 while (gameAttempts) {
			 
			 int [] array2 = nextgame.getUserNumbers();
			 nextgame.compareUserInputToSequence(array, array2);
			 
		 }
		
		
		
		
		
		

	}

}
