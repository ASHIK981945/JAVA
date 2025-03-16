// An abstract class can have both abstract (without body) and concrete methods.

// using abstract
abstract class Animal {
    abstract void makesound();

    // concrete methods.
    void sleep() {
        System.out.println("sleeping");
    }
}

class Cat extends Animal {
    @Override
    void makesound() {
        System.out.println("cat meow");
    }
}

class Dog extends Animal {
    @Override
    void makesound() {
        System.out.println("dog");
    }
}

public class AbstractExample {
    public static void main(String[] args) {

        Animal animalsound;

        animalsound = new Cat();
        animalsound.makesound();

        animalsound = new Dog();
        animalsound.makesound();

    }
}
