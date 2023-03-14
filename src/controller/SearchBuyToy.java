package controller;

import java.util.ArrayList;

import model.Animal;
import model.BoardGame;
import model.Figure;
import model.Puzzle;
import model.Toy;
import view.AppMenus;
import view.SearchResults;

/**
The SearchBuyToy class represents a class that allows the user to search for and purchase toys from a ToyList.
*/
public class SearchBuyToy {
	/**

	An ArrayList of Toy objects to store the search results.
	*/
	ArrayList<Toy> matches = new ArrayList<Toy>();
	/**

	An instance of SearchResults class to display the search results.
	*/
	SearchResults searchResults;
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

	Constructor that creates a new SearchBuyToy object with a given ToyList object.
	@param toyList The ToyList object containing the list of all available toys.
	*/
	public SearchBuyToy(ToyList toyList){
		this.toyList=toyList;
	}
	/**

	Launches the toy search application by initializing AppMenus, SearchResults, and calling the Search method.
	*/
	public void launchSearch() {
		appMenu = new AppMenus();
		validateIn= new ValidateInput();
		searchResults=new SearchResults();
		Search();
	}
	/**

	Private method used for handling the search option functionality of the application.
	*/
	private void Search() {
		boolean state= true;
		int option;

		while (state) {
			option= appMenu.searchMenu();
			if(option==1 || option==2 || option==3 || option== 4) 

				switch (option) {
				case 1: 
					String sn= validateIn.serialNumber(); 
					
					//FIND SN
					searchBySN(sn);
					displayAndPurchase();
					break;		

				case 2:
					String name= appMenu.promptTN();  
					
					//FIND TOY NAME
					searchByName(name);
					displayAndPurchase();
					
					break;
				case 3:
					String typeToy=validateIn.typeToys();
//					appMenu.promptTT();
					
					//FIND TOY TYPE
					searchByType(typeToy); 
					displayAndPurchase();
					break;

				case 4:
					//BACK TO MAIN MENU
					state= false;
					break;
					
				}
			else 
				System.out.println("Invalid Input Try Again");
		}

	}

	/**
	Displays the search results and prompts the user to select a toy to purchase.
	If the user selects a toy to purchase, the method updates the available quantity of the toy and
	displays a success message, otherwise the method terminates the transaction and returns to the search menu.
	*/
	private void displayAndPurchase() {
		searchResults.display(matches);
		int pOption = appMenu.promptPurchase();

		if (pOption== matches.size()+1) {
			System.out.println("\nTransaction Terminated. Back to Search Menu.");
		}else {
			for (Toy p: toyList.getList()) {	
				if(p.equals(matches.get(pOption-1)))
					if (p.getAvailable() == 0) {
			            System.out.println("\nSorry, the selected item is currently out of stock. Please try again.\n");
			            displayAndPurchase();
					}else {
						p.setAvailable(p.getAvailable()-1);
					}
			}
			System.out.println("\nTransaction Successfully Completed!");
			appMenu.enterContinue();
		}
		
	}
	/**
	Searches for toys by serial number and adds them to the matches list.
	@param sn The serial number of the toy to search for.
	*/
	private void searchBySN(String sn) { 
		
		matches.clear();
		for (Toy p: toyList.getList()) {
			if(p.getSerialNum().equals(sn)) {
			
				matches.add(p);
			}
		}
	}
	
	/**
	Searches for toys by name and adds them to the matches list.
	@param tn The name of the toy to search for.
	*/
	private void searchByName(String tn) {//toyName 
		matches.clear();
		for (Toy p: toyList.getList()) {

			if(p.getName().contains(tn)) {
				matches.add(p);
			}
		}
	}
	/**

	Searches the toyList for toys of a specific type and adds them to the matches list.
	@param type The type of toys to search for.
	*/
	private void searchByType(String type) { //toyType
		matches.clear();
		for (Toy p: toyList.getList()) {
				if(p instanceof Animal) {
					if (p.toString().contains(type))
						
					matches.add(p);
				}
				else if(p instanceof Puzzle) {
					if (p.toString().contains(type))

					matches.add(p);
				}
				else if (p instanceof BoardGame) {
					if (p.toString().contains(type))

					matches.add(p);
				}
				else if(p instanceof Figure) {
					if (p.toString().contains(type))

					matches.add(p);
				}
			
		}
	}
}


