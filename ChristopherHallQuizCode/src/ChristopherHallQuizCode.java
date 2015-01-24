import java.util.Scanner;
public class ChristopherHallQuizCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username");
		String username = keyboard.next(); 
		System.out.println("Enter you password");
		String password = keyboard.next();
		System.out.println("Hello " + username + ", Welcome to CSC200 class! " + "and your password is " + password);
	}

}
