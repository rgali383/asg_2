package controller;

import java.io.IOException;
import model.Animal;
import model.BoardGame;
import model.Figure;
import model.Puzzle;
import view.AppMenus;

public class AddToy {

	AppMenus appMenu;
	ToyList toyList;

	public void launchAdd() throws IOException {
		appMenu = new AppMenus();
		Search();
		
	}

	private void Search() throws IOException {		
		ToyList toyList= new ToyList();
		String sn= appMenu.promptSN();
	    boolean state=uniqueSN(sn);
//		boolean state = true;
		  
		String tname= appMenu.promptTN();
		
		String tbrand= appMenu.promptBrand();
		double tprice= appMenu.promptPrice();
		int count= appMenu.promptStock();
		int age= appMenu.promptAge();
		
	    int option = Character.getNumericValue(sn.charAt(0));    
		while (state)  //ONLY WANT TO ADD A TOY ONCE  unlike loadData which should iterate through each line 
			
			if(option == 0 || option==1 || option==2 || option==3 || option==4 || option==5 || option==6 || option==7 || option==8 || option==9) 
			
				switch (option) { 
				case 0: 
				case 1:
					String classification= appMenu.promptClass();
					Figure toyF = new Figure (sn, tname, tbrand, tprice, count, age, classification);
					toyList.add(toyF);
					state=false;
					break;
					
				case 2:
				case 3:
					String material= appMenu.promptMaterial();
					String size= appMenu.promptSize();
					Animal toyA = new Animal(sn, tname, tbrand, tprice, count, age, material, size);
					toyList.add(toyA);
					state=false;
					break;
				case 4:
				case 5:
				case 6:
					String type = appMenu.promptType();
					Puzzle toyP= new Puzzle (sn, tname, tbrand, tprice, count, age, type);
					toyList.add(toyP);
					state= false;
					break;
				case 7:
				case 8:
				case 9:
					int minP= appMenu.promptMinP();
					int maxP=appMenu.promptMaxP();
					String designers= appMenu.promptDesigner();
					BoardGame toyBG= new BoardGame (sn, tname, tbrand, tprice, count, age, minP, maxP, designers);
					toyList.add(toyBG);
					state= false;
					break;
					
				}
		System.out.println("New Toy Added!");
		

	}

	private boolean uniqueSN(String sn) {
		ToyList toyList= new ToyList();
		boolean state=(toyList.getSerialNumber(sn));
		
		if (state==false) {
		    System.out.println("SN ALREADY EXISTS");
		}
			return state;
	}

}
