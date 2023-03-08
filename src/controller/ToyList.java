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

public class ToyList {
	private final String FILE_PATH ="res/toys.txt";
	private ArrayList<Toy> toyList;

	public void main() throws IOException {
	toyList = new ArrayList<>();

	File toyInfo = new File(FILE_PATH);
	String currLine;
	String[] toyData;
	int option;
	boolean state= true;
	
	if(toyInfo.exists()) {
		Scanner fileReader = new Scanner(toyInfo);  //USE FINALLY IN EXCEPTIONS TO CLOSE IT 
		
		while(fileReader.hasNext()) {
			currLine = fileReader.nextLine();
			toyData = currLine.split(";");
			
			char toyLine = toyData[0].charAt(0);
			option = Character.getNumericValue(toyLine);			
			while (state) 
		
				if(option == 0 || option==1 || option==2 || option==3 || option==4 || option==5 || option==6 || option==7 || option==8 || option==9) 
				
					switch (option) { 
					case 0: 
					case 1:
						Figure toyF = new Figure (toyData[0], toyData[1], toyData[2], Double.parseDouble(toyData[3]), Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]),toyData[6]);
						toyList.add(toyF);
//						toyF.toString();
						state=false;
						break;
						
					case 2:
					case 3:
						Animal toyA = new Animal(toyData[0], toyData[1], toyData[2], Double.parseDouble(toyData[3]), Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]),toyData[6], toyData[7]);
						toyList.add(toyA);
						state=false;
						break;
					case 4:
					case 5:
					case 6:
						Puzzle toyP= new Puzzle (toyData[0], toyData[1], toyData[2], Double.parseDouble(toyData[3]), Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]), toyData[6]);
						toyList.add(toyP);
						state= false;
						break;
					case 7:
					case 8:
					case 9:
						BoardGame toyBG= new BoardGame (toyData[0], toyData[1], toyData[2], Double.parseDouble(toyData[3]), Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]), Integer.parseInt(toyData[6]), toyData[7]);
						toyList.add(toyBG);
						state= false;
						break;
					
					}
			}
			}
	else {
		System.out.println("file does not exist");
		toyInfo.createNewFile();
	}
	}
	public void saveFile() throws FileNotFoundException {
		
		File toyInfo = new File(FILE_PATH);
		PrintWriter pw = new PrintWriter(toyInfo);
		
		for(Toy toy: toyList) {
			pw.println(toy.formatData()); //EXTEND TOY CLASS FOR FOMAT DATA ALSO?
		}
		pw.close();
	}
	
	
	public boolean getSerialNumber(String promptSN){ //USED TO VERIFY UNIQUE SN AND REMOVE MENU OPTION
		boolean found=true;
		
		for (Toy p: toyList) { //THIS TOY LIST NULL?
			//iterate through toyList until promptSN is found 
			if(!(p.getSerialNum()==promptSN)) {
				found= false;
				break;
			}
		}
		return found;
	}
	public void getString(String sn) {
		toyList.toString(); //GET THE TO STRING FROM A CERTAIN SN 
	}
	
	public void add(Figure toyF) {
		toyList.add(toyF);
	}
	public void add(Animal toyA) {
		toyList.add(toyA);
	}
	public void add(Puzzle toyP) {
		toyList.add(toyP);
	}
	public void add(BoardGame toyBG) {
		toyList.add(toyBG);
	}
	public ArrayList<Toy> getList() {
		return toyList;
	}
	public void remove(String sn) {
		toyList.remove(sn);
	}
}
