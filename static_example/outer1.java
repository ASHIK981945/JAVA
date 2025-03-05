package static_example;

// non-static
public class outer1 {
    class Inner {
        void displayInnerclassDetail() {
            System.out.println("Inside Non-static nested (Inner) class");
        }
    }

    public static void main(String[] args) {
        outer1 a = new outer1();
        outer1.Inner nonStaticobject = a.new Inner();
        nonStaticobject.displayInnerclassDetail();
    }
}
