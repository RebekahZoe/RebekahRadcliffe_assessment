package main;

import java.util.Random;

public class TreasureCoordinates {
	static Random rand = new Random();
	private static int xCoordinate = rand.nextInt(11);
	private static int yCoordinate = rand.nextInt(11);

	public static int getxCoordinate() {
		return xCoordinate;
	}

	public static int getyCoordinate() {
		return yCoordinate;
	}

}
