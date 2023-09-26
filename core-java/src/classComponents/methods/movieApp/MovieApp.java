package classComponents.methods.movieApp;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the movie id");
        movie.movieId = scanner.nextInt();

        System.out.println("Enter the movie name");
        movie.movieName = scanner.nextLine();

        System.out.println("Enter the movie duration");
        movie.movieDuration = scanner.nextLine();

        MovieController movieController = new MovieController();
        movieController.addMovie(movie);

    }
}
