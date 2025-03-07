
// vehicle - parent class or super class
class Vehicle {
    void run() {
        System.out.println("vehicle is running");
    }
}

// car - child class or sub class
class car extends Vehicle {
    void stop() {
        System.out.println("vehicle is stoping");
    }
}

public class VehicleExmaple {
    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        a.run();
        car b = new car();
        b.run();
        b.stop();
    }
}
