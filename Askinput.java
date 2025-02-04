import java.util.Scanner;

public class Askinput {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter you number :");

        int intnumber = Scanner.nextInt();
        float floatnumber = Scanner.nextFloat();
        double doublenumber = Scanner.nextDouble();

        System.out.println("the enter integer number is :" + intnumber);
        System.out.println("the enter float number is :" + floatnumber);
        System.out.println("the enter double number is :" + doublenumber);

        Scanner.close();

    }
}
