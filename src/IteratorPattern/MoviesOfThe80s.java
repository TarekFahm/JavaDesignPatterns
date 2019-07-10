package IteratorPattern;

import java.util.Arrays;
import java.util.Iterator;
public class MoviesOfThe80s implements MovieIterator{
    MovieInfo[] bestMovies ;
    int arrayValue =0;
    public MoviesOfThe80s(){
        bestMovies = new MovieInfo[4];
        addMovie("The Shining",1980);
        addMovie(" A Short Film About Love",1988);
        addMovie("Blade Runner",1982);
        addMovie(" Back to the Future " ,1985);


    }
    public void addMovie(String movieName ,int yearReleased ){
        MovieInfo movieInfo = new MovieInfo(movieName,yearReleased);
        bestMovies[arrayValue] = movieInfo;
        arrayValue++;
    }



    public Iterator createIterator(){
        return Arrays.asList(bestMovies).iterator();
    }
}
