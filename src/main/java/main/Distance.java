package main;

import java.text.DecimalFormat;

public class Distance {
	
	private static int x = TreasureCoordinates.getxCoordinate() - PlayerCoordinates.getxCoordinate();
	private static int y = TreasureCoordinates.getyCoordinate() - PlayerCoordinates.getyCoordinate();
	static DecimalFormat df = new DecimalFormat("#.###");
	
	public static String getDistance() {
		double distance = Math.hypot(x,y);
		String distanceFormatted = df.format(distance);
		return distanceFormatted;
	}

	
}
