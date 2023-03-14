package model;
/**
The Puzzle class represents a puzzle toy that extends the Toy class.
It includes an additional attribute that represents the type of puzzle.
It includes a constructor that takes all the necessary parameters to create a new Puzzle object.
@param serialNum the serial number of the puzzle toy.
@param name the name of the puzzle toy.
@param brand the brand of the puzzle toy.
@param price the price of the puzzle toy.
@param available the available quantity of the puzzle toy.
@param age the minimum age requirement to play the puzzle toy.
@param type the type of puzzle toy.
*/

public class Puzzle extends Toy {
	/**
	 * the type of puzzle toy.
	 */
	private char type;
	/**
	Constructor for creating a Puzzle object.
	*/
	public Puzzle(String serialNum, String name, String brand, String price, int available, int age, char type) {
		super(serialNum, name, brand, price, available, age);
		this.type=type;
	}
	/**

	Getter method for the type of the toy.
	@return the type of Puzzle Toy
	*/
	public char getType() {
		return type;
	}
	/**

	Setter method for the type of the toy.
	@param type the new type of the Puzzle Toy
	*/
	public void setType(char type) {
		this.type = type;
	}
	/**

	Method for formatting the data of the toy. Each subclass of Toy will have its own implementation.
	@return a formatted string representation of the toy's data
	*/
	public String formatData() {
		return serialNum+';'+ name + ';' + brand + ';' + price + ';' + available + ';'+ age + ';' + type;
	}
	/**

	Method for returning a string representation of the toy. Each subclass of Toy will have its own implementation.
	@return a string representation of the toy
	*/
	@Override
	public String toString() {
		return "Category: Puzzle, " + "Serial Number: "+ serialNum+ ", Name: " + name + ", Brand: " + brand  + ", Price: " + price + ", Available Count: " + available + ", Age Appropriate: " + age+ ", Puzzle- type: "+ type;
	}
}
