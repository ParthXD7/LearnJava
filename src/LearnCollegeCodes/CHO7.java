package CollegeCHO;

import java.util.Scanner;

class Room {
    private double length;
    private double breadth;
    private static double donateBox = 0; // Static variable to collect donation

    // Constructor
    public Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    // Calculate Area
    public double area() {
        return length * breadth;
    }

    // Calculate Perimeter
    public double perimeter() {
        return 2 * (length + breadth);
    }

    // Static method to calculate area
    public static double calculateArea(Room room) {
        return room.area();
    }

    // Static method to calculate perimeter
    public static double calculatePerimeter(Room room) {
        return room.perimeter();
    }

    // Display Room data
    public void display() {
        System.out.println("Room Details:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println();
    }

    // Collect donation
    public void collectDonation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter donation amount for this room: ");
        double donation = scanner.nextDouble();
        donateBox += donation;
    }

    // Static method to display total donation collected
    public static void displayTotalDonation() {
        System.out.println("Total donation collected: " + donateBox);
    }
}

public class CHO7 {
    public static void main(String[] args) {
        // Creating an array of Room objects
        Room[] rooms = new Room[3];

        // Taking input for length and breadth of each room from the user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Enter length and breadth of Room " + (i+1) + ":");
            double length = scanner.nextDouble();
            double breadth = scanner.nextDouble();
            rooms[i] = new Room(length, breadth);

            // Ask if they want to donate more
            System.out.print("Do you want to donate for this room? (yes/no): ");
            String donateOption = scanner.next();
            if (donateOption.equalsIgnoreCase("yes")) {
                rooms[i].collectDonation();
            }
        }

        // Displaying area and perimeter of each room
        for (int i = 0; i < rooms.length; i++) {
            rooms[i].display();
        }

        // Displaying area and perimeter using static methods
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Area of Room " + (i+1) + ": " + Room.calculateArea(rooms[i]));
            System.out.println("Perimeter of Room " + (i+1) + ": " + Room.calculatePerimeter(rooms[i]));
            System.out.println();
        }

        // Displaying total donation collected
        Room.displayTotalDonation();
    }
}