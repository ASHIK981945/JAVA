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
        int largest;
        int a = 5;
        int b = 10;
        int c = 3;
        if (a > b && a > c) {
            largest = a;
        } else if (b > a && b > c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("largest number is " + largest);

        // make a simple calculator with operation ( +, -, / ,*) using switch case

        // char operator;
        // Double number1, number2, result;

        // // create an object of Scanner class
        // Scanner input = new Scanner(System.in);

        // // ask users to enter operator
        // System.out.println("Choose an operator: +, -, *, or
        // /");operator=input.next().charAt(0);

        // // ask users to enter numbers
        // System.out.println("Enter first number");number1=input.nextDouble();

        // System.out.println("Enter second number");number2=input.nextDouble();

        // switch(operator)
        // {

        // // performs addition between numbers
        // case '+':
        // result = number1 + number2;
        // System.out.println(number1 + " + " + number2 + " = " + result);
        // break;

        // // performs subtraction between numbers
        // case '-':
        // result = number1 - number2;
        // System.out.println(number1 + " - " + number2 + " = " + result);
        // break;

        // // performs multiplication between numbers
        // case '*':
        // result = number1 * number2;
        // System.out.println(number1 + " * " + number2 + " = " + result);
        // break;

        // // performs division between numbers
        // case '/':
        // result = number1 / number2;
        // System.out.println(number1 + " / " + number2 + " = " + result);
        // break;

        // default:
        // System.out.println("Invalid operator!");
        // break;
        // }

        // input.close();

    }
}
