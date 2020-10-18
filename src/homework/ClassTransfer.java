package homework;

public class ClassTransfer {
    public static void main(String[] args) {

        Movies.totalMovies();
        Movies.bestMovie("Avengers");
        Movies movies = new Movies();
        movies.bestMovie("Insidious", "2017");
        movies.bestMovie(8);
        Cars cars = new Cars();
        cars.bestCarEver();
        cars.bestCarEver(10);
        boolean answer = cars.bestCar();
        System.out.println("T or F: Tesla is the best car ever? "+answer);

    }
}
