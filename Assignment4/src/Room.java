/**
 * Purpose: design a Room with others Rooms having different colored walls,
 *  flooring and number of windows
 * @author Christopher Hall
 * Oct 20, 2014
 */
public class Room {
	
	/**
	 * constructs a Room that holds wall, floor, windows
	 */
	
		private String wall;
		private String floor;
		private int windows;
		
		/**
		 * has the wall set according to the default value
		 */
		public Room() {
		} {
			wall="";
		}
		
		/**
		 * Initializes the wall color to the parameter
		 * @param color a color to the default value
		 */
		public Room(String color) {
			this.wall = color;
		}
		
		/**
		 * Initializes the room with a number of windows
		 * @param noOfWindows to number of windows
		 */
		public Room(int noOfWindows) {
			this.windows = noOfWindows;
		}
		
		/**
		 * Gets floor 
		 * @return the floor
		 */
		public String getFloor() {
			return floor;
			}
		
		/**
		 * Sets floor 
		 * @param floor to floor to set
		 */
		public void setFloor(String floor) {
			this.floor = floor;
		}
		
		/**
		 * Gets Windows
		 * @return the Windows
		 */
		public int getWindows() {
			return windows;
		}
		
		/**
		 * Sets Windows
		 * @param Windows to Windows to set
		 */
		public void setWindows(int windows) {
			this.windows = windows;
		}
		
		/**
		 * Sets Wall 
		 * @param Wall the Wall to set
		 */
		public void setWall(String color) {
			this.wall = color;
		}
		
		/**
		 * Gets Wall
		 * @return the Wall
		 */
		public String getWall() {
			return this.wall;
		}
		
		/**
		 * Gets wall, floor, windows
		 * @return Room attributes
		 */
		@Override
		public String toString() {
			return "Room [wall=" + wall + ", getWall()=" +getWall()
					          +"]";
		}
		
}
