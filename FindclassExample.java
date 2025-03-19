
//final class ->useprivate class
final class First {
    void firstMethod() {
        System.out.println("first mehtod called");
    }
}

class Second {
    void SecondMethod() {
        System.out.println("second method called");
    }
}

public class FindclassExample {
    public static void main(String[] args) {
        // final String name = "charlie";
        // // name = "alpha";
        // System.out.println(name);

        Second secod = new Second();
        secod.SecondMethod();
    }
}