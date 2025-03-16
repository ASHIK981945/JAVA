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

public class Dynamicmethoddispakh {
    public static void main(String[] args) {

        Animal animalsound;

        animalsound = new Dog();
        animalsound.makesound();

        animalsound = new Cat();
        animalsound.makesound();

    }
}
