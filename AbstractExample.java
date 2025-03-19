// An abstract class can have both abstract (without body) and concrete methods.

// using abstract
// Abstract class representing an Animal
abstract class Animal {
    // Abstract method to be implemented by subclasses
    abstract void makesound();

    // concrete methods.with implementation
    void sleep() {
        System.out.println("sleeping");
    }
}

// Cat class extending Animal and providing implementation for makesound
class Cat extends Animal {
    @Override
    void makesound() {
        System.out.println("cat meow");
    }
}

// Dog class extending Animal and providing implementation for makesound
class Dog extends Animal {
    @Override
    void makesound() {
        System.out.println("dog");
    }
}

// Main class to demonstrate abstract class behavior
public class AbstractExample {
    public static void main(String[] args) {

        Animal animalsound;

        // Creating an instance of Cat and calling its method
        animalsound = new Cat();
        animalsound.makesound();
        animalsound.sleep();

        // Creating an instance of Dog and calling its method
        animalsound = new Dog();
        animalsound.makesound();

    }
}
