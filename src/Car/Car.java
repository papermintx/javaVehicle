package Car;
import Vehicle.Vehicle;
import Vehicle.VehicleType;


public class Car extends  Vehicle{

    private final CarType carType;

    public Car(String name, String color, int weight, VehicleType type, CarType carType, int numberOfDoors, int numberOfWheels) {
        super(name, color, weight, type, numberOfWheels, numberOfDoors);
        this.carType = carType;
        calculateMaxSpeed();
    }

    @Override
    public void honk() {
        System.out.println("Honk honk!");

    }

    @Override
    public void display() {
        System.out.println(
                "Nama: " + getName() + "\n" +
                        "Warna: " + getColor() + "\n" +
                        "Berat: " + getWeight() + "\n" +
                        "Jenis: " + getType() + "\n" +
                        "Jumlah Pintu: " + getNumberOfDoors() + "\n" +
                        "Jumlah Roda: " + getNumberOfWheels() + "\n" +
                        "Kecepatan Maksimum: " + getMaxSpeed() + "\n" +
                        "Jenis Mobil: " + carType
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


    @Override
    public void calculateMaxSpeed() {
        double calculated = getWeight() * 0.1;
        switch (carType) {
            case SEDAN -> setMaxSpeeds(180 - calculated);
            case SPORT -> setMaxSpeeds(200 - calculated);
            case SUV -> setMaxSpeeds(160 - calculated);
            case TRUCK -> setMaxSpeeds(120 - calculated);
        }
    }



}
