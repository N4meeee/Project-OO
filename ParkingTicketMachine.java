import java.util.Scanner;
// Main class for parking ticket machine
public class ParkingTicketMachine {
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Display options for vehicle type
        System.out.println("Please select a vehicle type:");
        System.out.println("1. Motorcycle");
        System.out.println("2. Car");
        
        try {
            // Get user input for vehicle type
            int vehicleType = input.nextInt();
            
            // Create vehicle object based on user input
            Vehicle vehicle;
            if (vehicleType == 1) {
                vehicle = new Motorcycle();
            } else if (vehicleType == 2) {
                vehicle = new Car();
            } else {
                System.out.println("Invalid vehicle type.");
                return;
            }
            
            // Display price for selected vehicle
            System.out.println("Price for " + vehicle.type + ": $" + vehicle.price);
            
            // Get user input for amount to pay
            System.out.print("Please insert money: $");
            double amount = input.nextDouble();
            
            // Check if amount is enough to cover parking fee
            if (amount < vehicle.price) {
                System.out.println("Amount inserted is not enough.");
                return;
            }
            
            // Calculate and display change
            double change = amount - vehicle.price;
            System.out.println("Change: $" + change);
            
            // Print ticket and open parking gate
            System.out.println("Printing ticket...");
            System.out.println("Please proceed to parking gate.");
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            // Close scanner to free up resources
            input.close();
        }
    }
}