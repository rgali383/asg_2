package controller;

import java.io.IOException;
import java.util.ArrayList;

import model.Toy;
import view.AppMenus;

public class SearchBuyToy {
	ArrayList<Toy> matches = new ArrayList<Toy>();
	AppMenus appMenu;
	ToyList toyList = new ToyList();

	public void launchSearch() {
		appMenu = new AppMenus();
		Search();
		purchaseToy();
	}

	private void purchaseToy() {
		// TODO Auto-generated method stub

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
					String sn= appMenu.promptSN();     //FIND SN
					searchSN(sn);

					break;		

				case 2:
					String tn= appMenu.promptTN();  //FIND TOY NAME
					searchByTN(tn);

					break;
				case 3:
					String tt= appMenu.promptTT();  //FIND TOY TYPE
					//					searchTT(tt); 

					break;

				case 4:
					//BACK TO MAIN MENU
					state= false;
					break;
				}
			else 
				//throw ane exeption 
				System.out.println("Invalid Input Try Again");
		}
		System.out.println(matches);

	}

	private void searchSN(String sn) {
		Toy toy=searchBySN(sn);
		boolean option = true;

		while (option) {
			matches.add(toy);

		}

	}
	private Toy searchBySN(String sn) { //serialNum
		/**This option prompts the user for a name, and displays the toys if 
		 * they exist in the database. 
		 */
		Toy toy = null;
		for (Toy p: toyList.getList()) {
			if(p.getSerialNum().equals(sn)) {
				toy= p;

				break;
			}
		}
		return toy;
	}

	//	private void searchTN(String tn) {
	//		System.out.println("searchTN ");
	//		Toy toy=searchByTN(tn);
	////		boolean option=true;
	//		
	//		matches.add(toy);
	//		
	//		System.out.println(matches);
	//		
	//	}
	private void searchByTN(String tn) {//toyName 

		for (Toy p: toyList.getList()) {
			if(p.getName().contains(tn)) {
				matches.add(p);
			}
		}
		System.out.println(matches);
	}
	//	private void searchTT(String tt) { //toyType
	//		//if ((the item in first line) instance of (Animal, Figure, Puzzle and Board Game))
	//		//		display();
	//		ArrayList<Toy> matches = new ArrayList<Toy>();
	//		
	//		Toy type;
	//
	//		for (Toy p: toyList.getList()) {
	//			if(p instanceof Animal) {
	//				type = p;
	//			}
	//			else if(p instanceof Puzzle) {
	//				type=p;
	//			}
	//			else if (p instanceof BoardGame) {
	//				type= p;
	//			}
	//			else if(p instanceof Figure) {
	//				type= p;
	//			}
	//		System.out.println(type.toString());
	//	}
}
//
//	private void display() {
//		appMenu.searchResult();
//	}


