class parent {
    int number = 100; // attribute

    // def constructor
    parent() {
        System.out.println("parent class constructor called");
        // (kina aayo output because extends parent )
    }

    // parent method
    void other() {
        System.out.println("parsent other method called");

    }

    // parent methodxs
    void secondmethod() {
        System.out.println("parsent second method called");

    }
}

class Child extends parent {
    int number = 200; // attribute

    // child method
    void display() {
        super.other();
        super.secondmethod();
        System.out.println("paresnt class number:" + super.number);
        System.out.println("child class number:" + this.number);
    }
}

public class Superkeywordexample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
