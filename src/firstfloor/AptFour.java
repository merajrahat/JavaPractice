package firstfloor;

public class AptFour {
	
	
	public static void main(String[] args) {
		
		System.out.println("Bed");    //JAVA only print main method, and you can only have
									  //one main method
		
		kitchen();		//wiht this code will include kitchen and livingRoom
		livingRoom();
		
				
	}

	public static void kitchen () {
		System.out.println("Fridge");  //this is not main method
	}
	
	public static void livingRoom () {
		System.out.println("TV");     //this is not main method
	}
	
}
