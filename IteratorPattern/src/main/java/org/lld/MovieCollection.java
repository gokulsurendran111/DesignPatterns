package org.lld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieCollection {
    List<Movie> movies;

    public MovieCollection() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public Iterator<Movie> iterator() {
        return new MovieIterator(movies).iterator();
    }

    class MovieIterator implements Iterator<Movie> {

        List<Movie> movies;

        public MovieIterator(List<Movie> movies) {
            this.movies = movies;
        }

        public Iterator<Movie> iterator() {
            return movies.iterator();
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Movie next() {
            return null;
        }
    }
}
