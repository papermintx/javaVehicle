package Bike;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

public class Bike extends Vehicle{

    private final BikeType bikeType;

    public Bike(String name, String color, int weight, VehicleType type, BikeType bikeType, int numberOfWheels) {
        super(name, color, weight, type, numberOfWheels);
        this.bikeType = bikeType;
        calculateMaxSpeed();

    }

    @Override
    public void honk() {
        System.out.println("Kling kling!");
    }

    @Override
    public void display() {
        System.out.println(
                "Nama: " + getName() + "\n" +
                        "Warna: " + getColor() + "\n" +
                        "Berat: " + getWeight() + "\n" +
                        "Tipe: " + getType() + "\n" +
                        "Jumlah Roda: " + getNumberOfWheels() + "\n" +
                        "Kecepatan Maksimum: " + getMaxSpeed() + "\n" +
                        "Jenis Sepeda: " + bikeType
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
    public void calculateMaxSpeed() {
        double calculated = getWeight() * 0.1;
        switch (bikeType) {
            case BMX -> setMaxSpeeds(40 - calculated);
            case ROAD -> setMaxSpeeds(50 - calculated);
            case MOUNTAIN -> setMaxSpeeds(30 - calculated);
        }

    }

    @Override
    public void brake() {
        System.out.println("Sepeda Berhenti");
    }


}
