package model;

/**
 * This superclass represent the 6 common sttributes for Toys in the Database
 */
public abstract class Toy { 
	//ABSTRACT 
		private int serialNum;
		private String name;
		private String brand;
		private double price;
		private int available;
		private int age;
		
		
		public Toy(int serialNum, String name, String brand, double price, int available, int age) {
		this.serialNum=serialNum;
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.available=available;
		this.age=age;
		}
		
		public int getSerialNum() {
			return serialNum;
		}

		public void setSerialNum(int serialNum) {
			this.serialNum = serialNum;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getAvailable() {
			return available;
		}

		public void setAvailable(int available) {
			this.available = available;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String formatData(){ //USED TO FORMAT THE WRITTEN DATA BACK "name,balance,numberOfWins"
			return serialNum+';'+ name + ';' + brand + ';' + price + ';' + available + ';'+ age + ';';
		}
		
		public String toString() {
			return "Serial Num: " + serialNum + "-Item Name: " + name + "-Brand: " + brand  + "-Price: " + price + "-Available Count: " + available + "-Age Rate: " + age;     
		}
		
	}


