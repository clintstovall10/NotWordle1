package nextgame;

import java.util.Random;

public class NextGame {
	
	//Get Random numbers
	
	public int[] randomize () {
		
		Random rand = new Random();
		
		int [] numbers = {1, 2 ,3 , 4 , 5};
		int num1;
		int index;
		int[]numbersRandom = new int [5];
		int index2;
		
		//puts random numbers into new array
		
		for ( index = 0; index < 30; index++ ) {
			num1 = rand.nextInt(5);
			
			numbersRandom[index] = numbers[num1];
		
		}
		for (index2 = 0; index2 < numbersRandom.length; index2++) {
			//find duplicate numbers, if found re run the randomize
			
		}
		
		
		return numbers;
		
	}
	
	

	
	
	
	
}
