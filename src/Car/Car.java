package Car;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

public class Car extends  Vehicle{

    private CarType carType;

    public Car(String name, String color, int weight, VehicleType type, CarType carType) {
        super(name, color, weight, type);
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
Name: \{getName()}
Color: \{getColor()}
Weight: \{getWeight()}
Type: \{getType()}
Car Type: \{carType}
"""
        );
    }

    @Override
    public void start() {
        System.out.println("Mobil Siap!");

    }

    @Override
    public void brake() {
        System.out.println("Mobil berhenti!");

    }


}
