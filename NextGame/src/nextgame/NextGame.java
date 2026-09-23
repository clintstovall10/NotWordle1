package nextgame;

import java.util.Random;
import java.util.Scanner;

public class NextGame {
	
	Scanner scan = new Scanner(System.in);
	
	//Get Random numbers
	
	public int[] randomize () {
		
		Random rand = new Random();
		
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
		
		for (int indexOfNumbersRandom = 0; indexOfNumbersRandom < numbersRandom.length; indexOfNumbersRandom++) {
			System.out.println(numbersRandom[indexOfNumbersRandom]);
		}
		
		
		return numbersRandom;
		
	}
	
	public int[] getUserNumbers () {
		int index;
		int[] userNumbers = new int [5];
		
		for (index = 0; index < userNumbers.length; index++) {
			
			int nums = scan.nextInt();
			
			userNumbers[index] = nums;
			
			
			
		}
		return userNumbers;
	}
	

	
	
	
	
}
