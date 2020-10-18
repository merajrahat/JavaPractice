package methodpractice;

public class StaticNonStatic {
	
	//default Constructor - same name as the class name, no void/static
	public StaticNonStatic() {
		//this is by default. Wheater you create it or not, it is always there
	}

	public static void main(String[] args) { //this is main method
		 
		//object creation of the class
		StaticNonStatic refferenceVariable = new StaticNonStatic();
		//name Of The Class That we want to create obj  of--- referenceVariable Of The Class(=new) -- law nameOftheConstructor
		
		StaticNonStatic refVar = new StaticNonStatic();
		refferenceVariable.printMe(); // now it don't red underline anymore
		refVar.myCollege();
	}
	// if you don't use the keyword static - it becomes non static
	public void printMyName() { //this is not main method, just method
		System.out.println("Zann");
	}
	
	public void printMyAge() { //this is not main method, just method
		 //can go inside non-static method
		printMyName();
		System.out.println("00");
	}
		
	public void printMe() { //this is not main method, just method
		printMyAge();
		// can go inside non-static method
		printMyName();
	}
		
	public void myCollege() { //this is not main method, just method
	
		System.out.println("XYZ College");
	}
			
			
	// Static -- keyword which is used to access method
	//1. static method/variable - can go inside static method, can go inside non static method
	//2. non-static method/variable - can go inside non-static method only
	// if we still have to tkae non static methods, we should use Objects of the class
}
