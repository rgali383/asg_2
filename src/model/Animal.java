package model;

public class Animal extends Toy {
	private String material;
	private String size; //Char?
	
	public Animal(String serialNum, String name, String brand, double price, int available, int age, String material, String size) {
		super(serialNum, name, brand, price, available, age);
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Category: Animal, " + "Serial Number: "+ serialNum+ ", Name: " + name + ", Brand: " + brand  + ", Price: " + price + ", Available Count: " + available + ", Age Appropriate: " + age+ ", Material: " + material+ ", Size: "+ size;
	}
}
