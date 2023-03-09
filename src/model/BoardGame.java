package model;

public class BoardGame extends Toy {
	private int maxPlayers;
	private int minPlayers;
	private String designers;
	
	public BoardGame(String serialNum, String name, String brand, double price, int available, int age, int minPlayers, int maxPlayer , String designers) {
		super(serialNum, name, brand, price, available, age);
	}
	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public int getMinPlayers() {
		return minPlayers;
	}

	public void setMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
	}

	public String getDesigners() {
		return designers;
	}

	public void setDesigners(String designers) {
		this.designers = designers;
	}
	
	@Override
	public String toString() {
		return "Category: BoardGame, " + "Serial Number: "+ serialNum+ ", Name: " + name + ", Brand: " + brand  + ", Price: " + price + ", Available Count: " + available + ", Age Appropriate: " + age + ", Num Of Players: " +minPlayers+"-"+maxPlayers + ", Designer(s): "+ designers;
	}
}
