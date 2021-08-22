package com.company;

public class Movies {
    int id;
    String name;
    String directorName;
    String description;
    int rating;
    int lengthTime;

    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();
        str.append(" id =" + id + "\n name=" + name + " \n directorName = " + directorName + "\n description =" + description + " \n rating= " + rating + "\n lengthTime=" + lengthTime + "\n");
        return str.toString();
    }
}
