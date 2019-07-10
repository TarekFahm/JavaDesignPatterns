package IteratorPattern;

import java.util.Iterator;
public class CD {
    MovieIterator iter70sMovies;
    MovieIterator iter80sMovies;
    MovieIterator iter90sMovies;

     public CD(MovieIterator iter70sMovies, MovieIterator iter80sMovies, MovieIterator iter90sMovies) {
        this.iter70sMovies = iter70sMovies;
        this.iter80sMovies = iter80sMovies;
        this.iter90sMovies = iter90sMovies;
    }
    public void showMovies(){
       System.out.println("NEW WAY WITH ITERATOR\n");

       Iterator movies70s = iter70sMovies.createIterator();
       Iterator movies80s = iter80sMovies.createIterator();
       Iterator movies90s = iter90sMovies.createIterator();

       System.out.println("movies of the 70s\n");
       printTheMovies(movies70s);

       System.out.println("movies of the 80s\n");
       printTheMovies(movies80s);

       System.out.println("movies of the 90s\n");
       printTheMovies(movies90s);
   }
   public void printTheMovies(Iterator iterator){
        while (iterator.hasNext()){
            MovieInfo movieInfo = (MovieInfo) iterator.next();
            System.out.println(movieInfo.getMovieName());
            System.out.println(movieInfo.getYearReleased() + "\n");
        }
   }
}
