package classComponents.constructor;

public class Movie {
    int movieId;
    String movieName;

    Movie(){
        movieId = 111111;
        movieName = "dummy";
    }

    public Movie(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public static void main(String[] args) {
        Movie m = new Movie();
        Movie movie = new Movie(101, "Lagan");
        System.out.println(movie.movieId + "\t" + movie.movieName);
    }
}
