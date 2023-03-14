package controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import exceptions.InvalidPlayerRangeException;
import exceptions.NegativePriceException;
import view.AppMenus;

/**
The ToyManager class is responsible for managing the toy inventory application.
It loads the toy data, creates the app menus, and launches the main menu.
*/
public class ToyManager {
	/**

	An instance of AppMenus class to access the menu functionality.
	*/
	AppMenus appMenu;
	/**

	An instance of SearchBuyToy class to search and buy toys.
	*/
	SearchBuyToy searchBuy;
	/**

	An instance of AddToy class to add new toys to the list.
	*/
	AddToy addToy;
	/**

	An instance of RemoveToy class to remove existing toys from the list.
	*/
	RemoveToy removeToy;
	/**

	An instance of ToyList class to access the list of toys.
	*/
	ToyList toyList=new ToyList();
	
	/**
	Constructs a ToyManager object and loads the toy data from file.
	@throws IOException if there is an error reading the toy data file.
	@throws NegativePriceException if a toy's price is negative.
	@throws InvalidPlayerRangeException if a toy's player range is invalid.
	*/
	public ToyManager() throws IOException, NegativePriceException, InvalidPlayerRangeException  {
		loadToyData();
		appMenu= new AppMenus();
		
		searchBuy= new SearchBuyToy(toyList);
		addToy= new AddToy(toyList); 
		removeToy= new RemoveToy(toyList);
		launchApp();
		}

	/**
	Launches the toy inventory application.
	@throws IOException if there is an error reading the toy data file.
	@throws NegativePriceException if a toy's price is negative.
	@throws InvalidPlayerRangeException if a toy's player range is invalid.
	*/
	
	private void launchApp() throws IOException, NegativePriceException, InvalidPlayerRangeException {
	    boolean state = true;
	    appMenu.startMessage();
	    
	    while (state) {
	        char option = appMenu.mainMenu();
//	      
	            if (option == '1' || option == '2' || option == '3' || option == '4') {
	                switch (option) {
	                    case '1':
	                        searchBuy.launchSearch();
	                        break;
	                    case '2':
	                        addToy.launchAdd();
	                        break;
	                    case '3':
	                        removeToy.launchRemove();
	                        break;
	                    case '4':
	                        save();
	                        state = false;
	                        break;
	                }
	            } else if (Character.isLetter(option)) {
                    System.out.println("\nThat is not an integer number! Try again.");
                } else {
                    System.out.println("\nThat is not a valid option! Try again.");
                }
	    }
	}
	/**
	Saves the toy data to file.
	@throws FileNotFoundException if the file cannot be created or written to.
	@throws IOException if there is an error reading the toy data file.
	*/
	private void save() throws FileNotFoundException {
		appMenu.saveMessage();
		toyList.saveFile();
	}
	/**
	Loads the toy data from file.
	@throws IOException if there is an error reading the toy data file.
	*/
	public void loadToyData() throws IOException {
		toyList.main();
		}
	
}

	