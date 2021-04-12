package LaptopSetterGetter;

public class Main {

	public static void main(String[] args) {
		Laptop a = new Laptop();
		
		a.setBrand("Acer");
		a.setDisplay("Full HD");
		a.setStorage(4);
		a.setProcessor("Intel i5");
		a.setPrice(3269.99);
		a.setUsername("Guest");
		//a.price = 10; // compile error, since price is private
		//double p = a.getPrice(); // same as above
		
		System.out.println("LAPTOP PROPERTIES");
		System.out.println("------------------------");
		System.out.println("Brand :" + a.getBrand());
		System.out.println("Display: " + a.getDisplay());
		System.out.println("Storage: " + a.getStorage() + "GB RAM");
		System.out.println("Processor: "+ a.getProcessor());
		System.out.println("Price: RM " + a.getPrice());
		System.out.println("------------------------");
		System.out.println("Username: " + a.getUsername());
		
		

	}

}
