package Vehicle;

public abstract class Vehicle {
    public static int[] maxSpeeds = {500, 70};

    private VehicleType type;
    private String name;
    private String color;
    private int weight;

    private int numberOfWheels;

    private int numberOfDoors;

    private double maxSpeed;


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
        calculateMaxSpeed();
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
        System.out.printf("%s is moving\n", name);
    }

    public abstract void honk();

    public abstract void display();

    public abstract void start() ;

    public abstract void accelerate() ;

    public void calculateMaxSpeed() {
        maxSpeed = switch (type) {
            case CAR -> maxSpeeds[0] - ((double) weight / 100);
            case BIKE -> maxSpeeds[1] - ((double) weight / 100);
        };
    }

    public abstract void brake();
}
