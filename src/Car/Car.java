package Car;
import Vehicle.Vehicle;
import Vehicle.VehicleType;


public class Car extends  Vehicle{

    private final CarType carType;

    public Car(String name, String color, int weight, VehicleType type, CarType carType, int numberOfDoors, int numberOfWheels) {
        super(name, color, weight, type, numberOfWheels, numberOfDoors);
        this.carType = carType;
    }

    @Override
    public void honk() {
        System.out.println("Honk honk!");

    }

    @Override
    public void display() {
        System.out.println(
                STR."""
Nama: \{getName()}
Warna: \{getColor()}
Berat: \{getWeight()}
Jenis: \{getType()}
Jumlah Pintu: \{getNumberOfDoors()}
Jumlah Roda: \{getNumberOfWheels()}
Kecepatan Maksimum: \{getMaxSpeed()}
Jenis Mobil: \{carType}
"""
        );

    }

    @Override
    public void start() {
        System.out.println("Mobil Siap!");

    }

    @Override
    public void accelerate() {
        System.out.println("brumm brumm brumm");
    }

    @Override
    public void brake() {
        System.out.println("Mobil Berhenti");
    }


}
