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
			for (int index5 = 0; index5 < numbers.length; index5++) {
				System.out.println(numbersRandom[index5]);
			}
		
		return numbersRandom;
		
	}
	
	public int[] getUserNumbers () {
		int index;
		int[] userNumbers = new int [5];
		
			for (index = 0; index < userNumbers.length; index++) {
				int nums = scan.nextInt();
					if (nums < 6 ) {
						userNumbers[index] = nums;
				}
			}
			
		return userNumbers;
	}
	
	public static boolean compareUserInputToSequence (int [] array1 , int [] array2) {
			
				if (array1[0] == array2[0] && array1[1] == array2[1] && array1[2] == array2[2] && array1[3] == array2[3] && array1[4] == array2[4]) {
					System.out.print("You have successfully found the correct sequence of numbers!");
					return true;
				}
				
				return false;
		}
	
}	
