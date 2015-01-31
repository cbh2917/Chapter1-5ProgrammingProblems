import java.util.Random;

/**
 * Purpose: Calculate the distance from the initial point to the location point of the driver after an hour of driving
 * Pseudocode: 1. randomly chooses the direction for every turn ever five minutes 
 * 				2. Calculates the coordinates of the final position  
 * 				3. determines the distance traveled
 * Author: Christopher Hall
 * Date 1/24/2015
 */
public class BrokenGPS {
	public enum Direction {
		NORTH, EAST, WEST, SOUTH;		
	}

	public static void main(String[] args) {
		// the number of turns based on 60 miles per hour for an hour drive
		// GPS randomly generates the new direction every 5 minutes
		// 60/5=12
		final int TURNS = 12;
		Random rand = new Random();

		// 0=north, 1= east, 2=south, 3=west int direction;
		
		
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < TURNS; i++) {
			
			Direction tmp = Direction.values()[rand.nextInt(4)];
			
			switch (tmp) {
			case NORTH:
				System.out.println("Moving NORTH");
				y += 5;
				break;
			case EAST:
				System.out.println("Moving EAST");
				x += 5;
				break;
			case WEST:
				System.out.println("Moving WEST");
				x += -5;
				break;
			case SOUTH:
				System.out.println("Moving SOUTH");
				y += -5;
				break;
			}
			System.out.println("X: " + x + " Y: " + y);
			
		}
		double distance = Math.sqrt((x) ^ 2 + (y) ^ 2);
		
		System.out.println("Total distance traveled: " + distance + " Miles");

	}
}
