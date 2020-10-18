package methodpractice;

public class House {

	public static void main(String[] args) { //main method because it is static
		
	// ClassName refVar = new ConstructorName();
		House refVar = new House();
		refVar.bedRoom();
	
		kitchen();

	}
	
	public void bedRoom() { //method, not main method
		System.out.println("1 Bed");
	}
	
	public static void kitchen() {
		System.out.println("1 Friege");
	}
}
