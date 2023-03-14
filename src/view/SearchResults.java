package view;

import java.util.ArrayList;

import model.Toy;
/**

The SearchResults class is responsible for displaying search results to the user.
*/

public class SearchResults {
	/**
	 * Displays the given list of Toy objects to the user.
	 * If the list is empty, displays a message indicating that no results were found.
	 * 
	 * @param matches an ArrayList of Toy objects that match the search criteria
	 */
	public void display(ArrayList<Toy> matches) {
		
		for (int i = 0; i <= matches.size(); i++) {
			
			if (i == matches.size() ) {
				System.out.println("\n(" + (i+1) + ")Back to Search Menu");
			} else {
				System.out.println("(" + (i+1) + ") " + matches.get(i));
			}	
		}
		
	}
}
