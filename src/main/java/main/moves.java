package main;

import java.util.Random;

public class Moves {
	public static boolean notEnd = true;
	private static int xCoord =PlayerCoordinates.getxCoordinate();
	private static int yCoord = PlayerCoordinates.getyCoordinate();
	static Random rand = new Random();
	public static void playMove(String move) throws WrongInputException {

		int randMove = rand.nextInt(3);

		if(move.equals("north")) {
			if (yCoord == 10 ) {
				System.out.println("Cannot move north anymore, you're at the edge of the world");
				System.out.println();
				
			} else if (yCoord == 9 && randMove == 2){
				System.out.println("Cannot move north anymore, you're at the edge of the world");
				System.out.println();
				
			} else {
				if (randMove == 0) {
					System.out.println("The compass is playing up! Try again!!");
					System.out.println();
				}
				yCoord=yCoord+randMove;
				System.out.println("The dial reads " + Distance.getDistance(xCoord,yCoord) + "m");
				System.out.println();
			}

	}
		
		else if (move.contentEquals("east")) {
			if (xCoord == 10 ) {
				System.out.println("Cannot move east anymore, you're at the edge of the world");
				System.out.println();
			} else if (xCoord == 9 && randMove == 2){
				System.out.println("Cannot move north anymore, you're at the edge of the world");
				System.out.println();
				
			} else {
				if (randMove == 0) {
					System.out.println("The compass is playing up! Try again!!");
					System.out.println();
				}
				xCoord=xCoord+randMove;
				System.out.println("The dial reads " + Distance.getDistance(xCoord,yCoord) + "m");
				System.out.println();
			}
			
		}
		
		else if (move.contentEquals("south")) {
			if (yCoord == 0) {
				System.out.println("Cannot move south anymore, you're at the edge of the world");
				System.out.println();
			} else  if (yCoord == 1 && randMove == 2){
				System.out.println("Cannot move north anymore, you're at the edge of the world");
				System.out.println();
				
			} else {
				if (randMove == 0) {
					System.out.println("The compass is playing up! Try again!!");
					System.out.println();
				}
				yCoord=yCoord-randMove;
				System.out.println("The dial reads " + Distance.getDistance(xCoord,yCoord) + "m");
				System.out.println();
			}
		}
		
		else if (move.contentEquals("west")) {
			if (xCoord == 0) {
				System.out.println("Cannot move west anymore, you're at the edge of the world");
				System.out.println();
			} else if (xCoord == 0 && randMove == 2){
				System.out.println("Cannot move north anymore, you're at the edge of the world");
				System.out.println();
				
			} else {
				if (randMove == 0) {
					System.out.println("The compass is playing up! Try again!!");
					System.out.println();
				}
				xCoord=xCoord-randMove;
				System.out.println("The dial reads " + Distance.getDistance(xCoord,yCoord) + "m");
				System.out.println();
			}
		}
		else {
			throw new WrongInputException();
		}
		
		if (xCoord == TreasureCoordinates.getxCoordinate() && yCoord == TreasureCoordinates.getyCoordinate()) {
			System.out.println("Congratulations you have found the treasure!");
			notEnd = false;
		} else {
			System.out.println("Not quite there yet, keep going!");
		}
		
	}

}
