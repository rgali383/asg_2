package controller;

import java.io.IOException;
import java.util.ArrayList;

import model.Toy;
import view.AppMenus;

public class SearchBuyToy {
	AppMenus appMenu;
//	ToyManager manager;
	ToyManager manager= new ToyManager();
	ArrayList<Toy> toyList = manager.getList();
	
	public SearchBuyToy() throws IOException {
	
	appMenu = new AppMenus();
	
	}

	public void launchSearch() {
		boolean state= true;
		int option;
		
		while (state) {
			option= appMenu.searchMenu();
			if(option==1 || option==2 || option==3 || option== 4) 
			
				switch (option) {
				case 1: 
				    int sn= appMenu.findSN();     //FIND SN
					searchSN(sn); //find sn, we could use the .getsn()
//					display();
					break;		
					
				case 2:
					String tn= appMenu.findTN();  //FIND TOY NAME
					searchTN(tn);// get toy name ?
//					display();

					break;
				case 3:
					String tt=appMenu.findTT();  //FIND TOY TYPE
//					searchTT(); //display all toys with that type 
//					display();
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
		
		
	}

	private void searchSN(int sn) { //serialNum
		/**This option prompts the user for a name, and displays the toys if 
		 * they exist in the database. 
		 */
		
		Toy toy = null;

		for (Toy p: toyList) {
			if(p.getSerialNum()==sn) {
				toy = p;	
					break;
					}
			System.out.println(p.toString());
		}
//		return toy;
	}
	private void searchTN(String tn) {//toyName 
		Toy toy = null;

		for (Toy p: toyList) {
			if(p.getName().equals(tn)) {
				toy = p;	
					break;
					}
			System.out.println(p.toString());
		}
	}
//	private void searchTT() { //toyType
//		Toy toy = null;
//
//		for (Toy p: toyList) {
//			if(p.get) {
//				toy = p;	
//					break;
//					}
//			System.out.println(p.toString());
//		}
	//HOW TO GET CATEGORY??
	}
//
//	private void display() {
//		appMenu.searchResult();
//	}


