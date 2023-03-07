package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Animal;
import model.BoardGame;
import model.Figure;
import model.Puzzle;
import model.Toy;
import view.AppMenus;



public class ToyManager {
	
	private final String FILE_PATH ="res/toys.txt";
	ArrayList<Toy> toyList;
	AppMenus appMenu;
	SearchBuyToy searchBuy;
	AddToy addToy;
	RemoveToy removeToy;
	
	public ToyManager() throws IOException {
		toyList = new ArrayList<>();
		appMenu= new AppMenus();
//		searchBuy= new SearchBuyToy();
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
//					searchBuy.launchSearch();
					break;		
					
				case 2:
					addToy.launchAdd(); 
					toyList.add(null); //ADD WHATEVER IS CREATED IN addToy
					break;
				case 3:
					removeToy.launchRemove();
					break;
					
				case 4:
					Save();
					state = false; //ENDS PROGRAM
				
			}
			else 
				System.out.println("Invalid Input Try Again");
			
		}
		
	}

	private void Save() throws FileNotFoundException {
		File toyInfo = new File(FILE_PATH);
		PrintWriter pw = new PrintWriter(toyInfo);
		
		for(Toy toy: toyList) {
			pw.println(toy.formatData()); //EXTEND TOY CLASS FOR FOMAT DATA ALSO?
		}
		pw.close();
	}
		

	public void loadToyData() throws IOException {
		File toyInfo = new File(FILE_PATH);
		String currLine;
		String[] toyData;
		int option;
		boolean state= true;
		
		if(toyInfo.exists()) {
			Scanner fileReader = new Scanner(toyInfo);
			while(fileReader.hasNext()) {
				currLine = fileReader.nextLine();
				toyData = currLine.split(";");
				char toyLine = toyData[0].charAt(0);
				option = Character.getNumericValue(toyLine);
				
				System.out.println(option);
				
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
				fileReader.close(); 
				//CLOSING SCANNER  

				}
				}
		else {
			System.out.println("file does not exist");
			toyInfo.createNewFile();
		}
		}

		
	
	
//	private Toy searchByName(String name) {
//		/**This option prompts the user for a name, and displays the toys if 
//		 * they exist in the database. 
//		 */
//		Toy toy = null;
//		
//		
//		for (Toy p: toyList) {
//			if(p.getName().equals(name)) {
//				toy = p;	
//					break;
//					}
//		}
//		return toy;
//	}
//	private Toy searchBySN(double serialNum) {
//		/**This option prompts the user for a name, and displays the toys if 
//		 * they exist in the database. 
//		 */
//		Toy toy = null;
//		
//		
//		for (Toy p: toyList) {
//			if(p.getName().equals(serialNum)) {
//				toy = p;	
//					break;
//					}
//		}
//		return toy;
//	}
//	private Toy searchByType(String type) {
//		/**This option prompts the user for a name, and displays the toys if 
//		 * they exist in the database. 
//		 */
//		Toy toy = null;
//		
//		
//		for (Toy p: toyList) {
//			if(p.getName().equals(type)) {
//				toy = p;	
//					break;
//					}
//		}
//		return toy;
//	}


	public ArrayList<Toy> getList() {
		return toyList;
	}
	
}

	