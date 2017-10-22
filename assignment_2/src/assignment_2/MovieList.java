package assignment_2;

import java.util.Arrays;

/**
 *
 * @author Taylor Johnson
 * date - 10/17/17
 * reference Mathew Nyamagwa
 * 
 * Code copied and modified from
 * Mathew Nyamagwa is marked with
 * a ref Mathew N.
 * 
 * Specific reference is Example_1
 */
public class MovieList implements Cloneable{
    private Movie[] movie;
    private int numOfMovies = 0;
    private int movieArrayIndex = 0;
    
    /**
     * Creates a MovieList object
     * with default values.
     * 
     * Object has three properties:
     * Movie[] movie = Movie[10]
     * int numOfMovies = 0
     * int movieArrayIndex = 0
     * 
     * Ref Mathew N - Example_1.
     * 
     * @see MovieList
     * @see Movie
     */
    public MovieList() {
        movie = new Movie[10];
        
        //instantiates each index
        for(int index = 0; index < movie.length; index++) {
            movie[index] = new Movie("Use Add Movie, not update", null, 0, 0, null);
        }
    }
    
    /**
     * Creates a MovieList object.
     * 
     * Object has three properties:
     * Movie[] movie
     * int numOfMovies = 0
     * int movieArrayIndex = 0
     * 
     * Ref Mathew N - Example_1.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param initialListCapacity Capacity of movieList
     */
    public MovieList(int initialListCapacity) {

        movie = new Movie[initialListCapacity];	
        
        //instantiates each index
        for(int index = 0; index < movie.length; index++) {
            movie[index] = new Movie("Use Add Movie, not update", null, 0, 0, null);
        }
    }
    
    /**
     * Creates a movie object within
     * the movieList object.
     * 
     * Ref Mathew N - Example_1.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param name Name for Movie name
     * @param rating Rating for Movie rating
     * @param year Year for Movie year
     * @param runtime Runtime for Movie runtime
     * @param format Format for Movie format
     */
    public void createMovie(String name, String rating, int year, int runtime, String format) {
        movie[movieArrayIndex].setMovieName(name);
        movie[movieArrayIndex].setMovieRating(rating);
        movie[movieArrayIndex].setMovieReleaseYear(year);
        movie[movieArrayIndex].setMovieRuntime(runtime);
        movie[movieArrayIndex].setMovieFormat(format);

        numOfMovies++;
        movieArrayIndex++;
    }
    
    /**
     * Returns a boolean depending upon
     * the success of updating a Movie
     * object with the MovieList. Otherwise
     * returns false.
     * 
     * Ref Mathew N - Example_1.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param name Updated name for Movie name
     * @param rating Updated rating for Movie rating
     * @param year Updated year for Movie year
     * @param runtime Updated runtime for Movie runtime
     * @param format Updated format for Movie format
     * @return editted boolean
     */
    public boolean updateMovie(String name, String rating, int year, int runtime, String format) {
        boolean editted = false;
        int index = -1;

        if(numOfMovies > 0) {
            index = findMovie(name);

            if(index >= 0)
                editted = true;
        }
        
        if(name != null)
                movie[index].setMovieName(name);

        if(rating != null)
                movie[index].setMovieRating(rating);

        if(year > 0)
                movie[index].setMovieReleaseYear(year);
        
        if(runtime > 0)
                movie[index].setMovieRuntime(runtime);

        if(format != null)
                movie[index].setMovieFormat(format);

        return editted;
    }
    
    /**
     * Returns a boolean depedning
     * upon the success of deleting
     * a Movie object from the
     * MovieList. Otherwise returns
     * false.
     * 
     * Ref Mathew N - Example_1.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param name Name of Movie name to search
     * @return removed boolean
     */
    public boolean deleteMovie(String name) {
        boolean removed = false;
        int index = -1;

        if(numOfMovies > 0) {		
            index = findMovie(name);

            if(index >= 0) {
                movie[index] = movie[movieArrayIndex - 1];

                movieArrayIndex--;
                numOfMovies--;
                removed = true;
            }
        }
        return removed;
    }
    
    /**
     * Returns the index of a movie
     * if the name provided matches
     * that of the MovieName property
     * from a Movie object in the 
     * MovieList object. Otherwise, 
     * returns -1;
     * 
     * Ref Mathew N - Example_1.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param name Name of Movie name to search
     * @return index or -1
     */
    public int findMovie(String name) {
        int index;

        for(index = 0; index < numOfMovies; index++) {
            if(name.equalsIgnoreCase(movie[index].getMovieName()))
                return index;
        }
        return -1;
    }
    
    /**
     * Returns the length of
     * the MovieList object.
     * 
     * Ref Mathew N - Example_1.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @return Length of MovieList
     */
    public int getCapacity() {
        return movie.length;
    }

    /**
     * Returns the current
     * size of the MovieList object.
     * 
     * Ref Mathew N - Example_1.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @return Size of MovieList
     */
    public int getSize() {
        return numOfMovies;
    }
    
    /**
     * Returns a String consisting of the 
     * MovieList Movie value titles on 
     * the first row and the MovieList 
     * Movie values on each subsequent line.
     * 
     * Ref Mathew N - Example_1.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @return log
     */
    public String printMovieList() {
        String log;
        log = String.format("MOVIE_NAME%1$-25s\tRATING%1$-15s\tYEAR%1$-15s\tRUNTIME%1$-15s\tFORMAT%1$-15s\n\r", "");
        
        for(int index = 0; index < numOfMovies; index++) {
            String add = String.format(movie[index].getMovieName() + "%1$-15s\t"
                    + movie[index].getMovieRating() + "%1$-15s\t"
                    + movie[index].getMovieReleaseYear() + "%1$-15s\t"
                    + movie[index].getMovieRuntime() + "%1$-15s\t"
                    + movie[index].getMovieFormat() + "%1$-15s\n", "");
            log += add;
        }
        return log;
    }
    
    /**
     * Returns a String consisting of the 
     * MovieList Movie value titles on 
     * the first row and the specified MovieList 
     * Movie values on the next line.
     * 
     * Ref Mathew N - Example_1.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param title Name of Movie name to search for
     * @return log
     */
    public String printMovie(String title) {
        int index = findMovie(title);
        String log;
        
        if(index >= 0) {
            log = String.format("MOVIE_NAME%1$-15s\tRATING%1$-15s\tYEAR%1$-15s\tRUNTIME%1$-15s\tFORMAT%1$-15s\n\r", "");

            log += String.format(movie[index].getMovieName() + "%1$-15s\t"
                    + movie[index].getMovieRating() + "%1$-15s\t"
                    + movie[index].getMovieReleaseYear() + "%1$-15s\t"
                    + movie[index].getMovieRuntime() + "%1$-15s\t"
                    + movie[index].getMovieFormat() + "%1$-15s\n", "");
        }
        else
            log = "Movie with name: " + title + " Not found!";
        
        return log;
    }
    
    //overloading of get methods for individual movies
    /**
     * Returns the MovieName value
     * from the Movie object within
     * the MovieList object.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param index Index of MovieList object to get name of
     * @return MovieList Movie name
     */
    public String getMovieListMovieName(int index) {
        return movie[index].getMovieName();
    }
    /**
     * Returns the MovieRating value
     * from the Movie object within
     * the MovieList object.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param index Index of MovieList object to get rating of
     * @return MovieList Movie rating
     */
    public String getMovieListMovieRating(int index) {
        return movie[index].getMovieRating();
    }
    /**
     * Returns the MovieReleaseYear value
     * from the Movie object within
     * the MovieList object.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param index Index of MovieList object to get release year of
     * @return MovieList Movie release year
     */
    public int getMovieListMovieReleaseYear(int index) {
        return movie[index].getMovieReleaseYear();
    }
    /**
     * Returns the MovieRuntime value
     * from the Movie object within
     * the MovieList object.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param index Index of MovieList object to get runtime of
     * @return MovieList Movie runtime
     */
    public int getMovieListMovieRuntime(int index) {
        return movie[index].getMovieRuntime();
    }
    /**
     * Returns the MovieFormat value
     * from the Movie object within
     * the MovieList object.
     * 
     * @see MovieList
     * @see Movie
     * 
     * @param index Index of MovieList object to get format of
     * @return MovieList Movie format
     */
    public String getMovieListMovieFormat(int index) {
        return movie[index].getMovieFormat();
    }
    
    //testing
    public void sortByName() {
        Arrays.sort(movie);
    }
    
    
    @Override
    public MovieList clone() {	
        try {
            MovieList copy = (MovieList) super.clone();
            copy.movie = movie.clone();
            return copy;
        } 
        catch (CloneNotSupportedException e) {
            throw new RuntimeException("This class does not implement Clonable");
        }
    }
    
}
