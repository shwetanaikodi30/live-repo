package com.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{

    Scanner sc = new Scanner(System.in, "UTF-8");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    public static void main( String[] args ) {

        App newapp = new App();
        newapp.Menu();

    }

    private void Menu(){

        System.out.println("\n1. List All Actors.");
        System.out.println("2. List by ID or First Name");
        System.out.println("3. Add Actor.");
        System.out.println("4. Update Actor.");
        System.out.println("5. Delete Actor.\n");

        int option = sc.nextInt();

        switch (option){
            case 1:
                listActorDetails();
                break;
            case 2:
                listActorDetail();
                break;
            case 3:
                addActor();
                break;
            case 4:
                updateActor();
                break;
            case 5:
                deleteActor();
                break;
            default:
                System.out.println("\nOnly Select given option");
                Menu();
        }
    }


    private void listActorDetails(){
        Actor[] actors = ActorService.listAll();
        System.out.println("\nActor ID  |  First Name  | Last Name  |  Last Update");
        for (Actor actor : actors){
            System.out.println(actor.toString());
        }
        Menu();
    }

    private void listActorDetail(){

        System.out.println("1. List by ID");
        System.out.println("2. List by First Name");

        int listBy = sc.nextInt();

        if(listBy == 1){
            System.out.print("\nEnter Actor ID: ");
            int actorId = sc.nextInt();
            try{
                Actor actor = ActorService.listById(actorId);
                System.out.println("\n"+actor.toString());
            } catch(ActorNotFoundException actorNotFoundException){
               String message = actorNotFoundException.getMessage();
               System.out.println(message);
            }

            Menu();
        }
        else if ( listBy == 2){
            System.out.print("\nEnter Actor First Name: ");
            sc.nextLine();
            String firstName =  sc.nextLine();
            try{
                Actor actor = ActorService.findByFirstName(firstName);
                System.out.println("\n"+actor.toString());
            }
            catch(NullPointerException nullPointerException){
                System.out.println("Actor not found for Name :" + firstName);
            }
            Menu();

        }

    }

    private void addActor(){

        sc.nextLine();
        System.out.print("First Name: ");
        String firstName =  sc.nextLine();

        System.out.print("Last Name: ");
        String lastName =  sc.nextLine();

        ActorService.addActor(firstName, lastName, dtf.format(now));

        System.out.println("\nActor "+firstName+" has been Added.");

        Menu();

    }

    private void updateActor(){
        Actor[] actors = ActorService.listAll();
        System.out.println("\nActor ID  |  First Name  | Last Name  |  Last Update");
        for (Actor actor : actors){
            System.out.println(actor.toString());
        }

        System.out.println("\nSelect Actor ID to Update");
        int actorId = sc.nextInt();

        System.out.println("1. Update First Name");
        System.out.println("2. Update Last Name");
        int update = sc.nextInt();

        if(update == 1){
            sc.nextLine();
            String firstName =  sc.nextLine();
            ActorService.updateFirstName(actorId, firstName, dtf.format(now));
            System.out.println("\nActor Updated");
            Menu();
        } else if(update == 2){
            sc.nextLine();
            String lastName =  sc.nextLine();
            ActorService.updateLastName(actorId, lastName, dtf.format(now));
            System.out.println("\nActor Updated");
            Menu();
        }

    }

    private void deleteActor(){

        Actor[] actors = ActorService.listAll();
        System.out.println("\nActor ID  |  First Name  | Last Name  |  Last Update");
        for (Actor actor : actors){
            System.out.println(actor.toString());
        }

        System.out.print("\nEnter Actor ID: ");
        int actorId = sc.nextInt();

        ActorService.deleteActor(actorId);

        System.out.print("\nActor with ID  "+actorId+" has been Deleted");

        Menu();

    }
}
