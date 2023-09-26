package classComponents.methods.movieApp;

public class MovieService {
    MovieDao movieDao = new MovieDao();

    public void addMovie(Movie movie) {
        movieDao.addMovie(movie);
    }
}
