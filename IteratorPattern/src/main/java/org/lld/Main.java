package org.lld;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MovieCollection mc = new MovieCollection();
        BookCollection bc = new BookCollection();

        Movie movie = new Movie("RRR", 3);
        mc.addMovie(movie);
        movie = new Movie("Avengers1", 2);
        mc.addMovie(movie);

        bc.addBook(new Book("Harry Potter", 100));
        bc.addBook(new Book("Jungle Book", 200));

        Iterator<Book> bookIterator = bc.iterator();
        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            System.out.println(book.name + " has " + book.pages + " pages ");
        }

        Iterator<Movie> movieIterator = mc.iterator();
        while (movieIterator.hasNext()) {
            Movie m = movieIterator.next();
            System.out.println(m.getMovieName() + " is " + m.getDuration() + " hours long.");
        }
    }
}