public class Operators {
    public static void main(String[] args) {

        // operator: operators are the symbol used to pertorm operation ( *,+, -, !=,==,
        // <,>)

        // operands:operands are the variables ;
        // (a+b) : a and b are operands, + is operator

        // 1 Arithmatic operator: performs mathematical caluculation . +,-,*,/
        // int a = 40;
        // int b = 20;
        // int addResult = a + b;
        // int subResult = a - b;
        // int diviResult = a / b;
        // System.out.println("addition:" + addResult);
        // System.out.println("subtraction:" + subResult);
        // System.out.println("divided:" + diviResult);

        // 2)Relational operator:compare between two or more then two values { <,>
        // ,==,<=,=>,!=}
        // int c = 30;
        // int d = 40;
        // System.out.println("c>d:" + (c > d));
        // System.out.println("c<d:" + (c < d));
        // System.out.println("C==d:" + (c == d));
        // System.out.println("c<=d" + (c <= d));
        // System.out.println("c=>d" + (c >= d));
        // System.out.println("c!=d" + (c != d));

        // 3.logical operation: operation on boolen values eg{ and &&, or || ,NOT !}

        // boolean x = true;
        // boolean y = false;
        // System.out.println("AND:" + (x && y));
        // System.out.println("----------------------");
        // System.out.println("OR:" + (x || y));
        // System.out.println("----------------------");
        // System.out.println("NOT:" + (!x));
        // System.out.println("----------------------");

        // 4) Assignment Operator : it is used to assign the values (+=,-=,/=,*=,%=)

        // int f = 2;
        // int g = 3;
        // System.out.println("f+=g :" + (f += g));
        // System.out.println("----------------------");
        // System.out.println("f-=g :" + (f -= g));
        // System.out.println("----------------------");
        // System.out.println("f/=g :" + (f /= g));
        // System.out.println("----------------------");
        // System.out.println("f*=g :" + (f *= g));
        // System.out.println("----------------------");
        // System.out.println("f%=g :" + (f %= g));
        // System.out.println("----------------------");

        // 5)Ternary operator:
        // syntax (condition) ? "if true" : "if false"

        // int k = 2;
        // int l = 5;
        // String result = (k > l) ? "k is greater than l" : "k is smaller than l";
        // System.out.println(result);

        // 6) Bitwise Operator : operation on bits
        // operators : AND & , OR | , XOR ^ , COMPLIMENT ~ ,Left shift<< ,right shift >>
        // , >>> (Zero fill right shift)

        // ( 8 4 2 1 )
        // ( 1 0 0 1 )

        int m = 9; // 1001
        int n = 10; // 1010

        System.out.println(" the bitwise AND m&n:" + (m & n)); // 1000
        System.out.println("----------------------");
        System.out.println("m|n:" + (m | n));
        System.out.println("----------------------");
        System.out.println("m^n:" + (m ^ n));
        System.out.println("----------------------");
        System.out.println("~m:" + (~m));
        System.out.println("----------------------");
        System.out.println("m<<1:" + (m << 1));
        System.out.println("----------------------");
        System.out.println("m>>1:" + (m >> 1));
        System.out.println("----------------------");
        System.out.println("m>>>1:" + (m >>> 1));
        System.out.println("----------------------");

    }
}