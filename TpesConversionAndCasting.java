public class TpesConversionAndCasting {
    public static void main(String[] args) {

        // type conversion (widening) (implicit conversion)
        int integernumber = 20;
        float floatnumber = integernumber;
        System.out.println(floatnumber);

        // type casting (explicity conversion)
        float secondFloatnumber = 20.5f;
        int secondIntnumber = (int) secondFloatnumber;
        System.out.println(secondIntnumber);

        // 10 + 10 = 20
        // (int)"20"+ (int)"30":20+30 +50

    }
}
