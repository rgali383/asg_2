package model;

/**
 * This superclass represents the common attributes for Toys in the database, including serial number, name, brand, price, availability, and age range.
*/

public abstract class Toy { 
		protected String serialNum;
		protected String name;
		protected String brand;
		protected String price;
		protected int available;
		protected int age;
		/**

		Constructor method for the Toy superclass, which sets the values for all of its attributes.
		@param serialNum the serial number of the toy
		@param name the name of the toy
		@param brand the brand of the toy
		@param price the price of the toy
		@param available the quantity of the toy available
		@param age the age range for the toy
		*/
		
		public Toy(String serialNum, String name, String brand, String price, int available, int age) {
		this.serialNum=serialNum;
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.available=available;
		this.age=age;
		}
		/**

		Getter method for the serial number of the toy.
		@return the serial number of the toy
		*/
		public String getSerialNum() {
		return serialNum;
		}
		/**

		Setter method for the serial number of the toy.
		@param serialNum the new serial number for the toy
		*/
		public void setSerialNum(String serialNum) {
			this.serialNum = serialNum;
		}
		/**
		 
		Getter method for the name of the toy.
		@return the name of the toy
		*/
		public String getName() {
		return name;
		}
		/**

		Setter method for the name of the toy.
		@param name the new name for the toy
		*/
		public void setName(String name) {
		this.name = name;
		}
		/**

		Getter method for the brand of the toy.
		@return the brand of the toy
		*/
		public String getBrand() {
		return brand;
		}
		/**

		Setter method for the brand of the toy.
		@param brand the new brand for the toy
		*/
		public void setBrand(String brand) {
		this.brand = brand;
		}
		/**

		Getter method for the price of the toy.
		@return the price of the toy
		*/
		public String getPrice() {
		return price;
		}
		/**
		Setter method for the price of the toy.
		@param price the new price for the toy
		*/
		public void setPrice(String price) {
		this.price = price;
		}
		/**

		Getter method for the quantity of the toy available.
		@return the quantity of the toy available
		*/
		public int getAvailable() {
		return available;
		}
		/**

		Setter method for the quantity of the toy available.
		@param available the new quantity of the toy available
		*/
		public void setAvailable(int available) {
		this.available = available;
		}
		/**

		Getter method for the age range of the toy.
		@return the age range of the toy
		*/
		public int getAge() {
		return age;
		}
		/**

		Setter method for the age range of the toy.
		@param age the new age range for the toy
		*/
		public void setAge(int age) {
		this.age = age;
		}

		/**

		Abstract method for formatting the data of the toy. Each subclass of Toy will have its own implementation.
		@return a formatted string representation of the toy's data
		*/
		public abstract String formatData();
		/**

		Abstract method for returning a string representation of the toy. Each subclass of Toy will have its own implementation.
		@return a string representation of the toy
		*/
		public abstract String toString();
		
	}


