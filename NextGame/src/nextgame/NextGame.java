package nextgame;

import java.util.Random;
import java.util.Scanner;

public class NextGame {
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	//Get Random numbers
	
	public int[] randomize () {
		int [] numbers = {1, 2 ,3 , 4 , 5};
		int index;
		int randomIndexOfNumbers;
		int[]numbersRandom = new int [5];
		int i;
		int j;
		boolean attempts = true;
		
		while (attempts) {
			
			attempts = false;
			
			//generates a random array
			
			for (index = 0; index < numbersRandom.length; index++) {
				randomIndexOfNumbers = rand.nextInt(5);
				numbersRandom[index] = numbers[randomIndexOfNumbers];
			}
		
			//checks the array if duplicates are found, if found keep running
			
			for (i = 0; i < numbersRandom.length; i++) {
				for (j = i+1; j <numbersRandom.length ; j++) {
					
					if (numbersRandom[i] == numbersRandom[j]) {
							attempts = true;
						}
					}
				}
			}
		
			//just prints off the completed array with not duplicates, outside of while loop
			//for (int index5 = 0; index5 < numbers.length; index5++) {
				//System.out.println(numbersRandom[index5]);
			//}
		
		return numbersRandom;
		
	}
	
	public int[] getUserNumbers () {
		int index;
		String line = scan.nextLine();
		String[] userInput = line.split(" ");
		int num;
		int[] userNumbers = new int[5];
		
		for (index = 0; index < userNumbers.length; index++) {
				num = Integer.parseInt(userInput[index]);
					if ( num < 6 ) {
						userNumbers[index] = num;
				}
			}
		return userNumbers;
	}
	
	public static boolean compareUserInputToSequence (int [] array1 , int [] array2) {
			int numbersCorrect = 0;
			for (int i = 0; i <array1.length; i++) {
				if (array1[i] == array2[i]) {
					numbersCorrect ++;
				}	
			}
				
			if ( numbersCorrect == 5 ) {
				return true;
			}
			System.out.println("You have " + numbersCorrect + " numbers correct");
			return false;
	}
	
	
	
	
}	
