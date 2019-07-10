package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
public class MoviesOfThe70s implements MovieIterator{
    ArrayList<MovieInfo> bestMovies ;
    public MoviesOfThe70s(){
        bestMovies = new ArrayList<MovieInfo>();
        addMovie("The Godfather",1972);
        addMovie("Taxi Driver",1976);
        addMovie("One Flew Over The Cuckoo's Nest",1975);
        addMovie("Rocky" ,1976);


    }
    public void addMovie(String movieName ,int yearReleased ){
        MovieInfo movieInfo = new MovieInfo(movieName,yearReleased);
        bestMovies.add(movieInfo);
    }


    public Iterator createIterator(){
        return bestMovies.iterator();
    }
}
