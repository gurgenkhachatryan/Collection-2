package com.company;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Service service = new Service();

    public void command() {
        System.out.println("Choose 1 is CREATE");
        System.out.println("Choose 2 is READ ALL");
        System.out.println("Choose 3 is READ ByID");
        System.out.println("Choose 4 is UPDATE");
        System.out.println("Choose 5 is Delete");

        int choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                create();
                break;
            }
            case 2: {
                readAll();
                break;
            }
            case 3: {
                System.out.println("enter movie ID");
                int idRead = scanner.nextInt();
                readById(idRead);
                break;

            }
            case 4: {
                System.out.println("enter movie ID");
                int idUpdate = scanner.nextInt();
                break;
            }
        }


    }

    public void create() {
        MovieRequest movieRequest = new MovieRequest();
        //  System.out.println("movieRequest.id="+ movieRequest.id);
        System.out.println();
        System.out.print("enter  movie name :  ");
        movieRequest.name = scanner.next();
        System.out.println();
        System.out.print("enter movie director name :  ");
        movieRequest.directorName = scanner.next();
        System.out.println();
        System.out.print("enter movie description :  ");
        movieRequest.description = scanner.next();
        System.out.println();
        System.out.print("enter movie rating :  ");
        movieRequest.rating = scanner.nextInt();
        System.out.println();
        System.out.print("enter movie length time :  ");
        movieRequest.lengthTime = scanner.nextInt();

        service.create(movieRequest);

    }

    public void readAll() {
        service.readAll();

    }

    public void readById(int id) {
        service.readById(id);

    }

    public void update(int idUpdate) {
        service.update(idUpdate);

    }

    public void getMov(int id) {
        service.getMov(id);
    }
}