package com.company.DatabaseMovie;

import java.util.Scanner;

public class Service {
Database database=new Database();
Scanner scanner=new Scanner(System.in);
    int id;
    public  void create(MovieRequest movieRequest)
    {
        Movie movie=new Movie();
        id++;
        movie.id=id;
        movie.name= movieRequest.name;
        movie.directorName= movieRequest.directorName;
        movie.description= movieRequest.description;
        movie.rating= movieRequest.rating;
        movie.lengthMovie= movieRequest.lengthMovie;
        database.movieArrayList.add(movie);
        System.out.println(database.movieArrayList.toString());
    }

    public void readAll()
    {
        for (int i = 0; i < database.movieArrayList.size(); i++) {
            System.out.println(database.movieArrayList.get(i).name);
            System.out.println(database.movieArrayList.get(i).id);
        }
    }

    public void readById(int id)
    {
        System.out.println(getMov(id).toString());

    }

    public void update(int idUpdate)
    {
      readById(idUpdate);
        System.out.println("Choose 1 is UPDATE NAME");
        System.out.println("Choose 2 is UPDATE DIRECTOR NAME");
        System.out.println("Choose 3 is UPDATE DESCRIPTION");
        System.out.println("Choose 4 is UPDATE RATING");
        System.out.println("choose 0 to end");
        int choose= scanner.nextInt();
        while (choose!=0)
        {
            if (choose == 1) {
                getMov(idUpdate).name = scanner.next();
            } else if (choose == 2) {
                getMov(idUpdate).directorName = scanner.next();
            } else if (choose == 3) {
                getMov(idUpdate).description = scanner.next();
            } else if (choose == 4) {
                getMov(idUpdate).rating = scanner.nextInt();
            }
            choose= scanner.nextInt();
        }
        System.out.println(database.movieArrayList.toString());

    }

    public void delete(int id)
    {

    }
    public Movie getMov(int id)
    {
        for (int i = 0; i < database.movieArrayList.size(); i++) {
            if(database.movieArrayList.get(i).id==id)
            {
                return database.movieArrayList.get(i);
            }
        }
        return null;
    }
}
