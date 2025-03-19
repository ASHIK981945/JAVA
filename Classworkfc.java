class Person {
    String name = "Ashik";
    final Double salary = 10.00;

}

class Child extends Person {
    void dispaly() {
        System.out.println("name:---->" + name);
        System.out.println("price:---->" + salary);

    }

}

public class Classworkfc {
    public static void main(String[] args) {
        Child c = new Child();
        c.name = "person b";
        // c.salary = 200.00;
        c.dispaly();
    }
}
