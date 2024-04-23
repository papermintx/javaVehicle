package Vehicle;

public abstract class Vehicle {

    private VehicleType type;
    private String name;
    private String color;
    private int weight;

    private int numberOfWheels;

    private int numberOfDoors;

    private double maxSpeed;

    public void setMaxSpeeds(double maxSpeeds) {
        this.maxSpeed = maxSpeeds;
    }


    // untuk mobil
    public Vehicle(String name, String color, int weight, VehicleType type, int numberOfWheels, int numberOfDoors) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;

    }

    // untuk sepeda
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

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void move() {
        System.out.println("Gowes gowes gowes");
    }

    public abstract void honk();

    public abstract void display();

    public abstract void start() ;

    public abstract void accelerate() ;

    public abstract void calculateMaxSpeed();

    public abstract void brake();
}
