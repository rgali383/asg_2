package model;

public class BoardGame extends Toy {
	private int range;
	private String designers;
	
	public BoardGame(int serialNum, String name, String brand, double price, int available, int age, int range, String designers) {
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
	
	public String toString() {
		return "range: " + range + "designer(s): "+ designers;
	}

}
