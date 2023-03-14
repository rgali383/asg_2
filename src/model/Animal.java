package model;
/**
The Animal class represents an animal toy that extends the Toy class.
It includes additional attributes such as the material of the toy and the size of the toy.
It includes a constructor that takes all the necessary parameters to create a new Animal object.
@param serialNum the serial number of the animal toy.
@param name the name of the animal toy.
@param brand the brand of the animal toy.
@param price the price of the animal toy.
@param available the available quantity of the animal toy.
@param age the minimum age requirement to play the animal toy.
@param material the material used to create the animal toy.
@param size the size of the animal toy (small, medium, or large).
*/

public class Animal extends Toy {
	/**
	 *the material used to create the animal toy.
=	 */
	private String material;
	/**
	 * the size of the animal toy (small, medium, or large).
	 */
	private char size; 
	
	/**
	Constructor for creating a Animal object.
	*/
	public Animal(String serialNum, String name, String brand, String price, int available, int age, String material, char size) {
		super(serialNum, name, brand, price, available, age);
		this.material=material;
		this.size=size;
		
	}
	/**

	Getter method for the material of the toy.
	@return the material of the Animal Toy
	*/
	public String getMaterial() {
		return material;
	}
	/**

	Setter method for the matterial of the toy.
	@param material the new material for the Animal Toy
	*/
	public void setMaterial(String material) {
		this.material = material;
	}
	/**

	Getter method for the size of the toy.
	@return the size of the Animal Toy
	*/
	public char getSize() {
		return size;
	}
	/**

	Setter method for the size of the toy.
	@param size the new size for the Animla Toy
	*/
	public void setSize(char size) {
		this.size = size;
	}
	/**

	Method for formatting the data of the toy. Each subclass of Toy will have its own implementation.
	@return a formatted string representation of the toy's data
	*/
	public String formatData() {
		return serialNum+';'+ name + ';' + brand + ';' + price + ';' + available + ';'+ age + ';' + material+";"+ size;
	}
	/**

	Method for returning a string representation of the toy. Each subclass of Toy will have its own implementation.
	@return a string representation of the toy
	*/
	@Override
	public String toString() {
		return "Category: Animal, " + "Serial Number: "+ serialNum+ ", Name: " + name + ", Brand: " + brand  + ", Price: " + price + ", Available Count: " + available + ", Age Appropriate: " + age+ ", Material: " + material+ ", Size: "+ size;
	}
}
