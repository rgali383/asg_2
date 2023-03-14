package view;

import java.util.Scanner;

import model.Toy;
/**

The AppMenus class provides methods to display menus and prompt user input for Romas Toy Store application.
It contains methods to display main menu, search menu, and prompts for various toy attributes.
It also includes methods to display messages for starting and saving the application.
*/
public class AppMenus {

		Scanner input;
		/**
		 * Constructor initializes Scanner object for user input.
		 */
		public AppMenus() {
			input= new Scanner(System.in);
		}

	/**
 	* Displays the welcome message for the application.
 	*/
	public void startMessage() {
		System.out.println("**************************************************");
		System.out.println("*       WELCOME TO ROMAS TOY STORE   O u O       *");
		System.out.println("**************************************************");
	}
	/**
	 * Displays the main menu options and prompts user for input.
	 * 
	 * @return char User input for the selected option.
	 */
	public char mainMenu() {
		System.out.println("\nHow May We May Help You? \n");
		System.out.println("(1) Search Inventory and Purchase Toy");
		System.out.println("(2) Add a New Toy");
		System.out.println("(3) Remove a Toy");
		System.out.println("(4) Save and Exit");
//		System.out.println("(BONUS)Make a gift suggestion");
		System.out.print("\nEnter Option: ");
		char option = input.nextLine().toLowerCase().charAt(0);		
		
		return option;
	}

	/**
 	* Displays the search menu options and prompts user for input.
 	* 
 	* @return int User input for the selected option.
 	*/
	public int searchMenu() {
		System.out.println("\nFind Toys With: \n");
		System.out.println("(1) Serial Number");
		System.out.println("(2) Toy Name ");
		System.out.println("(3) Type");
		System.out.println("(4) Back to Main Menu");
		System.out.print("\nEnter Option: ");
	    int option = Integer.parseInt(input.nextLine());
		
		return option;
	}
	/**
	 * Prompts user to enter serial number and returns the entered value.
	 * 
	 * @return String User input for the serial number.
	 */
	public String promptSN() {
		System.out.print("\nEnter Serial Number: ");
		String option= input.nextLine();
			
		return option;
	}
	/**
	 * Prompts user to enter serial number and returns the entered value as integer.
	 * 
	 * @return int User input for the serial number as integer.
	 */
	public int promptSNS() {
		System.out.print("\nEnter Serial Number: ");
		int option= Integer.parseInt(input.nextLine());
			
		return option;
	}
	/**
	 * Prompts user to enter toy name and returns the entered value.
	 * 
	 * @return String User input for the toy name.
	 */
	public String promptTN() {
		System.out.print("\nEnter Toy Name: ");
		String option= input.nextLine();
			
		return option;
	}

	/**
	 * Prompts user to enter toy type and returns the entered value.
	 * 
	 * @return String User input for the toy type.
	 */
	public String promptTT() {
		System.out.print("\nEnter Toy Type: ");
		String option=input.nextLine();
			
		return option;
	}

	/**
	 * Prompts user to enter toy brand and returns the entered value.
	 * 
	 * @return String User input for the toy brand.
	 */
	public String promptBrand() {
		System.out.print("\nEnter Toy Brand: ");
		String option= input.nextLine();
			
		return option;
	}
	/**

	Prompts the user to enter the price of the toy.
	@return a string representation of the toy price entered by the user.
	*/
	public String promptPrice() {
		System.out.print("\nEnter Toy Price: ");
		String option= input.nextLine();
			
		return option;
	}
	/**

	Prompts the user to enter the available stock count of the toy.
	@return an integer representing the available stock count entered by the user.
	*/
	public int promptStock() {
		System.out.print("\nEnter Available Count: ");
		int option= Integer.parseInt(input.nextLine());
			
		return option;
	}
	/**

	Prompts the user to enter the appropriate age range for the toy.
	@return an integer representing the appropriate age range entered by the user.
	*/
	public int promptAge() {
		System.out.print("\nEnter Appropriate Age: ");
		int option= Integer.parseInt(input.nextLine());
			
		return option;
	}
	/**

	Prompts the user to enter the classification of the toy.
	@return a character representing the toy classification entered by the user.
	 */
	public char promptClass() {
		System.out.print("\nWhat is the Figure Classification: Action (A), Doll(D) or Historic(H) ");
		char option = input.nextLine().toLowerCase().charAt(0);
		return option;
	}
	/**

	Prompts the user to enter the material the toy is made of.
	@return a string representation of the material entered by the user.
	*/
	public String promptMaterial() {
		System.out.print("\nDescription of the material this toy is made of: ");
		String option= input.nextLine();
			
		return option;
	}
	/**

	Prompts the user to enter the size of the toy.
	@return a character representing the size entered by the user.
	*/
	public char promptSize() {
		System.out.print("\nSize: Small(S), Medium(M) or Large(L) ");
		char option = input.nextLine().toLowerCase().charAt(0);
			
		return option;
	}
	/**

	Prompts the user to enter the puzzle type.
	@return a character representing the puzzle type entered by the user.
	*/
	public char promptType() {
		System.out.print("\nEnter puzzle-type: Mechanical(M), Cryptic(C), Logic(L), Trivia(T) or Riddle(R) ");
		char option = input.nextLine().toLowerCase().charAt(0);
			
		return option;
	}
	/**

	Prompts the user to enter the minimum number of players for a game toy.
	@return an integer representing the minimum number of players entered by the user.
	*/
	public int promptMinP() {
		System.out.print("\nEnter Minimum Number of Players: ");
		int option= Integer.parseInt(input.nextLine());
		
		return option;
	}
	/**

	Prompts the user to enter the maximum number of players for a game toy.
	@return an integer representing the maximum number of players entered by the user.
	*/
	public int promptMaxP() {
		System.out.print("\nEnter Maximum Number of Players: ");
		int option= Integer.parseInt(input.nextLine());
			
		return option;
	}
	/**

	Prompts the user to enter the designer names for a toy.
	@return a string representation of the designer names entered by the user.
	*/
	public String promptDesigner() {
		System.out.print("\nEnter Designer Names (Use ',' to seperate multiple Designers): ");
		String option= input.nextLine();
			
		return option;
	}
	/**

	Prompts the user whether to remove the given toy object and returns the user's response as a character.
	@param p the Toy object to be removed
	@return 'Y' if the user chooses to remove the toy, 'N' otherwise
	*/
	public char removeResults(Toy p) {
		System.out.println("This item found: \n");
		System.out.println("    "+p);
		System.out.print("\nDo you want to remove it (Y/N)? ");
		char option = input.nextLine().toLowerCase().charAt(0);		
		return option;
	}
	/**

	Prompts the user to enter an option number to purchase and returns the entered integer.
	@return the integer value of the user's input
	*/
	public int promptPurchase() {
		System.out.print("\nEnter option number to purchase: ");
		int option= Integer.parseInt(input.nextLine());
		return option;
	}
	/**

	Prompts the user to press Enter to continue.
	*/
	public void enterContinue() {
		System.out.println("\nPress Enter to Continue...");
		input.nextLine();		
	}
	/**

	Prints a message indicating that data is being saved to the database and thanks the user for visiting.
	*/
	public void saveMessage() {
		System.out.println("\nSaving Data into Database...\n");
		System.out.println("\n********* THANKS FOR VISITING US! *********");
	}
	
}



