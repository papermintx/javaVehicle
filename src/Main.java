
import Car.Car;
import Bike.Bike;
import Car.CarType;
import Bike.BikeType;
import Vehicle.VehicleType;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", "Red", 1000, VehicleType.CAR, CarType.SPORT);
        car.start();
        car.move();
        car.accelerate();
        car.brake();
        car.stop();
        car.honk();
        car.display();
        System.out.println();
        Bike bike = new Bike("BMX", "Black", 10, VehicleType.BIKE,BikeType.BMX);
        bike.start();
        bike.move();
        bike.accelerate();
        bike.brake();
        bike.stop();
        bike.honk();
        bike.display();
    }
}