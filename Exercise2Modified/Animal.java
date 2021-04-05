package Exercise2Modified;

public class Animal {
	String name;
	String breed;
	String eyeColor;
	int age;
	String plays;
	double foodCost;
	int quantity;
	int groomTimes, expenses;
	
	void printProperties(String n, String b, String e, int a) {
		System.out.println("Name: " + n);
		System.out.println("Breed: " + b);
		System.out.println("Eye Color: " + e);
		System.out.println("Age: " + a + " years old");
		System.out.println("------------------");
		
	}
	
	void likePlays(String plys) {
		System.out.println("It likes to play: " + plys);
	}
	
	void calMonthlyfoodcost(String n, int q, double f ) {
		double t = q * f; // quantity * foodcost (e.g. price of a packet of dry food)
		System.out.println("Total Food Cost: " 
							+ "\n" + n + ": RM" + t);
	}
	
	void calGrooming(String n, int g, int exps) {
		int total = g * exps;
		System.out.println("Total Grooming Expenses: "
							+ "\n" + n + ": RM" + total);

	}
}
