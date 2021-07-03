//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList storage = new ArrayList();
        new Scanner(System.in);
        storageDepot(storage);
    }

    public static void storageDepot(ArrayList storage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to our storage depot information system! Please choose an action (1-3): ");
        System.out.println();
        System.out.println("1. List of items in the depot...");
        System.out.println("2. Save a new delivery...");
        System.out.println("3. List of items during a certain period of time...(Dosan't exist");
        System.out.print("Option:");
        int option = scanner.nextInt();
        switch(option) {
            case 2:
                addNewDelivery(storage);
            case 1:
                printItem(storage);
            case 3:
            default:
        }
    }

    public static void newDelivery(ArrayList storage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the name of the product: ");
        String name = scanner.nextLine();
        System.out.println("Please, enter the date of expiration: ");
        String dateOfExpiration = scanner.nextLine();
        System.out.println("Please, enter the date of arrival in the depot: ");
        String dateOfArrival = scanner.nextLine();
        System.out.println("Please, enter the name of the manufacturer: ");
        String nameOfManufacturer = scanner.nextLine();
        System.out.println("Please, enter the measuring unit (kg/l): ");
        String mesUnit = scanner.nextLine();
        System.out.println("Please, enter the amount of the delivered items: ");
        System.out.println("NOTE: A single shelf can hold 20 items max!");
        int amountOfItems = scanner.nextInt();
        int shelf = 1;
        if (amountOfItems <= 20) {
            System.out.println("All of the items will be stored on a single shelf");
        } else {
            while(amountOfItems > 20) {
                amountOfItems -= 20;
                ++shelf;
            }
        }

        System.out.println("The item will occupy " + shelf + " shelves!");
        System.out.println();
        System.out.println("Please, choose a location where the item will be saved (section/shelf/number): ");
        System.out.println();
        System.out.println("Would you like to leave a comment on the item? (OPTIONAL)");
        String comment = scanner.nextLine();
        scanner.nextLine();
        System.out.println("The new item has been added successfully!");
        storageList(name, dateOfExpiration, dateOfArrival, nameOfManufacturer, mesUnit, amountOfItems, comment,storage);
    }

    public static void addNewDelivery(ArrayList storage) {
        Scanner scanner = new Scanner(System.in);
        newDelivery(storage);
        System.out.println("Would you like to add another item?");
        System.out.println("1. Yes | 2. No");
        System.out.print("Option: ");
        int option = scanner.nextInt();
        switch(option) {
            case 1:
                newDelivery(storage);
                break;
            case 2:
                storageDepot(storage);
        }

    }

    public static void storageList(String name, String dateOfExpiration, String dateOfArrival, String nameOfManufacturer,
                                   String mesUnit, int amountOfItems, String comment,ArrayList storage) {
        storage.add(name);
        storage.add(dateOfExpiration);
        storage.add(dateOfArrival);
        storage.add(nameOfManufacturer);
        storage.add(mesUnit);
        storage.add(amountOfItems);
        storage.add(comment);
    }
    public static void printItem(ArrayList storage){
        Scanner scanner = new Scanner(System.in);
        System.out.println(storage);
        System.out.println("Would you like continue?");
        System.out.println("1. Yes | 2. No");
        System.out.print("Option: ");
        int option = scanner.nextInt();
        switch(option) {
            case 1:
                storageDepot(storage);
                break;
            case 2:
                return;
        }
    }
}
