class Animal {
    void makesound() {
        System.out.println("ANIMAL MAKE SOND");
    }
}

class Dog extends Animal {
    @Override
    void makesound() {
        System.out.println("dog breaks");
    }
}

class Cat extends Animal {
    @Override
    void makesound() {
        System.out.println("cat meow");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal animalsound = new Animal();
        animalsound.makesound();
        Dog dogsound = new Dog();
        dogsound.makesound();
        Cat c3 = new Cat();
        c3.makesound();

    }
}
