package variablepractice;

public class Olympic {
	// static --> keyword
	// 1. static method/variable --> can go inside static method or non static method, 
	// if in the same class it can go directly , but if in different class we need to
// specify name of the class. method/variable name;

	// 2. non-static method/variable --> can go inside non-static method in the same class directly 
	// if we still have to call non static methods/variables inside static method, we should create Objects of the class
	// SamE CLASS OR DIFFERENT CLASS
	
	public static void main(String [] args) {
		
		String a ="USA";
		 String b = "2019";
	System.out.print(a+" "+b);	 
	}
}
