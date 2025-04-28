class Sum {
    public int add(int a, int b) {
        return a + b;
    }
    

    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class  NUMBERSUM{
    public static void main(String[] args) {
        Sum calc = new Sum();
        System.out.println("Sum of two integers: " + calc.add(5, 10));
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.2));
        System.out.println("Sum of three integers: " + calc.add(3, 6, 9));
    }
}
