package Bike;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

public class Bike extends Vehicle{

    private BikeType bikeType;
    public Bike(String name, String color, int weight, VehicleType type, BikeType bikeType) {
        super(name, color, weight, type);
        this.bikeType = bikeType;

    }

    @Override
    public void honk() {
        System.out.println("Kling kling!");
    }

    @Override
    public void display() {
        System.out.println(
                STR."""
Name: \{getName()}
Color: \{getColor()}
Weight: \{getWeight()}
Type: \{getType()}
"""
        );

    }

    @Override
    public void start() {
        System.out.println("Sepeda Siaaap!");
    }

    @Override
    public void brake() {
        System.out.println("Sepeda berhenti!");

    }


}
