package Exercise2Modified;

public class Main {

	public static void main(String[] args) {
		// create 4 different objects from Animal class
		Animal dog = new Animal(); 
		Animal cat = new Animal();
		Animal rabbit = new Animal();
		Animal hamster = new Animal();
		
		System.out.println("DOG PROPERTIES");
		dog.printProperties("Mimi", "Poodle", "Brown", 2);
		dog.likePlays("chase and retrieve");
		
		System.out.println();
		System.out.println("CAT PROPERTIES");
		cat.printProperties("Fluffy", "Persian", "Cooper", 1);
		cat.likePlays("squeaky toys");
		
		System.out.println();
		System.out.println("RABBIT PROPERTIES");
		rabbit.printProperties("Cutiee", "Belgian Hare", "Bright Hazel", 3);
		rabbit.likePlays("plastic toys");
		
		System.out.println();
		System.out.println("HAMSTER PROPERTIES");
		hamster.printProperties("Mickey", "Winter White", "Black", 1);
		hamster.likePlays("exercise wheels");
		
		System.out.println();
		dog.calMonthlyfoodcost("Mimi", 2, 15.60); //calculate monthly food expenses 
		System.out.println();
		cat.calGrooming("Fluffy", 2, 50);
	}
	

}
