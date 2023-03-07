package model;

public class Figure extends Toy {
	private String classification; //char?
	
	public Figure(int serialNum, String name, String brand, double price, int available, int age, String classification) {
		super(serialNum, name, brand, price, available, age);
		
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public String toString() {
		return "class: " + classification;
	}

}
