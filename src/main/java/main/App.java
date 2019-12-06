package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		gameRunner();
	}
	
	public static void gameRunner() {
		int startingX = PlayerCoordinates.getxCoordinate();
		int startingY = PlayerCoordinates.getyCoordinate();
		Scanner readInput = new Scanner(System.in);
		System.out.println("Hello welcome to the game!");
		System.out.println("At your starting position the dial reads " + Distance.getDistance(startingX,startingY) + "m");
		try {
		while (Moves.notEnd) {
			System.out.println("Please enter what way you would like to go:");
			
			String input = readInput.nextLine().toLowerCase();
			Moves.playMove(input);
			}
		}
		catch (WrongInputException wie) {
			System.out.println(wie.toString());
		}
		finally {
			readInput.close();
		}
	}

}
