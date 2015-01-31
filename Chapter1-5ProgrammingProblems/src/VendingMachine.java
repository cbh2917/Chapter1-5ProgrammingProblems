import java.util.Scanner;
/**
 * Purpose: design a vending machine that shows a list of 5 products which outputs the change in saying the amount your given back
 * 
 * Pseudocode: 1.shows the list of products and their price with a prompt asking what the user wishes to enter
 *             2. user enters amount of money he wants
 *             3. user selects how many product he/she wants
 *             4.check outs with change being given back.
 * Author: Christopher Hall
 * Date 1/24/2015
 */

public class VendingMachine {
	static Scanner input = new Scanner(System.in);
	private static int product, coins, bills, options;
	private static float balance = 0, total = 0, change = 0;

	//For testing
	public static int payment(int opt, int coin, int bill) {
		//Start Payment process
		System.out.println("\nPlease select the payment method.");
		do {
			// Enter money options
			System.out.println("0. Stop Entering Money");
			System.out.println("1. Enter coins");
			System.out.println("2. Enter bills");
			options = opt;
			
			

			if (options == 0) {
				break;
			}
			// The vending machine accepts coins,
			else if (options == 1) { // 1 for coins
				System.out.println("Enter coins");
				System.out.print(coin);
				do {
					coins = coin;
					// Enter coins
					switch (coins) {
					case 0:
						break;
					case 1: // Penny
						total += 0.01;
						break;
					case 5: // Nickel
						total += 0.05;
						break;
					case 10: // Dime
						total += 0.10;
						break;
					case 25: // Quarter
						total += 0.25;
						break;
					default:
						System.out.println("Invalid Coins, Please enter the new coins");
					}
					
				} while (coins != 0);
			} else if (options == 2) {// 2 for bills
				// 1 dollar bills, and 5 dollar bills
				System.out.println("Enter bills:");
				System.out.print(bill);
				do {
					bills = bill;
					// Enter bills
					switch (bills) {
					case 0:
						break;
					case 1: // 1 dollar
						total += 1.00;
						break;
					case 5: // 5 dollar
						total += 5.00;
						break;
					default:
						System.out.println("Invalid Bills, Please enter the valid bills");
					}
					System.out.println("Total: " + total);
					
				} while (bills != 0);
			} else {
				System.out.println("Invalid Options");
			}
		} while (options != 0);
		return bill;

		//End Payment process
		
		
	}
	
	public static void userPayment() {
		//Start Payment process
		System.out.println("\nPlease select the payment method.");
		do {
			// Enter money options
			System.out.println("0. Stop Entering Money");
			System.out.println("1. Enter coins");
			System.out.println("2. Enter bills");
			options = input.nextInt();
			
			

			if (options == 0) {
				break;
			}
			// The vending machine accepts coins,
			else if (options == 1) { // 1 for coins
				System.out.println("Enter coins:");
				do {
					coins = input.nextInt();
					// Enter coins
					switch (coins) {
					case 0:
						break;
					case 1: // Penny
						total += 0.01;
						System.out.println("Enter coins:");
						break;
					case 5: // Nickel
						total += 0.05;
						System.out.println("Enter coins:");
						break;
					case 10: // Dime
						total += 0.10;
						System.out.println("Enter coins:");
						break;
					case 25: // Quarter
						total += 0.25;
						System.out.println("Enter coins:");
						break;
					default:
						System.out.println("Invalid Coins, Please enter the new coins");
					}
					System.out.println("Total: " + total);
				} while (coins != 0);
			} else if (options == 2) {// 2 for bills
				// 1 dollar bills, and 5 dollar bills
				System.out.println("Enter bills:");

				do {
					bills = input.nextInt();
					// Enter bills
					switch (bills) {
					case 0:
						break;
					case 1: // 1 dollar
						total += 1.00;
						System.out.println("Enter bills:");
						break;
					case 5: // 5 dollar
						total += 5.00;
						System.out.println("Enter bills:");
						break;
					default:
						System.out.println("Invalid Bills, Please enter the new bills");
					}
					System.out.println("Total: " + total);
				} while (bills != 0);
			} else {
				System.out.println("Invalid Options");
			}
		} while (options != 0);
		

		//End Payment
	}

	public static void purchase() {
		//Start Purchase process
		System.out.println("Please select your product.");
		// Product prices 
		boolean exit = false;
		do
		{
			System.out.println("Balance: " + (total - balance));
			// Select the product
			product = input.nextInt();
			
			switch (product) {
			case 0:
				balance += 0.00;
				exit = true;
				break;
			case 1:
				balance += 0.36;
				break;
			case 2:
				balance += 0.45;
				break;
			case 3:
				balance += 0.55;
				break;
			case 4:
				balance += 1.25;
				break;
			case 5:
				balance += 1.50;
				break;
			default:
				System.out.println("Invalid Products");
			}
			if ((balance >=  total) || ((total - balance) < 0.36))
			{
				System.out.println("Zero Balance");
				exit = true;
			}
		} while (exit != true);
		
		

		// End Purchase
	}

	
	public static String change() {
		//Start change module
				String changeDisplay="";
				if (total >= balance) {
					change = (total - balance);
					//calculate change
					
					int remainingAmount = (int)(change * 100);
					
					int numOfOneDollars = remainingAmount / 100;
					
					remainingAmount = remainingAmount % 100;
					
					int numOfQuarters = remainingAmount / 25;
					remainingAmount = remainingAmount % 25;
					
					int numOfDimes = remainingAmount / 10;
					remainingAmount = remainingAmount % 10;
					
					int numOfNickels = remainingAmount /5;
					remainingAmount = remainingAmount % 5;
					
					int numOfPennies = remainingAmount;
					
					changeDisplay = numOfOneDollars + " Dollars\n" + numOfQuarters + " Quarters\n" + numOfDimes + " Dimes\n"
							+ numOfNickels + " Nickels\n" + numOfPennies + " Pennies";
				}
				else {
					changeDisplay ="No change returned";
				}
				
				return changeDisplay;
				//End change process
				
	}
	
	public static void display() {
		// Start display
		System.out.println("TRANSACTION TOTAL : $" + balance);
		System.out.println("TOTAL MONEY ENTERED $: " + total);
		System.out.println("CHANGE :\n" + change());
		System.out.println("Enjoy your snack");
		

		// End display process
	}
	
	public static void main(String[] args) {
		System.out.println("HELLO Customer!");
		// The vending machine offers 5 products
		System.out.println("0. Get money back");
		System.out.println("1. Kitkat\t$.36");
		System.out.println("2. Mars\t\t$.45");
		System.out.println("3. Reese\t$.55");
		System.out.println("4. Twix\t\t$1.25");
		System.out.println("5. Snicker\t$1.50");

		// call payment process
		userPayment();
		// call purchase process
		purchase();
		//call change process
		change();
		//call display process
		display();
	}

}
