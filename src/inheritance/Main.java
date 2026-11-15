package inheritance;

class Vehicle {

    String brand = "BMW";

    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println("Brand: " + c.brand);

        c.start();
        c.drive();
        c.stop();
    }
}
