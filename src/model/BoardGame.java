package model;

public class BoardGame extends Toy {
	private int range;
	private String designers;
	
	public BoardGame(String serialNum, String name, String brand, double price, int available, int age, int range, String designers) {
		super(serialNum, name, brand, price, available, age);
	}
	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getDesigners() {
		return designers;
	}

	public void setDesigners(String designers) {
		this.designers = designers;
	}
	
	@Override
	public String toString() {
		return "Serial Num: " + serialNum + "-Item Name: " + name + "-Brand: " + brand  + "-Price: " + price + "-Available Count: " + available + "-Age Rate: " + age + "range: " + range + "designer(s): "+ designers;
	}

}
