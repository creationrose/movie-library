import java.util.ArrayList;

/**
 * A class to hold movies
 * 
 * @author Jessica Hori 
 * @version 2015.11.01
 */
public class MovieLibrary
{
    // ArrayList will store the name of movies
    private ArrayList<Movie> movies;
    private Movie movie;

    /**
     * Creates a MovieLibrary
     */
    public MovieLibrary()
    {
        movies = new ArrayList<Movie>();
    }

    /**
     * Add a new movie to the collection
     */
    public void addMovie(String title, int runLength)
    {
        movie = new Movie(title, runLength);
        movies.add(movie);
    }
    
    /**
     * Add existing movies to the collection
     */
    
    public void addMovie(Movie movie)
    {
        movies.add(movie);
    }

    /**
     * Print information on movies
     */
    public void printMovie()
    {
        if(movies.size() == 0) {
            System.out.println("#################");
            System.out.println("No movies in the library");
            System.out.println("#################");
        }
        else {
            for (Movie movie : movies){
                movie.printMovieInfo();
            }
        }
    }
}
