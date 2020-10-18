package homework;

public class Cars {
    public static void main(String[] args) {  //parameterization of methods

        Cars cars = new Cars();
        cars.bestCarEver();
        cars.bestCarEver(10);
        boolean answer = cars.bestCar();
        System.out.println("T or F: Tesla is the best car ever? "+answer);
    }

    public void bestCarEver(){
        System.out.println("Best Car: Tesla");

    }
    public void bestCarEver(int rate){
        System.out.println("Tesla is rated: "+rate+" out of 10");
    }

    public boolean bestCar(){

        return true;
    }
}
