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
/**
A class that represents a list of toys that can be saved to and loaded from a file.
This class contains methods for creating, updating, and deleting toys from the list.
*/
public class ToyList {
	/**

	The file path of the text file which stores the toys list.
	*/
	private final String FILE_PATH ="res/toys.txt";
	/**

	An ArrayList of Toy objects to store the toys.
	*/
	private ArrayList<Toy> toyList;
	
	/**
	Creates a new ToyList object and loads the toy data from the file.
	If the file does not exist, a new file will be created.
	@throws IOException if an error occurs while reading or writing to the file.
	*/
	public void main() throws IOException {	
	toyList = new ArrayList<>();

	File toyInfo = new File(FILE_PATH);
	String currLine;
	String[] toyData;
	int option;
	Scanner fileReader = new Scanner(toyInfo);  //USE FINALLY IN EXCEPTIONS TO CLOSE IT 
	
	if(toyInfo.exists()) {
		
		
		while(fileReader.hasNext()) {
			currLine = fileReader.nextLine();
			toyData = currLine.split(";");
			
			char toyLine = toyData[0].charAt(0);
			option = Character.getNumericValue(toyLine);			
		
				if(option == 0 || option==1 || option==2 || option==3 || option==4 || option==5 || option==6 || option==7 || option==8 || option==9) 
				
					switch (option) { 
					case 0: 
					case 1:
						Figure toyF = new Figure (toyData[0], toyData[1], toyData[2], toyData[3], Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]),toyData[6].charAt(0));
						toyList.add(toyF);
						break;
						
					case 2:
					case 3:
						Animal toyA = new Animal(toyData[0], toyData[1], toyData[2], toyData[3], Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]),toyData[6], toyData[7].charAt(0));
						toyList.add(toyA);
						break;
					case 4:
					case 5:
					case 6:
						Puzzle toyP= new Puzzle (toyData[0], toyData[1], toyData[2], toyData[3], Integer.parseInt(toyData[4]), Integer.parseInt(toyData[5]), toyData[6].charAt(0));
						toyList.add(toyP);
						break;
					case 7:
					case 8:
					case 9:
						String[] range = toyData[6].split("-");
						int min = Integer.parseInt(range[0]);
						int max = Integer.parseInt(range[1]);
												
						BoardGame toyBG= new BoardGame (toyData[0], toyData[1], toyData[2], toyData[3], Integer.parseInt(toyData[4]),Integer.parseInt(toyData[5]),min, max,toyData[7]);
						toyList.add(toyBG);
						break;
						
					}
			}
			}
	else {
		System.out.println("file does not exist");
		toyInfo.createNewFile();
		}
	fileReader.close();
	}
	
	/**

	Saves the toy data to a file.

	@throws FileNotFoundException if the file cannot be created or written to.
	*/
	public void saveFile() throws FileNotFoundException {
	File toyInfo = new File(FILE_PATH);
	PrintWriter pw = new PrintWriter(toyInfo);

	for(Toy toy: toyList) {
	pw.println(toy.formatData());
	}
	pw.close();
	}

	/**

	Gets the string representation of a toy with a specific serial number.
	@param sn the serial number of the toy to get the string representation of.
	*/
	public void getString(String sn) {
		toyList.toString(); //GET THE TO STRING FROM A CERTAIN SN 
	}
	
	
	/**

	Adds a figure toy to the inventory.
	@param toyF the figure toy to add.
	*/
	public void add(Figure toyF) {
		toyList.add(toyF);
	}
	/**

	Adds an animal toy to the inventory.
	@param toyA the animal toy to add.
	*/
	public void add(Animal toyA) {
		toyList.add(toyA);
	}
	/**

	Adds a puzzle toy to the inventory.
	@param toyP the puzzle toy to add.
	*/
	public void add(Puzzle toyP) {
		toyList.add(toyP);
	}
	/**

	Adds a board game toy to the inventory.
	@param toyBG the board game toy to add.
	*/
	public void add(BoardGame toyBG) {
		toyList.add(toyBG);
	}
	/**

	Gets the list of toys in the inventory.
	@return the list of toys in the inventory.
	*/
	public ArrayList<Toy> getList() {
		return toyList;
	}
	/**

	Removes a toy from the inventory.
	@param toy the toy to remove.
	*/
	public void remove(Toy toy) {
		toyList.remove(toy);
	}

}
	