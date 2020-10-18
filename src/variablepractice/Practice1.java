package variablepractice;

public class Practice1 {

	static String robot = "valume cleaner";            //this is to call robot=vacume cleaner in 
	//this is called level variable/global variable  	//both bedRoom and kitchen method
	
	public static void main(String[] args) {
		bedRoom();
		kitchen();
		
	}
	
	public static void bedRoom() {
		// method level variable / local variable
		String furniture = "Bed";
		System.out.println(furniture);
		System.out.println(robot);
		
	}

	public static void kitchen() {
		
		String over = "gas";
		System.out.println(over);
		System.out.println(robot);
		
	}
}
