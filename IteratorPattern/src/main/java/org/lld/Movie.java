package org.lld;

public class Movie {
    private String movieName;
    private int duration;

    public Movie(String movieName, int duration) {
        this.movieName = movieName;
        this.duration = duration;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getDuration() {
        return duration;
    }
}
