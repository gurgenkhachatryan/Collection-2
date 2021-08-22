package com.company.DatabaseMovie;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
Service service=new Service();
    public void command() {
        System.out.println("Choose 1  to Create");
        System.out.println("Choose 2  to ReadAll");
        System.out.println("Choose 3  to ReadById");
        System.out.println("Choose 4  to Update");
        System.out.println("Choose 5  to Delete");
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
                System.out.println("enter movie id  to read");
                int readId= scanner.nextInt();
                readById(readId);
                break;
            }
            case 4: {
                System.out.println("enter movie id to update");
                int updateId= scanner.nextInt();
                update(updateId);
                break;
            }
            case 5: {
                System.out.println("enter movie id to delete");
                int deleteId= scanner.nextInt();
                delete(deleteId);
                break;
            }
        }

    }

    public void create() {
        MovieRequest movieRequest=new MovieRequest();
        System.out.print("enter movie name :  ");
        movieRequest.name= scanner.next();
        System.out.print("enter movie director name :  ");
        movieRequest.directorName= scanner.next();
        System.out.print("enter movie description :  ");
        movieRequest.description= scanner.next();
        System.out.print("enter movie rating :  ");
        movieRequest.rating= scanner.nextInt();
        System.out.print("enter movie length :  ");
        movieRequest.lengthMovie= scanner.nextInt();
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

    public void delete(int id) {
service.delete(id);
    }
    public Movie getMov(int id)
    {
return  service.getMov(id);

    }

}
