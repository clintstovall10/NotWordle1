package nextgame;

import java.io.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new FileReader ("notWordleHighscore.txt"));
		Scanner scan = new Scanner (System.in);
		String name;
		
		System.out.println("What is Your Name");
		name = scan.nextLine();
		
		NextGame nextgame = new NextGame();
		
		 nextgame.randomize();
		
		
		
		
		
		
		

	}

}
