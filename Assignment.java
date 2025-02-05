import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        // add two integer number
        // byte a = 12;
        // byte b = 34;
        // int add = (a + b);
        // System.out.println("Addition of two numbers is " + add);

        // subtract two float number
        // float c = 12;
        // float d = 34;
        // float sub = (c - d);
        // System.out.println("Subtraction of two numbers is " + sub);

        // print the world (java is a programming language)
        // String world = "java is a programming language";
        // System.out.println(world);

        // what is the ASCII value FOR 66?
        // The ASCII value 66 corresponds to the letter "B".
        // Explanation: In the ASCII table, the uppercase letter "B" has a decimal value
        // of 66

        // char charexample = 66;
        // System.out.println(charexample);

        // give an example of logical operator ( ||, && )
        // boolean x = true;
        // boolean y = false;
        // System.out.println("OR:" + (x || y));
        // System.out.println("----------------------");
        // System.out.println("AND:" + (x && y));
        // System.out.println("----------------------");

        // give an example of bitwise operator (~)
        // int a = 5;
        // System.out.println("~ of a " + (~a));

        // give an example of Arithmetic operation ( + , % )

        // int a = 5;
        // int b = 3;
        // int add = a + b;
        // System.out.println("Addition of two numbers is " + add);

        // int a = 5;
        // int b = 3;
        // int mod = a % b;
        // System.out.println("mod " + (mod));

        // Give an example of Ternary operation ( check for eligible to vote or not)
        // int aga = 18;
        // String eligible = (aga >= 18) ? "can vote" : "cannot vote";
        // System.out.println(eligible);

        // give an example of pre-inc and post-dec (number:8)
        // int num = 8;
        // System.out.println("pre increment " + (++num));

        // int num = 8;git
        // System.out.println("post increment " + (num--));

        // give and example of Right Shift by 3 (nmuber=7)

        // int num = 7;
        // System.out.println("Right shift by 3 " + (num >> 3));

        // to check whether the person is eligible to vote or not

        // int age = 21;
        // if (age >= 18) {
        // System.out.println("you are eligible for voting");
        // } else {
        // System.out.println("you are not eligible for voting");
        // }

        // print the greater number among 3 numbers

        // int largest;
        // int a = 5;
        // int b = 10;
        // int c = 3;
        // if (a > b && a > c) {
        // largest = a;
        // } else if (b > a && b > c) {
        // largest = b;
        // } else {
        // largest = c;
        // }
        // System.out.println("largest number is " + largest);

        // make a simple calculator with operation ( +, -, / ,*) using switch case

        // int a = 15;
        // int b = 5;

        // char operation = '+';
        // switch (operation) {
        // case '+':
        // System.out.println("addition " + (a + b));
        // break;

        // case '-':
        // System.out.println("subtraction " + (a - b));
        // break;

        // case '/':
        // System.out.println("division " + (a / b));
        // break;

        // case '*':
        // System.out.println("multiplication" + (a * b));
        // break;

        // default:
        // System.out.println("invalid operation");
        // }

        // Ask a character from the use

        // Scanner Scanner = new Scanner(System.in);
        // System.out.println("enter you character:");

        // char character = Scanner.next().charAt(0);
        // System.out.println("display character:" + character);

        // Scanner.close();

        // ask a word from the user //java

        // Scanner Scanner = new Scanner(System.in);
        // System.out.println("enter you word:");

        // String character = Scanner.next();
        // System.out.println("display WORLD:" + character);

        // Scanner.close();

        // ask a sentence or string from the user

        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter you word:");

        String character = Scanner.nextLine();
        System.out.println("display WORLD:" + character);

        Scanner.close();
    }
}
