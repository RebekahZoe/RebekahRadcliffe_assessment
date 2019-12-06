package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		gameRunner();
	}
	
	public static void gameRunner() {
		System.out.println("Hello welcome to the game!");
		System.out.println("At your starting position the dial reads " + Distance.getDistance() + "m");
		
		while (true){
			System.out.println("Please enter what way you would like to go:");
			Scanner readInput = new Scanner(System.in);
			String input = readInput.nextLine();
			Moves.playMove(input);
			
			
		}
		
	}

}
