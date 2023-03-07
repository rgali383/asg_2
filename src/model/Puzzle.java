package model;

public class Puzzle extends Toy {
	private String type;
		
	public Puzzle(int serialNum, String name, String brand, double price, int available, int age, String type) {
		super(serialNum, name, brand, price, available, age);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "puzzle- type: "+ type;
	}
}
