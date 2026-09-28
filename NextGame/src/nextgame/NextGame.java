package nextgame;

import java.util.Random;
import java.util.Scanner;

public class NextGame {

    private Scanner scan = new Scanner(System.in);
    private Random rand = new Random();
    private Highscore[] highscoreArray = new Highscore[100];

   
    public void startGame() {

        boolean gameAttempts = false;
        int turnCounter = 0;
        String name;

        System.out.print("Enter your name: ");
        name = scan.nextLine();

        System.out.println("Game: Who's Next");
        System.out.println("Objective: Identify the Sequence of 5 numbers between 1 and 5 using the fewest turns.");
        System.out.println("If you wish to quit guessing and give up, enter a ZERO for one of your guesses");
        System.out.println("and the game will display the solution and quit.");
        System.out.println("GOOD LUCK!!!");
        System.out.println();

        
        int[] array = randomize();
        
        
        while (!gameAttempts) {

            System.out.print("== Turn " + (turnCounter + 1) + " == Number Sequence: ");

            int[] array2 = getUserNumbers();
            
            if (array2[0] == -1) {
            	break;
            }

            gameAttempts = compareUserInputToSequence(array, array2);

            turnCounter++;
        }

        
        System.out.println();
        System.out.println("You guessed the sequence in " + turnCounter + " turns");
        System.out.println();

        displaySequence(array);

        
        highscoreShow(turnCounter, name);
    }

    
    public int[] randomize() {

        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbersRandom = new int[5];

        boolean attempts = true;

        while (attempts) {

            attempts = false;

            
            for (int index = 0; index < numbersRandom.length; index++) {

                int randomIndexOfNumbers = rand.nextInt(5);

                numbersRandom[index] = numbers[randomIndexOfNumbers];
            }

            
            for (int i = 0; i < numbersRandom.length; i++) {

                for (int j = i + 1; j < numbersRandom.length; j++) {

                    if (numbersRandom[i] == numbersRandom[j]) {

                        attempts = true;
                    }
                }
            }
            
          }
        

        return numbersRandom;
    }

    
    public int[] getUserNumbers() {
    	
        String line = scan.nextLine();
        if (line.equals("0")){
        	int [] turnOFF = turnOFF();
        	return turnOFF;
        }

        String[] userInput = line.split(" ");

        int[] userNumbers = new int[5];

        for (int index = 0; index < userNumbers.length; index++) {

            int num = Integer.parseInt(userInput[index]);

            if (num < 6) {

                userNumbers[index] = num;
            }
        }

        return userNumbers;
    }

   
    public boolean compareUserInputToSequence(int[] array1, int[] array2) {

        int numbersCorrect = 0;

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] == array2[i]) {

                numbersCorrect++;
            }
        }

        if (numbersCorrect == 5) {

            return true;
        }

        System.out.println("You have " + numbersCorrect + " numbers correct");

        return false;
    }

    
    public void displaySequence(int [] array) {

        System.out.println("Game Number Sequence");
        System.out.println("--------------------");

        for (int index = 0; index < array.length; index++) {

            System.out.printf("| %d ", array[index]);
        }

        System.out.println("|");
        System.out.println("--------------------");
    }

    
    public Highscore[] highscoreShow(int score, String name) {
    	
        for (int index = 0; index < highscoreArray.length; index++) {

            if (highscoreArray[index] == null) {

                Highscore hs = new Highscore(score, name);

                highscoreArray[index] = hs;
            
                break;
                
            }
        }
         for (int i = 0; i < highscoreArray.length; i++) {
        	 for (int j = i + 1; j < highscoreArray.length; j++) {
        		 if (highscoreArray[i] != null && highscoreArray[j] != null && highscoreArray[i].getHighscore() > 
        			 highscoreArray[j].getHighscore()) {
        			 Highscore temp = highscoreArray[i];
        			 highscoreArray[i] = highscoreArray[j];
        			 highscoreArray[j] = temp;
        		 }
        	 }
         }
         System.out.print("\n");
         System.out.println ("High Scores");
         System.out.println ("----------------");
         
         for (int k = 0; k < highscoreArray.length; k++) {
        	 if (highscoreArray[k] != null){
        		 System.out.println (highscoreArray[k].getHighscore() + "-" + highscoreArray[k].getName());
        	 }
         }
         
        

        return highscoreArray;
    }
    public int[] turnOFF() {
    	int[] turnOFF = {-1};
    	return turnOFF;
    }
}