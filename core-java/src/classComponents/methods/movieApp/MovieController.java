package classComponents.methods.movieApp;

public class MovieController {
    MovieService movieService = new MovieService();
    public void addMovie(Movie movie) {
        movieService.addMovie(movie);
    }
}
