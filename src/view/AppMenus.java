package view;

import java.util.Scanner;

public class AppMenus {

		Scanner input;
		
		public AppMenus() {
			input= new Scanner(System.in);
		}
		
	public int mainMenu() {
		int option;
		System.out.println("How We May Help You? \n");
		System.out.println("(1) Search Inventory and Purchase Toy");
		System.out.println("(2) Add a New Toy");
		System.out.println("(3) Remove a Toy");
		System.out.println("(4) Save and Exit");
		System.out.println("(BONUS)Make a gift suggestion");
		System.out.print("\nEnter Option: ");
	      option = input.nextInt();
		
		return option;
	}
	public int searchMenu() {
		int option;
		System.out.println("Find Toys With: \n");
		System.out.println("(1) Serial Number");
		System.out.println("(2) Toy Name ");
		System.out.println("(3) Type");
		System.out.println("(4) Back to Main Menu");
		System.out.print("\nEnter Option: ");
	      option = input.nextInt();
		
		return option;
	}

	public int findSN() {
		int option;
		System.out.print("Enter Serial Number: ");
			option= input.nextInt();
			
		return option;
	}

	public String findTN() {
		String option;
		System.out.print("Enter Toy Name: ");
			option= input.nextLine();
			
		return option;
	}

	public String findTT() {
		String option;
		System.out.print("Enter Toy Type: ");
			option= input.nextLine();
			
		return option;
	}

	public String promptTB() {
		String option;
		System.out.print("Enter Toy Brand: ");
			option= input.nextLine();
			
		return option;
	}

	public int promptTP() {
		int option;
		System.out.print("Enter Toy Price: ");
			option= input.nextInt();
			
		return option;
	}

	public int promptTC() {
		int option;
		System.out.print("Enter Available Count: ");
			option= input.nextInt();
			
		return option;
	}
	public int promptTA() {
		int option;
		System.out.print("Enter Appropriate Age: ");
			option= input.nextInt();
			
		return option;
	}
	public int promptMinP() {
		int option;
		System.out.print("Enter Minimum Number of Players: ");
			option= input.nextInt();
			
		return option;
	}
	public int promptMaxP() {
		int option;
		System.out.print("Enter Maximum Number of Players: ");
			option= input.nextInt();
			
		return option;
	}
	public String promptD() {
		String option;
		System.out.print("Enter Designer Name (use ',' to seperate the names if there is more than one name): ");
			option= input.nextLine();
			
		return option;
	}

//	public void searchResult() {
//		String formatedInfo;
//		//Category:--Serial Number:--Name: --Brand:-- Price:-- Available Count:-- 
//		return formatedInfo;
//	}
	
	
}



