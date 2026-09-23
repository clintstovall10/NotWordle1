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
		int index3;
		boolean one = false;
		int attempts;
		
		
		//puts random numbers into new array
		for ( attempts = 0; attempts < 30; attempts++ ) {
			
			for (index = 0; index < numbersRandom.length; index++) {
				num1 = rand.nextInt(5);
				numbersRandom[index] = numbers[num1];
			}
		
			//find duplicate numbers, if found re run the randomize
			for (index2 = 0; index2 < numbersRandom.length; index2++) {
				for (index3 = index2 +1; index3 <numbersRandom.length -1 ; index3++) {
					
					if (numbersRandom[index2] == numbersRandom[index3]) {
						one = true;
						
					}
					
				}
				System.out.println(numbersRandom[index2]);
			}
			
		}
		
		return numbersRandom;
		
	}
	
	

	
	
	
	
}
