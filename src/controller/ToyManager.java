package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import view.AppMenus;



public class ToyManager {
	

	AppMenus appMenu;
	SearchBuyToy searchBuy;
	AddToy addToy;
	RemoveToy removeToy;
	ToyList toyList=new ToyList();
	
	public ToyManager() throws IOException {
		appMenu= new AppMenus();
		
		searchBuy= new SearchBuyToy();
		addToy= new AddToy(); 
		removeToy= new RemoveToy();
		loadToyData();
		launchApp();
		}


	private void launchApp() throws IOException {
		boolean state= true;
		 
		while (state) {		
			
			int option= appMenu.mainMenu();

			
			if(option==1 || option==2 || option==3 || option== 4) 
			
				switch (option) {
				case 1: 
					searchBuy.launchSearch();
					break;		
					
				case 2:
					addToy.launchAdd(); 
					break;
				case 3:
					removeToy.launchRemove();
					break;
					
				case 4:
					save();
					state = false; //ENDS PROGRAM
				
			}
			else 
				System.out.println("Invalid Input Try Again");
			
		}
		
	}

	private void save() throws FileNotFoundException {
		toyList.saveFile();
	}
	public void loadToyData() throws IOException {
		toyList.main();
		}
	
}

	