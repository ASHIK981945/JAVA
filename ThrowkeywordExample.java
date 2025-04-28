import cstmerr.CustonErrorException;

public class ThrowkeywordExample {
    public static void main(String[] args) {
        int number = 10;
        try {
            if (number < 0) {
                throw new CustonErrorException("number cannot be negative");
            }
            System.out.println("valid number:" + number);
        } catch (Exception e) {
            System.out.println("custom Error:" + e.getMessage());
        }

    }
}
