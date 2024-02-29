import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

//        Vehicle car = new Car();
//        Vehicle bike = new Bike();
//        Vehicle truck = new Truck();

        List<Vehicle> rentedVehicles = new ArrayList<>();
        boolean exit = false;
        while(!exit) {
            printMenu();
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Enter Car Model: ");
                    String carModel = input.nextLine();
                    System.out.println("Enter Rental Days: ");
                    int carDays = input.nextInt();
                    rentedVehicles.add(new Car(carModel, carDays));
                    input.nextLine();
                    break;

                case "2":
                    System.out.println("Enter Bike Brand: ");
                    String bikeBrand = input.nextLine();
                    System.out.println("Enter Rental Hours: ");
                    int bikeHours = input.nextInt();
                    rentedVehicles.add(new Bike(bikeBrand, bikeHours));
                    input.nextLine();
                    break;
                case "3":
                    System.out.println("Enter Truck Type: ");
                    String truckType = input.nextLine();
                    System.out.println("Enter Rental Weeks: ");
                    int truckWeeks = input.nextInt();
                    rentedVehicles.add(new Truck(truckType, truckWeeks));
                    input.nextLine();
                    break;
                case "4":
                    if (rentedVehicles.isEmpty()) {
                        System.out.println("No vehicles have been rented yet.");
                    } else {
                        System.out.println("Rented Vehicles:");
                        for (Vehicle vehicle : rentedVehicles) {
                            vehicle.displayDetails();
                            System.out.println();
                        }
                    }
                    break;
                case "5":
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }




    }
    public static void printMenu() {
        System.out.println("1. Rent a Car ");
        System.out.println("2. Rent a Bike ");
        System.out.println("3. Rent a Truck ");
        System.out.println("4. View Rented Vehicles ");
        System.out.println("5. Exit ");
        System.out.println("Enter your choice: ");
    }

}
