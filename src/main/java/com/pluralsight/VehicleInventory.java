package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    static String[] vehicles = new String[20];
    static Scanner myScanner = new Scanner(System.in);
    static int vehicleCounter = 6;

    public static void main(String[] args) {
        Vehicle car1 = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[0] = car1.toString();

        Vehicle car2 = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[1] = car2.toString();

        Vehicle car3 = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[2] = car3.toString();

        Vehicle car4 = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[3] = car4.toString();

        Vehicle car5 = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[4] = car5.toString();

        Vehicle car6 = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        vehicles[5] = car6.toString();

        int command = 0;
        while (command != 6) {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.print("Enter your command: ");
            command = myScanner.nextInt();
            myScanner.nextLine();
            switch (command) {
                case 1 -> listAllVehicles();
                case 2 -> findVehicleByModel();
                case 3 -> findVehicleByPrice();
                case 4 -> findVehicleByColor();
                case 5 -> addVehicle();
                case 6 -> System.out.println("Thank you for using the system!");
                default -> System.out.println("Invalid input.");
            }
        }

    }

    public static void listAllVehicles() {
        for (int i = 0; i < vehicleCounter; i++) {
            System.out.println(vehicles[i]);
        }
        System.out.println("--------------------------------------------------------");
    }

    public static void findVehicleByModel() {
        System.out.print("Enter make and model: ");
        String model = myScanner.nextLine();

        for (int i = 0; i < vehicleCounter; i++) {
            if (vehicles[i].toLowerCase().contains(model)) {
                System.out.println(vehicles[i]);
            }
        }
    }
    public static void findVehicleByPrice() {
        System.out.print("Enter price: ");
        String price = myScanner.nextLine();

        for (int i = 0; i < vehicleCounter; i++) {
            if (vehicles[i].toLowerCase().contains(price)) {
                System.out.println(vehicles[i]);
            }
        }
    }

    public static void findVehicleByColor() {
        System.out.print("Enter price of vehicle: ");
        String color = myScanner.nextLine();

        for (int i = 0; i < vehicleCounter; i++) {
            if (vehicles[i].toLowerCase().contains(color)) {
                System.out.println(vehicles[i]);
            }
        }
    }
    public static void addVehicle() {
        System.out.print("Enter the vehicle information below:\n");
        System.out.print("Vehicle ID: ");
        int id = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Make and Model: ");
        String makeModel = myScanner.nextLine();
        System.out.print("Color: ");
        String color = myScanner.nextLine();
        System.out.print("Odometer Reading: ");
        int odometer = myScanner.nextInt();
        myScanner.nextLine();
        System.out.print("Price: ");
        double price = myScanner.nextDouble();
        myScanner.nextLine();

        vehicles[vehicleCounter] = id + " | " + makeModel + " | " + color + " | " + odometer + " miles | $" + price;
        vehicleCounter += 1;
        System.out.println("Vehicle added to the list.");
    }
}