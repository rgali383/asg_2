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
	      option = Integer.parseInt(input.nextLine());
		
		return option;
	}

	public String promptSN() {
		String option;
		System.out.print("Enter Serial Number: ");
			option= input.nextLine();
			
		return option;
	}

	public String promptTN() {
		String option;
		System.out.print("Enter Toy Name: ");
			option= input.nextLine();
			
		return option;
	}

	public String promptTT() {
		String option;
		System.out.print("Enter Toy Type: ");
			option= input.nextLine();
			
		return option;
	}

	public String promptBrand() {
		String option;
		System.out.print("Enter Toy Brand: ");
			option= input.nextLine();
			
		return option;
	}

	public int promptPrice() {
		int option;
		System.out.print("Enter Toy Price: ");
			option= input.nextInt();
			
		return option;
	}

	public int promptStock() {
		int option;
		System.out.print("Enter Available Count: ");
			option= input.nextInt();
			
		return option;
	}
	public int promptAge() {
		int option;
		System.out.print("Enter Appropriate Age: ");
			option= input.nextInt();
			
		return option;
	}
	public String promptClass() {
		String option;
		System.out.println("What is the Figure Classification: Action (A), Doll(D) or Historic(H) ");
		option= input.nextLine();

		return option;
	}
	public String promptMaterial() {
		String option;
		System.out.print("Description of the material this toy is made of: ");
			option= input.nextLine();
			
		return option;
	}

	public String promptSize() {
		String option;
		System.out.print("Size: Small(S), Medium(M) or Large(L) ");
			option= input.nextLine();
			
		return option;
	}
	public String promptType() {
		String option;
		System.out.print("Enter puzzle-type: Mechanical(M), Cryptic(C), Logic(L), Trivia(T) or Riddle(R) ");
			option= input.nextLine();
			
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

	public String promptDesigner() {
		String option;
		System.out.print("Designer(s), all seperated by a comma only: ");
			option= input.nextLine();
			
		return option;
	}

	public String removeResults(String formatedResults) {
		String option;
		System.out.println("This item found:");
		System.out.println("");
		System.out.println("           "+formatedResults);
		System.out.println("Do you want to remove it (Y/N)? ");
			option= input.nextLine();
			
		System.out.println("");
		System.out.println("Item Removed!");
		return option;
	}
	
}



