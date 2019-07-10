package IteratorPattern;

import java.util.Hashtable;
import java.util.Iterator;
public class MoviesOfThe90s implements MovieIterator{
    Hashtable<Integer, MovieInfo> bestMovies = new Hashtable<Integer, MovieInfo>();
    int hashKey = 0;
    public MoviesOfThe90s(){

        addMovie("Forrest Gump",1994);
        addMovie(" Pulp Fiction ",1994);
        addMovie("Fight Club",1999);
        addMovie(" Seven " ,1995);
        addMovie("The Shawshank Redemption", 1994);


    }
    public void addMovie(String movieName ,int yearReleased ){
        MovieInfo movieInfo = new MovieInfo(movieName,yearReleased);
        bestMovies.put(hashKey , movieInfo);
        hashKey++;
    }

       public Iterator createIterator(){
        return bestMovies.values().iterator();
    }
}
