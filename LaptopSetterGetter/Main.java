package LaptopSetterGetter;

public class Main {

	public static void main(String[] args) {
		Laptop acer = new Laptop();
		
		acer.setModel("AN515");
		acer.setDisplay("Full HD");
		acer.setStorage(4);
		acer.setProcessor("Intel i5");
		acer.setPrice(3269.99);
		acer.setUsername("Guest");
		acer.setDeleting("File.txt");
		acer.setUpdating("intellij");
		acer.setEndTask("Chrome");
		//a.price = 10; // compile error, since price is private
		//double p = a.getPrice(); // same as above
		
		System.out.println("LAPTOP PROPERTIES");
		System.out.println("------------------------");
		System.out.println("Brand :" + acer.getModel());
		System.out.println("Display: " + acer.getDisplay());
		System.out.println("Storage: " + acer.getStorage() + "GB RAM");
		System.out.println("Processor: "+ acer.getProcessor());
		System.out.println("Price: RM " + acer.getPrice());
		System.out.println("------------------------");
		
		System.out.println("Username: " + acer.getUsername());
		System.out.println("\nDeleting " + acer.getDeleting() + "......");
		System.out.println("Updating " + acer.getUpdating() + "......");
		System.out.println("Which program to end? : " + acer.getEndTask() + "\n");
		acer.fullThrottle();
		

	}

}
