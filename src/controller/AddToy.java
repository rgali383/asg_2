package controller;

import java.io.IOException;

import exceptions.InvalidPlayerRangeException;
import exceptions.NegativePriceException;
import model.Animal;
import model.BoardGame;
import model.Figure;
import model.Puzzle;
import model.Toy;
import view.AppMenus;

/**
The AddToy class represents the functionality to add a new toy to the ToyList.

It provides the user with prompts to fill out a type of toy.
*/
public class AddToy {

		/**
		An instance of AppMenus class to access the menu functionality.
		*/
		AppMenus appMenu;
		/**
		An instance of ValidateInput class to validate user input.
		*/
		ValidateInput validateIn;
		/**
		An instance of ToyList class to add the new toy to the list.
		*/
		ToyList toyList;

	/**
	 * Constructs an AddToy object with the given ToyList.
	 * @param toyList The ToyList to add the new toy to.
	 */
	public AddToy(ToyList toyList) {
		this.toyList=toyList;
	}
	/**
	 * Launches the Add Toy menu and prompts the user for information about the new toy.
	 * Creates a new toy object based on the input and adds it to the ToyList.
	 * @throws IOException if an I/O error occurs.
	 * @throws NegativePriceException if the price of the toy is negative.
	 * @throws InvalidPlayerRangeException if the player range of the toy is invalid.
	 */
	
	public void launchAdd() throws IOException, NegativePriceException, InvalidPlayerRangeException {		
		appMenu = new AppMenus();
		validateIn= new ValidateInput();
		search();
		}
		
	/**
	 * Prompts the user for the serial number of the new toy and checks if it is unique in the ToyList.
	 * If the serial number is unique, it prompts the user for information about the toy and creates a new toy object.
	 * If the serial number is not unique, it prompts the user to enter a different serial number.
	 * @throws IOException if an I/O error occurs.
	 * @throws NegativePriceException if the price of the toy is negative.
	 * @throws InvalidPlayerRangeException if the player range of the toy is invalid.
	 */
	private void search() throws IOException, NegativePriceException, InvalidPlayerRangeException {		
		String sn = validateIn.serialNumber();
		boolean state=uniqueSN(sn);
		 
		while (state) { 
			
			String tname= appMenu.promptTN();
			String tbrand= appMenu.promptBrand();
			String tprice= validateIn.price();
			validatePrice(tprice);//CUSTOM EXCEPTION
	
			int count= validateIn.stock();
			int age= validateIn.age();
			
			
		    int option = Character.getNumericValue(sn.charAt(0));    
		    
			if(option == 0 || option==1 || option==2 || option==3 || option==4 || option==5 || option==6 || option==7 || option==8 || option==9) 
			
				switch (option) { 
				case 0: 
				case 1:
					char classification= validateIn.classification();
					Figure toyF = new Figure (sn, tname, tbrand, tprice, count, age, classification);
					toyList.add(toyF);
					state = false;
					break;
					
				case 2:	
				case 3:
					String material= appMenu.promptMaterial();
					char size= validateIn.size();
					Animal toyA = new Animal(sn, tname, tbrand, tprice, count, age, material, size);
					toyList.add(toyA);
					state=false;
					break;
				case 4:
				case 5:
				case 6:
					char type = validateIn.type();
					Puzzle toyP= new Puzzle (sn, tname, tbrand, tprice, count, age, type);
					toyList.add(toyP);
					state= false;
					break;
				case 7:
				case 8:
				case 9:
					int minP= appMenu.promptMinP();
					int maxP=appMenu.promptMaxP();
					if (minP > maxP) {
                        throw new InvalidPlayerRangeException("Invalid players: Minimum number of players cannot be greater than Maximum.");
                    }
					String designers= appMenu.promptDesigner();
					BoardGame toyBG= new BoardGame (sn, tname, tbrand, tprice, count, age, minP, maxP, designers);
					toyList.add(toyBG);
					state= false;
					break;
				
				}
		
		System.out.println("\nNew Toy Added!");
		appMenu.enterContinue();
		}

	}

	/**
	Validates if the price of the toy is negative.
	@param tprice the price of the toy.
	@throws NegativePriceException if the price is negative.
	*/
	
	private void validatePrice(String tprice) throws NegativePriceException {
		Double price=Double.parseDouble(tprice);
		if (price < 0 ) {
            throw new NegativePriceException("Price cannot be Negative");
		}
	}
	
	/**
	Checks if a toy with the given serial number already exists in the toy list.
	@param sn the serial number of the toy to check.
	@return true if no toy with the given serial number exists, false otherwise.
	*/
	private boolean uniqueSN(String sn) {
		boolean unique = true;
	
		for (Toy p: toyList.getList()) {
			if(p.getSerialNum().equals(sn)) {
					unique= false;
					System.out.println("\nA Toy With This Serial Number Already Exists! Try Again.");
				}
			}
		return unique;
	}

}
