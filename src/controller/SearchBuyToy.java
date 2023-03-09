package controller;

import java.io.IOException;
import java.util.ArrayList;

import model.Animal;
import model.BoardGame;
import model.Figure;
import model.Puzzle;
import model.Toy;
import view.AppMenus;

public class SearchBuyToy {
	ArrayList<Toy> matches = new ArrayList<Toy>();
	AppMenus appMenu;
	ToyList toyList;
	
	public SearchBuyToy(ToyList toyList){
		this.toyList=toyList;
	}

	public void launchSearch() {
//		matches.clear(); Maybe?
		appMenu = new AppMenus();
		Search();
	}

	private void Search() {
		//		ToyList toyList = new ToyList();
		boolean state= true;
		int option;

		while (state) {
			option= appMenu.searchMenu();
			if(option==1 || option==2 || option==3 || option== 4) 

				switch (option) {
				case 1: 
					String sn= appMenu.promptSN();     
					//FIND SN
					searchBySN(sn);
//					System.out.println(matches);
					display();
					break;		

				case 2:
					String name= appMenu.promptTN();  
					//FIND TOY NAME
					searchByName(name);
					display();
					
					break;
				case 3:
					String type= appMenu.promptTT(); 
					//FIND TOY TYPE
					searchByType(type); 
					display();
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

	
	private void display() {
		System.out.println(matches);
	}

	private void searchBySN(String sn) { //serialNum
		/**This option prompts the user for a name, and displays the toys if 
		 * they exist in the database. 
		 */
		for (Toy p: toyList.getList()) {
			if(p.getSerialNum().equals(sn)) {
				//no arrayListmatches is used since its only one 
//				System.out.println(p);
				matches.add(p);
			}
		}
	}
	
	
	private void searchByName(String tn) {//toyName 

		for (Toy p: toyList.getList()) {

			if(p.getName().contains(tn)) {
				System.out.println(p);
				matches.add(p);
			}
		}
	}
	private void searchByType(String type) { //toyType
				
		for (Toy p: toyList.getList()) {
				if(p instanceof Animal) {
//					System.out.println(p);
					matches.add(p);
				}
				else if(p instanceof Puzzle) {
//					System.out.println(p);
					matches.add(p);
				}
				else if (p instanceof BoardGame) {
//					System.out.println(p);
					matches.add(p);
				}
				else if(p instanceof Figure) {
//					System.out.println(p);
					matches.add(p);
				}
			
		}
	}
}


