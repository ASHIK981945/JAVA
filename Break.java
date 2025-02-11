
// Break continue return 

public class Break {
    public static void main(String[] args) {

        // break example

        // for (int i = 0; i <= 10; i++) {
        // if (i == 4) {
        // System.out.println("you entered 4. Exiting...");
        // break;
        // }
        // System.out.println(i); // 0 1 2 3
        // }

        // continue Example
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {

                continue;
            }
            System.out.println(i);

        }

        // output 1 3 5 7 9

        // if ( condition1){
        // if(condition2){}

        // }
    }
}