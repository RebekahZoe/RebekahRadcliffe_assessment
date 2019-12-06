package testing;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

import main.Distance;
import main.TreasureCoordinates;

public class Testing {
	private TreasureCoordinates tc = new TreasureCoordinates();

	@Test
	public void distanceTest() {
		int x = 0;
		int y = 0;
		int differenceX = tc.getxCoordinate()-x;
		int differenceY = tc.getyCoordinate() -y;
		DecimalFormat df = new DecimalFormat("#.###");
		double result = Math.hypot(differenceX, differenceY);
		String formatResult = df.format(result);
		assertEquals(formatResult,Distance.getDistance(x,y));
		
	}

}
