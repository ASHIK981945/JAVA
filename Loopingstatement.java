import java.util.Scanner;

public class Loopingstatement {
    public static void main(String[] args) {
        // for loop
        // syntax:

        // while
        // syntax :
        // while (condition){ expression}
        // do while
        // syntax:
        // do {// expression}while(condition);

        // for (int i = 0; i <= 10; ++i) {
        // System.out.println(i);
        // }

        // Scanner Scanner = new Scanner(System.in);
        // System.out.println("enter you number :");
        // int num = Scanner.nextInt();

        // for (int i = 1; i <= 10; i++) {
        // // System.out.println(num * i + "");
        // System.out.println(num + "*" + i + "=" + (num * i));
        // }

        // Scanner.close();

        // check the odd and even
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter you number :");
        int number = Scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("the number is even:" + number);
        } else {
            System.out.println("the number is odd:" + number);
        }
        Scanner.close();

    }
}
