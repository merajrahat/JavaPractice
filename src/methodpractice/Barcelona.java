package methodpractice;

public class Barcelona {
	
	public Barcelona() { // don't need to add this. This is added by default
		
	}

	public static void main(String[] args) {
		
		
		Barcelona FoodName = new Barcelona(); //refVar can be any name, not just FoodName, but
		FoodName.Fruit();								 // in general we don't make it anything
		FoodName.Food();
	}
	
	public void Fruit() {
		System.out.println("Apple");
		
	}
	
	public void Food() {
		
		System.out.println("Pizza");
	}
	
	//create a static and non static methods and call both methods inside the main method
	
	// Static -- keyword which is used to access method
	//1. static method/variable - can go inside static method, can go inside non static method
	//If in the same class it ca go directly, but if in different class we need to 
	//specify name of the class. method name();
	//2. non-static method/variable - can go inside non-static method only
	// if we still have to tkae non static methods, we should use Objects of the class
	
}
