package assignment_2;

/**
 *
 * @author Taylor Johnson
 * date - 10/17/17
 */
public class Movie implements Comparable<Movie>{
    private String movieName;
    private String movieRating;
    private int movieRuntime;
    private int movieReleaseYear;
    private String movieFormat;
    
    //Overloading of declaration methods
    /**
     * Creates a movie object
     * with default values.
     * 
     * Object has five properties:
     * String movieName = "", 
     * String movieRating = "NR",
     * int movieRuntime 0, 
     * int movieReleaseYear = 0,
     * String movieFormat = ""
     * 
     * @see Movie
     */
    public Movie()
    {
        movieName = "";
        movieRating = "NR";
        movieReleaseYear = 0000;
        movieRuntime = 0;
        movieFormat = "";
    }
    /**
     * Creates a movie object.
     * Object has five properties:
     * String movieName, 
     * String movieRating,
     * int movieRuntime, 
     * int movieReleaseYear,
     * String movieFormat
     * 
     * @see Movie
     * @param movieName Name of movie
     * @param movieRating Rating of movie Ex. PG, G, R
     * @param movieYear Year movie came out
     * @param movieRuntime Runtime of movie
     * @param movieFormat Format of movie Ex. DVD, VHS
     */
    public Movie(String movieName, String movieRating, int movieYear, int movieRuntime, String movieFormat)
    {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.movieReleaseYear = movieYear;
        this.movieRuntime = movieRuntime;
        this.movieFormat = movieFormat;
    }
    
    //overloading of get methods
    /**
     * Returns the name value
     * from a Movie object
     * 
     * @return movieName value
     * @see Movie
     */
    public String getMovieName()
    {
        return this.movieName;
    }
    /**
     * Returns the rating value
     * from a Movie object
     * 
     * @return movieRating
     * @see Movie
     */
    public String getMovieRating()
    {
        return this.movieRating;
    }
    /**
     * Returns the year value
     * from a Movie object
     * 
     * @return movieReleaseYear
     * @see Movie
     */
    public int getMovieReleaseYear()
    {
        return this.movieReleaseYear;
    }
    /**
     * Returns the runtime value
     * from a Movie object
     * 
     * @return movieRuntime
     * @see Movie
     */
    public int getMovieRuntime()
    {
        return this.movieRuntime;
    }
    /**
     * Returns the format value
     * from a Movie object
     * 
     * @return movieFormat
     * @see Movie
     */
    public String getMovieFormat()
    {
        return this.movieFormat;
    }
    
    //Overloading of set methods
    /**
     * Sets the name value
     * of a Movie object
     * 
     * @see Movie
     * @param newMovieName New name for movie
     */
    public void setMovieName(String newMovieName)
    {
        movieName = newMovieName;
    }
    /**
     * Sets the rating value
     * of a Movie object
     * 
     * @see Movie
     * @param newMovieRating New rating for movie
     */
    public void setMovieRating(String newMovieRating)
    {
        movieRating = newMovieRating;
    }
    /**
     * Sets the year value
     * of a Movie object
     * 
     * @see Movie
     * @param newMovieReleaseYear New release year for movie
     */
    public void setMovieReleaseYear(int newMovieReleaseYear)
    {
        movieReleaseYear = newMovieReleaseYear;
    }
    /**
     * Sets the runtime value
     * of a Movie object
     * 
     * @see Movie
     * @param newRuntime New runtime for movie
     */
    public void setMovieRuntime(int newRuntime)
    {
        movieRuntime = newRuntime;
    }
    /**
     * Sets the format value
     * of a Movie object
     * 
     * @see Movie
     * @param newMovieFormat New format for movie
     */
    public void setMovieFormat(String newMovieFormat)
    {
        movieFormat = newMovieFormat;
    }
    
    @Override
    public int compareTo(Movie other){
        return this.movieName.compareTo(other.getMovieName());
    }
}
