package IteratorPattern;

public class MovieInfo {
    String movieName;
    int yearReleased;

    public MovieInfo(String movieName, int yearReleased) {
        this.movieName = movieName;
        this.yearReleased = yearReleased;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getYearReleased() {
        return yearReleased;
    }
}
