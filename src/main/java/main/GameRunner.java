package main;

import java.util.Scanner;

public class GameRunner {

	public static void gameRunner() {
		int startingX = PlayerCoordinates.getxCoordinate();
		int startingY = PlayerCoordinates.getyCoordinate();
		Scanner readInput = new Scanner(System.in);
		System.out.println("Hello welcome to the game! You must find the treasure by using a compass, good luck!");
		System.out.println();
		System.out.println(
				"At your starting position the dial reads " + Distance.getDistance(startingX, startingY) + "m");
		try {
			while (Moves.notEnd) {
				System.out.println();
				System.out.println("Please enter which direction you would like to travel towards:");
				System.out.println();

				String input = readInput.nextLine().toLowerCase();
				Moves.playMove(input);
			}
		} catch (WrongInputException wie) {
			System.out.println(wie.toString());
		} finally {
			readInput.close();
		}
	}

}
