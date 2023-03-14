package controller;

import view.AppMenus;


/**
The ValidateInput class provides methods to validate and ensure user input is valid for various properties such as serial number, 
stock, age, classification, size, and type. Assuming name brand and material dont need validation.
It uses AppMenus class to prompt and get input from the user.
*/
public class ValidateInput {

	/**
	An instance of AppMenus class to access the menu functionality.
	*/
	AppMenus appMenu;
	/**

	The ValidateInput class represents the functionality to validate user input.

	It includes an instance of AppMenus class to access the menu functionality.
	*/
	public ValidateInput(){
		appMenu=new AppMenus();
	}
	
	/**
	Ensures the serial number entered is valid by checking that it is exactly 10 digits and only contains digits.
	@return The serial number entered by the user.
	*/
	public String serialNumber() {
		String sn=" ";
		boolean hasLetters = true;

		while (hasLetters || sn.length() != 10) {
		    sn = appMenu.promptSN();
		    hasLetters = !sn.matches("\\d+");
		    
		    if (hasLetters) {
		        System.out.println("\nThe Serial Number must only contain digits! Try again.");
		    } else if (sn.length() != 10) {
		        System.out.println("\nThe Serial Number length MUST be 10 digits! Try again.");
		    }
		}
		return sn;	    
	}

	/**
	Ensures the stock count entered is valid by checking that it is a positive integer.
	@return The stock count entered by the user.
	*/
	public int stock() {
		int count = 0;
		boolean valid=true;
		while (valid) {
			count= appMenu.promptStock();
			if(count<=0) {
				System.out.println("\nThe Available count must be positive! Try again.");
			}
			else {
				valid=false;
			}
		}
		return count;
	}

	/**
	Ensures the age entered is valid by checking that it is a positive integer.
	@return The age entered by the user.
	*/
	public int age() {
		int age=0;
		boolean valid=true;
		while (valid) {
			 age= appMenu.promptAge();
			
			if(age<0) {
				System.out.println("\nThe Age Number must be positive! Try again.");
			}
			else {
				valid=false;
			}
		}
		return age;
	}

	/**
	Ensures the classification entered is valid by checking that it is either 'a', 'd', or 'h'.
	@return The classification entered by the user.
	*/
	public char classification() {
		char classification =' ';
		boolean valid=true;
		while(valid) {
			classification= appMenu.promptClass();
			if ((classification=='a')||(classification=='d')||(classification=='h')) {
				valid=false;
			} else if (Character.isDigit(classification)) {
             System.out.println("\nThat is not a Character option! Try again.");
			}else {
             System.out.println("\nThat is not a valid option! Try again.");
         	}
		}
		return classification;
	}

	/**
	Ensures the size entered is valid by checking that it is either 's', 'm', or 'l'.
	@return The size entered by the user.
	*/
	public char size() {
		char size =' ';
		boolean valid=true;
		while(valid) {
			size= appMenu.promptSize();
			if ((size=='s')||(size=='m')||(size=='l')) {
				valid=false;
			} else if (Character.isDigit(size)) {
             System.out.println("\nThat is not a Character option! Try again.");
			}else {
             System.out.println("\nThat is not a valid option! Try again.");
         	}
		}
		return size;
	}
	
	/**
	Ensures the puzzle type entered is valid by checking that it is either 'm', 'c', 'l', 't' or 'r'.
	@return The type entered by the user.
	*/
	public char type() {
		char type =' ';
		boolean valid=true;
		while(valid) {
			type= appMenu.promptType();
			if ((type=='m')||(type=='c')||(type=='l')||(type=='t')||(type=='r')) {
				valid=false;
			} else if (Character.isDigit(type)) {
             System.out.println("\nThat is not a Character option! Try again.");
			}else {
             System.out.println("\nThat is not a valid option! Try again.");
         	}
		}
		return type;
	}
	/**
	Ensures the toy type entered is valid by checking that it is either "Figure", "Animal", "Puzzle", or "BoardGame".
	@return The type entered by the user.
	*/
	public String typeToys() {
		String type= appMenu.promptTT();
		
		 if (!type.equals("Figure") && !type.equals("Animal") && !type.equals("Puzzle") && !type.equals("BoardGame")) {             
	        System.out.println("\nThat is not a valid option! Try again.");	
		 }
		return type;
	}
	/**

	The price method is used to validate and return the price of a toy as a String.

	It uses the promptPrice method of AppMenus class to get the price input from the user.

	It checks if the price input is a valid decimal number with digits and decimal point.

	If the input is not valid, it displays an error message and prompts the user again.

	It continues to prompt the user until a valid input is entered and then returns the price as a String.

	@return a String representation of the valid price input by the user.
	*/
	public String price() {
	    String price="";
		boolean valid=true;
		
		while(valid) {
			price= appMenu.promptPrice();
			
			if ((price.contains("1"))||(price.contains("2"))||(price.contains("3"))||(price.contains("4"))||(price.contains("5"))||(price.contains("6"))||(price.contains("7"))||(price.contains("8"))||(price.contains("9"))||(price.contains("0"))&&(price.contains("."))) {
				 valid=false;
			}else {
				System.out.println("\nPrice must be an Integer.");
         	}
		}
		return price;  
	    }


}
