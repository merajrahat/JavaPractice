package methodpractice;

public class RMadrid {

	public static void main(String[] args) {
		printStadium();
		
		RMadrid refVar = new RMadrid();
		refVar.bestPlayer();
			
     // create a static and a non static method 
	// and call the both methods inside the main method
	}

	public void bestPlayer() {
		System.out.println("K Benzama");
	}
	
	public static void printStadium() {
		System.out.println("Bernabeu");
	}
	
	public void topXI() {
		bestPlayer();
	}
	
}
