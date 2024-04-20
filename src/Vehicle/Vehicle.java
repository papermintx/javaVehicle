package Vehicle;

public abstract class Vehicle {

    private VehicleType type;
    private String name;
    private String color;
    private int weight;

    private int numberOfWheels;

    private int numberOfDoors;

    public Vehicle(String name, String color, int weight, VehicleType type, int numberOfWheels, int numberOfDoors) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
    }

    public Vehicle(String name, String color, int weight, VehicleType type) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Vehicle(String name, String color, int weight, VehicleType type, int numberOfWheels) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.numberOfWheels = numberOfWheels;
    }



    public VehicleType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }



    public void move() {
        System.out.printf("%s is moving\n", name);
    }

    public void stop() {
        System.out.printf("%s stops\n", name);
    }

    public abstract void honk();

    public abstract void display();

    public abstract void start() ;

    public void accelerate() {
        System.out.println("Vehicle is accelerating");
    }

    public abstract void brake();
}
