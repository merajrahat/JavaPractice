package homework;

public class Movies { //parameterization of methods

    public static void main(String[] args){
        totalMovies();
        bestMovie("Avengers");
        Movies movies = new Movies();
        movies.bestMovie("Insidious", "2017");
        movies.bestMovie(8);


    }
    public static void totalMovies(){
        System.out.println("Total movies: "+2);
    }

    public static void bestMovie(String nameOfMovie){
        System.out.println("Best Action Movie: "+nameOfMovie);

    }
    public void bestMovie(String nameOfMovie, String year){
        System.out.println("Best Horror Movie: "+nameOfMovie+" "+year);
    }
    public void bestMovie(int String){
        int bestMovie = 8;
        int totalRate = bestMovie + String;
        System.out.println("Both Movie Rate: "+totalRate);
    }

}
