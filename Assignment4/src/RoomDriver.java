
public class RoomDriver {

	public static void main(String[] args) {
		
		
		Room Room1 = new Room();
		Room Room2 = new Room();
		Room Room3 = new Room();
		
		Room1.setWall("yellow");
		Room1.setFloor("hardwood");
		Room1.setWindows(1);
		System.out.println(Room1.getWall());
		System.out.println(Room1.getFloor());
		System.out.println(Room1.getWindows());
		
		
		Room2.setWall("purple");
		Room2.setFloor("tiles");
		Room2.setWindows(0);
		System.out.println(Room2.getWall());
		System.out.println(Room2.getFloor());
		System.out.println(Room2.getWindows());
		
		
		
		
		Room3.setWall("white");
		Room3.setFloor("carpet");
		Room3.setWindows(3);
		System.out.println(Room3.getWall());
		System.out.println(Room3.getFloor());
		System.out.println(Room3.getWindows());
		
	}

}
