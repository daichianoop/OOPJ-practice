// Base class
class Vehicle {
    String make, model, fuelType;
    int year;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Method to calculate fuel efficiency (to be overridden)
    public double fuelEfficiency() {
        return 0.0;
    }

    // Method to calculate distance traveled
    public double distanceTraveled(double fuelUsed) {
        return fuelEfficiency() * fuelUsed;
    }

    // Method to get maximum speed (to be overridden)
    public int maxSpeed() {
        return 0;
    }
}

// Truck subclass
class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double fuelEfficiency() {
        return 8.0; // Example fuel efficiency in km/l
    }

    @Override
    public int maxSpeed() {
        return 120; // Example max speed in km/h
    }
}

// Car subclass
class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double fuelEfficiency() {
        return 15.0; // Example fuel efficiency in km/l
    }

    @Override
    public int maxSpeed() {
        return 180; // Example max speed in km/h
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double fuelEfficiency() {
        return 35.0; // Example fuel efficiency in km/l
    }

    @Override
    public int maxSpeed() {
        return 220; // Example max speed in km/h
    }
}

// Main class
public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Volvo", "FH16", 2022, "Diesel");
        Vehicle car = new Car("Toyota", "Corolla", 2023, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", "R1", 2021, "Petrol");

        System.out.println(truck.make + " " + truck.model + " Fuel Efficiency: " + truck.fuelEfficiency() + " km/l");
        System.out.println(car.make + " " + car.model + " Fuel Efficiency: " + car.fuelEfficiency() + " km/l");
        System.out.println(motorcycle.make + " " + motorcycle.model + " Fuel Efficiency: " + motorcycle.fuelEfficiency() + " km/l");

        System.out.println(car.make + " " + car.model + " Distance Traveled with 10L fuel: " + car.distanceTraveled(10) + " km");
    }
}