public class Polymorphism {

    // polymorphism : having multiple forms

    // method overloading
    // Example :
    // int add (int a , int b);
    // int add (int a, int b , int c);
    // int add (double a, double b);

    // program example

    int add(int a, int b) {
        return a + b;
    }

    // method overloded with 3 int parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // methods overloading with 2 double types parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        // use object

        Polymorphism object = new Polymorphism();
        int result = object.add(45, 31);
        System.out.println("addition of two number:" + result);
        System.out.println("...............................");

        // use static
        // int result = add(0, 0);
        // System.out.println("addition of two number" + result);

        // use static
        int value = Polymorphism.add(2, 3, 4);
        System.out.println("addition of three number :" + value);
        System.out.println("...............................");

        // use object
        Polymorphism object1 = new Polymorphism();
        int resultdouble = object1.add(12, 12);
        System.out.println("addition of two number of double " + resultdouble);

    }

}
