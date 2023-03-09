package model;

public class Figure extends Toy {
	private String classification; //char?
	
	public Figure(String serialNum, String name, String brand, double price, int available, int age, String classification) {
		super(serialNum, name, brand, price, available, age);
		
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	@Override
	public String toString() {
		return "Category: Figure, " + "Serial Number: "+ serialNum+ ", Name: " + name + ", Brand: " + brand  + ", Price: " + price + ", Available Count: " + available + ", Age Appropriate: " + age + ", Classification: " + classification;
	}

}
