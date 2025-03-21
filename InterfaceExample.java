interface Parent {
    void makesound();
}

class Child implements Parent {
    public void makesound() {
        System.out.println("sound of child class");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.makesound();

    }
}
