package model;

public class Puzzle extends Toy {
	private String type;
		
	public Puzzle(String serialNum, String name, String brand, double price, int available, int age, String type) {
		super(serialNum, name, brand, price, available, age);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Serial Num: " + serialNum + "-Item Name: " + name + "-Brand: " + brand  + "-Price: " + price + "-Available Count: " + available + "-Age Rate: " + age + "puzzle- type: "+ type;
	}
}
