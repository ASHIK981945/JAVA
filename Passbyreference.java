
class Car {
    String name;
    int price;
}

public class Passbyreference {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "bmw";
        car.price = 1;
        System.out.println("firstcarname" + car.name);
        System.out.println("firstcarprice" + car.price);

        Car secondcar = new Car();
        // copy vayo
        secondcar = car;
        System.out.println("secondcarname:" + secondcar.name);
        System.out.println("escondcarprice" + secondcar.price);

        secondcar.name = "mustany";
        secondcar.price = 56999;
        System.out.println(secondcar.name);
        System.out.println(secondcar.price);

        System.out.println(car.name);
        System.out.println(car.price);
    }
}
