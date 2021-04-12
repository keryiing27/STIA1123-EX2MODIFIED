package LaptopSetterGetter;

public class Laptop {
	String model;
	String display;
	int storage;
	String processor;
	double price;
	String username, deleting, updating, endTask;
	
	//private double price;
	
	//create setter method
	// a method that updates value of a variable
	public void setModel(String model) {
		this.model = model;
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
	
	public void setDeleting(String deleting) {
		this.deleting = deleting;
	}
	
	public void setUpdating(String updating) {
		this.updating = updating;
	}
	
	public void setEndTask(String endTask) {
		this.endTask = endTask;
	}
	/*public void setPrice(double p) {
		this.price = p;
	}*/
	
	// create getter method
	//a method that reads value of a variable
	public String getModel() {
		return this.model;
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
	public String getDeleting() {
		return this.deleting;
	}
	
	public String getUpdating() {
		return this.updating;
	}
	
	public String getEndTask() {
		return this.endTask;
	}
	/*public double getPrice() {
		return this.price;
	}*/
	
	//create fullThrottle()method for laptop
	public void fullThrottle() {
		System.out.println("The laptop is running selected Windows program with maximum speed!!!");
	}
}
