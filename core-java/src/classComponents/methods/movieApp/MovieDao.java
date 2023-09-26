package classComponents.methods.movieApp;

public class MovieDao {
    public void addMovie(Movie movie) {
        System.out.println("Movie added successfully. " +
                movie.movieId + "\t" + movie.movieName + "\t" + movie.movieDuration);
    }
}
