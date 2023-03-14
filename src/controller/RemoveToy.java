package controller;

import model.Toy;
import view.AppMenus;

/**
The RemoveToy class provides methods to remove a toy from a toy list.
*/
public class RemoveToy {

	/**
	An instance of AppMenus class to access the menu functionality.
	*/
	AppMenus appMenu;
	/**
	An instance of ToyList class to add the new toy to the list.
	*/
	ToyList toyList;
	/**
	Constructs a RemoveToy object with a given ToyList object.
	@param toyList the ToyList object to remove toys from
	 */
	public RemoveToy(ToyList toyList) {
		this.toyList=toyList;
	}
	
	/**
	Launches the toy removal process by creating a new AppMenus object,
	prompting the user for the serial number of the toy to remove, and then calling the remove method.
	*/
	public void launchRemove() {
		appMenu= new AppMenus();
		String sn = appMenu.promptSN();
		remove(sn);

	}
	/**
	Removes a toy with the given serial number from the ToyList object.
	@param sn the serial number of the toy to remove
	*/
	public void remove(String sn) {
		char option;
		boolean found=false;
		
		for (Toy p: toyList.getList()) {
	        if(p.getSerialNum().equals(sn)) {

	        	found = true;
	            option=appMenu.removeResults(p);
	            choice(option,p);
	            break;
	        }
	    }if (!found) {
	        System.out.println("\nSerial number " + sn + " not found. Please try again.");
	    }
			
		appMenu.enterContinue();
	}
	/**
	Performs the removal action based on the user's response to the remove confirmation prompt.
	@param option the user's response (y/n) to the remove confirmation prompt
	@param p the Toy object to remove
	*/
	private void choice(char option, Toy p) {
		if (option=='y') {
			toyList.remove(p);
			System.out.println("\nItem Removed!");
		}
		else if(option=='n'){
			System.out.println("Proccess Cancelled.");
		}
		else {
			System.out.println("Invalid input");
		}
	}
}

