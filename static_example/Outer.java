package static_example;

public class Outer {
    static void sayhello() {
        System.out.println("Hello");
    }

    // promotes encapsulation -> process of hiding data tramanants orize access
    static class Inner {
        void displayInnerclassDetails() {
            System.out.println("the data is form inner class");
        }
    }

    public static void main(String[] args) {
        Outer.sayhello();
        Outer.Inner innerclassobj = new Outer.Inner();
        innerclassobj.displayInnerclassDetails();
    }
}

// cd folder name
// javac files name java
// java files name java