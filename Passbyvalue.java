public class Passbyvalue {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a:" + a);
        int b;
        b = a; // copy
        System.err.println("b:" + b);
        b = 50;
        System.out.println("b" + b);
        System.out.println("a" + a);
    }
}