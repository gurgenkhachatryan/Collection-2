package com.company;

import java.util.Scanner;

public class Service {
    int id;
    Database database=new Database();
    Scanner scanner=new Scanner(System.in);
    public void create(MovieRequest movieRequest)
    {
        Movies movies=new Movies();
        id++;
        movies.id=id;
        movies.name= movieRequest.name;
        movies.directorName= movieRequest.directorName;
        movies.description= movieRequest.description;
        movies.rating= movieRequest.rating;
        movies.lengthTime= movieRequest.lengthTime;
       // database.addArray();
        database.moviesArrayList.add(movies);
        System.out.println(database.moviesArrayList.get(0));
    }
    public void readAll() {
     //   Database database = new Database();
        for (int i = 0; i < database.moviesArrayList.size(); i++) {
            System.out.println(database.moviesArrayList.get(i).name);
            System.out.println(database.moviesArrayList.get(i).description);
        }

    }

    public void readById(int id) {
      //  Database database = new Database();
        for (int i = 0; i < database.moviesArrayList.size(); i++) {
            if (id == database.moviesArrayList.get(i).id) {
                System.out.println(database.moviesArrayList.get(i).toString());
                return;
            }

        }
        System.out.println("invalid id");

    }
    public void update(int idUpdate) {
  //      Database database = new Database();
        readById(idUpdate);
        System.out.println("Choose 1 is UPDATE NAME");
        System.out.println("Choose 2 is UPDATE DIRECTOR NAME");
        System.out.println("Choose 3 is UPDATE DESCRIPTION");
        System.out.println("Choose 4 is UPDATE RATING");
        //System.out.println("Choose 5 is UPDATE LANGTHTIME");

        int choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                getMov(idUpdate).name = scanner.nextLine();
                break;
            }
            case 2: {
                getMov(idUpdate).directorName = scanner.nextLine();
                break;
            }
            case 3: {
                getMov(idUpdate).description = scanner.nextLine();
                break;
            }
            case 4: {
                getMov(idUpdate).rating = scanner.nextInt();
                break;
            }

        }

    }

    public Movies getMov(int id) {
        Database database = new Database();
        for (int i = 0; i < database.moviesArrayList.size(); i++) {
            if (id == database.moviesArrayList.get(i).id) {
                return database.moviesArrayList.get(i);
            }
        }
        return null;

    }

}
