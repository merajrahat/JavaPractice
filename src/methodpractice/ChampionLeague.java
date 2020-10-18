package methodpractice;

public class ChampionLeague {

	public static void main(String[] args) {
		
		Barcelona bObject = new Barcelona();
		RMadrid rObject = new RMadrid();
		
		bObject.Fruit();
		bObject.Food();
		rObject.bestPlayer();
		rObject.printStadium();
		
		ChampionLeague H = new ChampionLeague();
		H.wordlXI();
	}

	public void wordlXI() {
		Barcelona barcelonaObject = new Barcelona();
		barcelonaObject.Food();
	}
	// static --> keyword
	// 1. static method/variable --> can go inside static method or non static method, 
	// if in the same class it can go directly , but if in different class we need to
	// specify name of the class. method name();
		
	// 2. non-static method/variable --> can go inside non-static method in the same class directly 
	// if we still have to call non static methods inside static, we should create Objects of the class
	// SamE CLASS OR DIFFERENT CLASS
}
