package LaptopSetterGetter;

public class Laptop {
	String brand;
	String display;
	int storage;
	String processor;
	double price;
	String username;
	//private double price;
	
	//create setter method
	// a method that updates value of a variable
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setDisplay(String display) {
		this.display = display;
	}
	
	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	/*public void setPrice(double p) {
		this.price = p;
	}*/
	
	// create getter method
	//a method that reads value of a variable
	public String getBrand() {
		return this.brand;
	}
	
	public String getDisplay() {
		return this.display;
	}
	
	public int getStorage() {
		return this.storage;
	}
	
	public String getProcessor() {
		return this.processor;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getUsername() {
		return this.username;
	}
	/*public double getPrice() {
		return this.price;
	}*/
	
}
