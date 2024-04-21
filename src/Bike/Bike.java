package Bike;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

public class Bike extends Vehicle{

    private BikeType bikeType;

    public Bike(String name, String color, int weight, VehicleType type, BikeType bikeType, int numberOfWheels) {
        super(name, color, weight, type, numberOfWheels);
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
Nama: \{getName()}
Warna: \{getColor()}
Berat: \{getWeight()}
Tipe: \{getType()}
Jumlah Roda: \{getNumberOfWheels()}
Kecepatan Maksimum: \{getMaxSpeed()}
Jenis Sepeda: \{bikeType}
"""
        );

    }

    @Override
    public void start() {
        System.out.println("Sepeda Siaaap!");
    }

    @Override
    public void accelerate() {
        System.out.println("gowes gowes gowes ");
    }

    @Override
    public void brake() {
        System.out.println("Sepeda Berhenti");
    }


}
