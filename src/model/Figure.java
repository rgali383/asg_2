package model;
/**
The Figure class represents a figure toy that extends the Toy class.
It includes an additional attribute that represents the classification of the figure.
It includes a constructor that takes all the necessary parameters to create a new Figure object.
@param serialNum the serial number of the figure toy.
@param name the name of the figure toy.
@param brand the brand of the figure toy.
@param price the price of the figure toy.
@param available the available quantity of the figure toy.
@param age the minimum age requirement to play the figure toy.
@param classification the classification of the figure toy (e.g. action, superhero, etc.).
*/


public class Figure extends Toy {
	/**
	 * the classification of the figure toy (e.g. action, superhero, etc.)
	 */
	private char classification; 
	/**
	Constructor for creating a Figure object.
	*/
	public Figure(String serialNum, String name, String brand, String price, int available, int age, char classification) {
		super(serialNum, name, brand, price, available, age);
		this.classification=classification;
	}
	/**

	Getter method for the classification of the toy.
	@return the classification of the Figure Toy 
	*/
	public char getClassification() {
		return classification;
	}
	/**

	Setter method for the classification of the toy.
	@param classification the new classification for the Figure Toy
	*/
	public void setClassification(char classification) {
		this.classification = classification;
	}
	/**

	Method for formatting the data of the toy. Each subclass of Toy will have its own implementation.
	@return a formatted string representation of the toy's data
	*/
	@Override
	public String formatData() {
	return serialNum+';'+ name + ';' + brand + ';' + price + ';' + available + ';'+ age + ';' + classification;
	}
	/**

	Method for returning a string representation of the toy. Each subclass of Toy will have its own implementation.
	@return a string representation of the toy
	*/
	@Override
	public String toString() {
		return "Category: Figure, " + "Serial Number: "+ serialNum+ ", Name: " + name + ", Brand: " + brand  + ", Price: " + price + ", Available Count: " + available + ", Age Appropriate: " + age + ", Classification: " + classification;
	}

}
