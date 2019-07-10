package IteratorPattern;

public class Computer {
    public static void main(String[] args) {
        MoviesOfThe70s moviesOfThe70s = new MoviesOfThe70s();
        MoviesOfThe80s moviesOfThe80s = new MoviesOfThe80s();
        MoviesOfThe90s moviesOfThe90s = new MoviesOfThe90s();

        CD cd = new CD(moviesOfThe70s,moviesOfThe80s,moviesOfThe90s);

        cd.showMovies();
    } }
