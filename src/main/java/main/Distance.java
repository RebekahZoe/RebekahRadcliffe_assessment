package main;

import java.text.DecimalFormat;

public class Distance { 
	

	
	public static String getDistance(int x, int y) {
		
		int xCoord = TreasureCoordinates.getxCoordinate() - x;
		int yCoord = TreasureCoordinates.getyCoordinate() - y;
		DecimalFormat df = new DecimalFormat("#.###");
		double distance = Math.hypot(xCoord,yCoord);
		String distanceFormatted = df.format(distance);
		return distanceFormatted;
	}

	
}
