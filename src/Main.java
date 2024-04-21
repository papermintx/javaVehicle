import Bike.Bike;
import Car.Car;
import java.util.ArrayList;
import java.util.Scanner;
import Car.CarType;
import Vehicle.VehicleType;
import Bike.BikeType;

public static ArrayList<Bike> bike = new ArrayList<>();
public static ArrayList<Car> car = new ArrayList<>();

public static void menu(Scanner scanner) {
    boolean exit = false;
    while (!exit) {
        int choice;
        System.out.println("1.Buat Mobil");
        System.out.println("2.Buat Sepeda");
        System.out.println("3.Lihat Kendaraan");
        System.out.println("4.Mengendarai Mobil");
        System.out.println("5.Mengendarai Sepeda");
        System.out.println("6.Keluar");
        System.out.print("Pilih: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                createCar(scanner);
                break;
            case 2:
                createBike(scanner);
                break;
            case 3:
                displayVehicle();
                break;
            case 4:
                driveCar(scanner);
                break;
            case 5:
                driveBike(scanner);
                break;
            case 6:
                System.out.println("Terima Kasih");
                exit = true;
            default:
                System.out.println("Pilihan tidak valid");
                menu(scanner);
                break;
        }
    }
}

public static void displayVehicle() {
    int i = 1;
    System.out.println();
    for (Bike b : bike) {
        System.out.println(i + ". " + b.getName());
        i++;
    }

    for (Car c : car) {
        System.out.println(i + ". " + c.getName());
        i++;
    }
    System.out.println();
}

public static void driveCar(Scanner scanner) {
    boolean carStart = false;
    boolean carAccelerate = false;
    boolean carMove = false;
    boolean carExit = false;

    int i = 1;
    for (Car c : car) {
        System.out.println(i + ". " + c.getName());
        i++;
    }
    System.out.print("Pilih Mobil: ");
    int choice = scanner.nextInt();
    Car selectedCar = car.get(choice - 1);
    while (!carExit) {
        System.out.println("1. Nyalakan Mesin");
        System.out.println("2. Gas");
        System.out.println("3. Gerak");
        System.out.println("4. Rem");
        System.out.println("5. Lihat Info Mobil");
        System.out.print("Pilih: ");
        int carChoice = scanner.nextInt();
        switch (carChoice) {
            case 1:
                selectedCar.start();
                carStart = true;
                break;
            case 2:
                if (!carStart) {
                    System.out.println("Start Mobil Terlebih Dahulu");
                    break;
                }
                selectedCar.accelerate();
                carAccelerate = true;
                break;
            case 3:
                if (!carStart) {
                    System.out.println("Start Mobil Terlebih Dahulu");
                    break;
                }
                if (!carAccelerate) {
                    System.out.println("Mobil Belum Diakselerasi");
                    break;
                }
                selectedCar.move();
                carMove = true;
                break;
            case 4:
                if (!carStart) {
                    System.out.println("Start Mobil Terlebih Dahulu");
                    break;
                }
                if (!carAccelerate) {
                    System.out.println("Mobil Belum Diakselerasi");
                    break;
                }
                if (!carMove) {
                    System.out.println("Mobil Belum Bergerak");
                    break;
                }
                selectedCar.brake();
                break;
            case 5:
                selectedCar.display();
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
                driveCar(scanner);
                break;
        }
        System.out.println("1. Lanjut");
        System.out.println("2. Keluar");
        System.out.print("Pilih: ");
        int exitChoice = scanner.nextInt();
        if (exitChoice == 2) {
            carExit = true;
        }
    }

}

public static void driveBike(Scanner scanner) {

    boolean bikeExit = false;

    int i = 1;
    for (Bike b : bike) {
        System.out.println(i + ". " + b.getName());
        i++;
    }
    System.out.print("Pilih Sepeda: ");
    int choice = scanner.nextInt();
    Bike selectedBike = bike.get(choice - 1);
    while (!bikeExit) {
        System.out.println("1. Siapkan Sepeda");
        System.out.println("2. Info Sepeda");
        System.out.println("3. Kayuh");
        System.out.println("4. Rem");
        System.out.print("Pilih: ");
        int bikeChoice = scanner.nextInt();
        switch (bikeChoice) {
            case 1:
                selectedBike.start();
                break;
            case 2:
                selectedBike.display();
                break;
            case 3:
                selectedBike.move();
                break;
            case 4:
                selectedBike.brake();
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
                driveBike(scanner);
                break;
        }
        System.out.println("1. Lanjut");
        System.out.println("2. Keluar");
        System.out.print("Pilih: ");

        int exitChoice = scanner.nextInt();
        if (exitChoice == 2) {
            bikeExit = true;
        }
    }

}


public static void createBike(Scanner scanner) {
    String name, color;
    int weight, numberOfWheels, bikeTypeChoice;
    BikeType bikeType;
    System.out.print("Nama Sepeda: ");
    name = scanner.nextLine();
    System.out.print("Warna Sepeda: ");
    color = scanner.nextLine();
    System.out.print("Berat Sepeda: ");
    weight = scanner.nextInt();
    System.out.print("Jumlah Roda: ");
    numberOfWheels = scanner.nextInt();
    System.out.println("Sepeda Berjenis: ");
    System.out.println("1.BMX");
    System.out.println("2.MOUNTAIN");
    System.out.println("3.ROAD");
    System.out.print("Pilih: ");
    bikeTypeChoice = scanner.nextInt();
    bikeType = switch (bikeTypeChoice) {
        case 1 -> BikeType.BMX;
        case 2 -> BikeType.MOUNTAIN;
        case 3 -> BikeType.ROAD;
        default -> null;
    };
    bike.add(new Bike(name, color, weight, VehicleType.BIKE, bikeType, numberOfWheels));
    System.out.println("Sepeda Berhasil Dibuat");
    menu(scanner);
}

public static void createCar(Scanner scanner) {
    String name, color;
    int weight, numberOfDoors, numberOfWheels, carTypeChoice;
    CarType carType;
    System.out.print("Nama Mobil: ");
    name = scanner.nextLine();
    System.out.print("Warna Mobil: ");
    color = scanner.nextLine();
    System.out.print("Berat Mobil: ");
    weight = scanner.nextInt();
    System.out.print("Jumlah Pintu: ");
    numberOfDoors = scanner.nextInt();
    System.out.print("Jumlah Roda: ");
    numberOfWheels = scanner.nextInt();
    System.out.println("Mobil Berjenis: ");
    System.out.println("1.Sport");
    System.out.println("2.Sedan");
    System.out.println("3.Suv");
    System.out.println("4.Truck");
    System.out.print("Pilih: ");
    carTypeChoice = scanner.nextInt();
    carType = switch (carTypeChoice) {
        case 1 -> CarType.SPORT;
        case 2 -> CarType.SEDAN;
        case 3 -> CarType.SUV;
        case 4 -> CarType.TRUCK;
        default -> null;
    };
    car.add(new Car(name, color, weight, VehicleType.CAR, carType, numberOfDoors, numberOfWheels));
    System.out.println("Mobil Berhasil Dibuat");
    menu(scanner);
}


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    menu(scanner);

}