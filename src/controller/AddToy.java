package controller;

import java.io.IOException;
import java.util.ArrayList;

import model.Animal;
import model.BoardGame;
import model.Figure;
import model.Puzzle;
import model.Toy;
import view.AppMenus;

public class AddToy {

	AppMenus appMenu;
	ArrayList<Toy> toyList;
	
	public void launchAdd() throws IOException {
		appMenu = new AppMenus();
		Search();
		
	}

	private void Search() {
//		ToyManager toys= new ToyManager();
			String tname= appMenu.findTN();
		String tbrand= appMenu.promptTB();
		int tprice= appMenu.promptTP();
		int count= appMenu.promptTC();
		int age= appMenu.promptTA();
		int minP=appMenu.promptMinP();
		int maxP=appMenu.promptMaxP();
		String designer= appMenu.promptD();
		System.out.println("New Toy Added!");
		//ENTER SENDS BACK TO MAIN MENU
		
		int sn= appMenu.findSN();
		
	    int option = Integer.parseInt(Integer.toString(sn).substring(0, 1));
	    System.out.println(option);
	    //the program should validate the serial number before using it (see toy attributes)
	    boolean state=true;
	    
		while (state) 
	
			if(option == 0 || option==1 || option==2 || option==3 || option==4 || option==5 || option==6 || option==7 || option==8 || option==9) 
			
				switch (option) { 
				case 0: 
				case 1:
					Figure toyF = new Figure (Integer.parseInt(toyData[0]), toyData[1], toyData[2], Double.parseDouble(toyData[3]), Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]),toyData[6]);
					toyList.add(toyF);
					state=false;
					break;
					
				case 2:
				case 3:
					Animal toyA = new Animal(Integer.parseInt(toyData[0]), toyData[1], toyData[2], Double.parseDouble(toyData[3]), Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]),toyData[6], toyData[7]);
					toyList.add(toyA);
					state=false;
					break;
				case 4:
				case 5:
				case 6:
					Puzzle toyP= new Puzzle (Integer.parseInt(toyData[0]), toyData[1], toyData[2], Double.parseDouble(toyData[3]), Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]), toyData[6]);
					toyList.add(toyP);
					state= false;
					break;
				case 7:
				case 8:
				case 9:
					BoardGame toyBG= new BoardGame (Integer.parseInt(toyData[0]), toyData[1], toyData[2], Double.parseDouble(toyData[3]), Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]), Integer.parseInt(toyData[6]), toyData[7]);
					toyList.add(toyBG);
					state= false;
					break;
				
				}
//		Toy carToy = new Toy("Car", "ABC123", "Toyota", "12345", "Red");
//        toys.addToy(//SOMETHINNG);
	}

}
