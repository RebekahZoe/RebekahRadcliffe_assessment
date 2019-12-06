package main;

public class Moves {
	private static int xCoord = PlayerCoordinates.getxCoordinate();
	private static int yCoord = PlayerCoordinates.getyCoordinate();
	
	public static void playMove(String move) {
		String moves = move.toLowerCase();
		
		
		if(moves.equals("north")) {
			if (yCoord == 10 ) {
				System.out.println("Cannot move north anymore, you're at the edge of the world");
				
			} else if (yCoord==9) {
			PlayerCoordinates.setyCoordinate(yCoord+1);
			System.out.println(PlayerCoordinates.getyCoordinate());
			System.out.println("The dial reads " + Distance.getDistance() + "m");
			
		}
			else {
				PlayerCoordinates.setyCoordinate(yCoord+2);
				System.out.println(PlayerCoordinates.getyCoordinate());
				System.out.println("The dial reads " + Distance.getDistance() + "m");
			}
	}
		
		if (moves.contentEquals("east")) {
			if (xCoord == 10 ) {
				System.out.println("Cannot move east anymore, you're at the edge of the world");
			} else if (xCoord ==9) {
			PlayerCoordinates.setyCoordinate(xCoord+1);
			System.out.println(PlayerCoordinates.getxCoordinate());
			System.out.println("The dial reads " + Distance.getDistance() + "m");
		}
			else {
				PlayerCoordinates.setyCoordinate(xCoord+2);
				System.out.println(PlayerCoordinates.getxCoordinate());
				System.out.println("The dial reads " + Distance.getDistance() + "m");
			}
			
		}
		
		if (moves.contentEquals("south")) {
			if (yCoord == 0) {
				System.out.println("Cannot move south anymore, you're at the edge of the world");
			} else if ( yCoord == 1) {
			PlayerCoordinates.setyCoordinate(yCoord-1);
			System.out.println(PlayerCoordinates.getyCoordinate());
			System.out.println("The dial reads " + Distance.getDistance() + "m");
		}
			else {
				PlayerCoordinates.setyCoordinate(yCoord-2);
				System.out.println(PlayerCoordinates.getyCoordinate());
				System.out.println("The dial reads " + Distance.getDistance() + "m");
			}
		}
		if (moves.contentEquals("west")) {
			if (xCoord == 0) {
				System.out.println("Cannot move west anymore, you're at the edge of the world");
			} else if (xCoord == 1) {
			PlayerCoordinates.setxCoordinate(xCoord-1);
			System.out.println(PlayerCoordinates.getxCoordinate());
			System.out.println("The dial reads " + Distance.getDistance() + "m");
		}
			else {
				PlayerCoordinates.setxCoordinate(xCoord-2);
				System.out.println(PlayerCoordinates.getxCoordinate());
				System.out.println("The dial reads " + Distance.getDistance() + "m");
			}
		}
	}

}
