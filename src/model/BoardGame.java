package model;
/**
The BoardGame class represents a board game toy that extends the Toy class.
It includes additional attributes such as minimum and maximum players and the designers of the game.
It includes a constructor that takes all the necessary parameters to create a new BoardGame object.
@param serialNum the serial number of the board game toy.
@param name the name of the board game toy.
@param brand the brand of the board game toy.
@param price the price of the board game toy.
@param available the available quantity of the board game toy.
@param age the minimum age requirement to play the board game toy.
@param minPlayers the minimum number of players for the board game toy.
@param maxPlayers the maximum number of players for the board game toy.
@param designers the name of the designers of the board game toy.
*/
public class BoardGame extends Toy {
	/**
	 * the minimum number of players for the board game toy.
	 */
	private int minPlayers;
	/**
	 * the maximum number of players for the board game toy.
	 */
	private int maxPlayers;
	/**
	 * the name of the designers of the board game toy.
	 */
	private String designers;
	/**
	Constructor for creating a BoardGame object.
	*/
	public BoardGame(String serialNum, String name, String brand, String price, int available, int age, int minPlayers, int maxPlayers , String designers) {
		super(serialNum, name, brand, price, available, age);
		this.minPlayers=minPlayers;
		this.maxPlayers=maxPlayers;
		this.designers=designers;
	}
	/**

	Getter method for the minimum amount of players of the toy.
	@return the minPlayers of the Board Game Toy
	*/
	public int getMinPlayers() {
		return minPlayers;
	}
	/**

	Setter method for the minimum amount of players of the toy.
	@param minPlayers the new minimum amount of players for the Board Game Toy
	*/
	public void setMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
	}
	/**

	Getter method for the maximum amount of players of the toy.
	@return the maxPlayers of the Board Game Toy
	*/
	public int getMaxPlayers() {
		return maxPlayers;
	}
	/**

	Setter method for the maximum amount of players of the toy.
	@param maxPlayers the new maximum amount of players for the Board Game Toy
	*/
	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}
	/**

	Getter method for the designer of players of the toy.
	@return the designers of the Board Game Toy
	*/
	public String getDesigners() {
		return designers;
	}
	/**

	Setter method for the designers of players of the toy.
	@param designers the new designer for the Board Game Toy
	*/
	public void setDesigners(String designers) {
		this.designers = designers;
	}
	
	/**

	Method for formatting the data of the toy. Each subclass of Toy will have its own implementation.
	@return a formatted string representation of the toy's data
	*/
	public String formatData() {
		return serialNum+';'+ name + ';' + brand + ';' + price + ';' + available + ';'+ age + ';' + minPlayers+"-"+maxPlayers+";"+ designers;
	}
	/**

	Method for returning a string representation of the toy. Each subclass of Toy will have its own implementation.
	@return a string representation of the toy
	*/
	@Override
	public String toString() {
		return "Category: BoardGame, " + "Serial Number: "+ serialNum+ ", Name: " + name + ", Brand: " + brand  + ", Price: " + price + ", Available Count: " + available + ", Age Appropriate: " + age + ", Num Of Players: " +minPlayers+"-"+maxPlayers + ", Designer(s): "+ designers;
	}
}
