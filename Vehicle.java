

// Base class for parking vehicles
class Vehicle {
    protected String type;
    protected double price;
    
    // Constructor to initialize type and price of vehicle
    public Vehicle(String type, double price) {
        this.type = type;
        this.price = price;
    }
    
    // Display type and price of vehicle
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
    }
    
    // Getter method for vehicle price
    public double getPrice() {
        return price;
    }
}

// Subclass for motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle() {
        super("Motorcycle", 2.0);
    }
}

// Subclass for car
class Car extends Vehicle {
    public Car() {
        super("Car", 5.0);
    }
}