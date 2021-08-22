package com.company.DatabaseMovie;

public class Movie {
    int id;
    String name;
    String directorName;
    String description;
    int rating;
    int lengthMovie;

    @Override
    public String toString() {
       StringBuilder str=new StringBuilder();
       str.append("\nmovie name    = " + name + "\n director name = " + directorName + "\n description   = " + directorName + "\n movie rating  = " + rating + "\n movie length  = " + lengthMovie);
       return str.toString();
    }
}
