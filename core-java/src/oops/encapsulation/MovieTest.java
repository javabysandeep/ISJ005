package oops.encapsulation;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie(1, "Dabang", "3 hours");
        System.out.println(movie.getMovieId());
        System.out.println(movie.getMovieName());
        System.out.println(movie.getMovieDuration());
    }
}
