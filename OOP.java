
//Defining  a class named car
class Car {
    // fields or data member or attributes
    String brand;
    int speed;

    // method
    void displayCarDetails() {
        System.out.println("Brand:" + brand);
        System.out.println("Speed:" + speed + "km/hr");
    }
}

public class OOP {
    public static void main(String[] args) {
        // creating objects of car class
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        // assigning values to attributes
        car1.brand = "bmw";
        car1.speed = 40;

        car2.brand = "deep";
        car2.speed = 25;

        car3.brand = "deep";
        car3.speed = 25;

        // calling methods an object
        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();

    }
}

// volume of cube and cuboid