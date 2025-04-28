class Person {
    protected String name = "Ashik";
    protected Double salary = 10.00;

}

class Child extends Person {
    void dispaly() {
        System.out.println("name:---->" + name);
        System.out.println("price:---->" + salary);

    }

}

public class Protectedexample {
    public static void main(String[] args) {
        Child c = new Child();\
        c.dispaly();
    }
}