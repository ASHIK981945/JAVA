public class ThrowkeywordExamplee {

    // developer a
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        // developer b
        try {
            int result = divide(1, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("cannot divide by zero");
        }
    }
}
