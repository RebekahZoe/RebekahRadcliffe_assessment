package main;

public class Moves {
	public static boolean notEnd = true;
	private static int xCoord =PlayerCoordinates.getxCoordinate();
	private static int yCoord = PlayerCoordinates.getyCoordinate();
	
	public static void playMove(String move) throws WrongInputException {


		if(move.equals("north")) {
			if (yCoord == 10 ) {
				System.out.println("Cannot move north anymore, you're at the edge of the world");
				
			} else{
				yCoord=yCoord+1;
				System.out.println("The dial reads " + Distance.getDistance(xCoord,yCoord) + "m");
			}

	}
		
		else if (move.contentEquals("east")) {
			if (xCoord == 10 ) {
				System.out.println("Cannot move east anymore, you're at the edge of the world");
			} else {
				xCoord=xCoord+1;
				System.out.println("The dial reads " + Distance.getDistance(xCoord,yCoord) + "m");
			}
			
		}
		
		else if (move.contentEquals("south")) {
			if (yCoord == 0) {
				System.out.println("Cannot move south anymore, you're at the edge of the world");
			} else  {
				yCoord=yCoord-1;
				System.out.println("The dial reads " + Distance.getDistance(xCoord,yCoord) + "m");
			}
		}
		else if (move.contentEquals("west")) {
			if (xCoord == 0) {
				System.out.println("Cannot move west anymore, you're at the edge of the world");
			} else{
				xCoord=xCoord-1;
				System.out.println("The dial reads " + Distance.getDistance(xCoord,yCoord) + "m");
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
