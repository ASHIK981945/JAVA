public class Operators {
    /**
     * @param args
     */
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

        // int m = 9; // 1001
        // int n = 10; // 1010

        // System.out.println(" the bitwise AND m&n:" + (m & n)); // 1000
        // System.out.println("----------------------");
        // System.out.println("m|n:" + (m | n));
        // System.out.println("----------------------");
        // System.out.println("m^n:" + (m ^ n));
        // System.out.println("----------------------");
        // System.out.println("~m:" + (~m));
        // System.out.println("----------------------");
        // System.out.println("m<<1:" + (m << 1));
        // System.out.println("----------------------");
        // System.out.println("m>>1:" + (m >> 1));
        // System.out.println("----------------------");
        // System.out.println("m>>>1:" + (m >>> 1));
        // System.out.println("----------------------");

        // post increment and decrement operator

        // int v = 5;
        // System.out.println("post increment operator" + v++);
        // System.out.println("----------------------");
        // System.out.println("only one values" +v);
        // System.out.println("----------------------");

        // int d = 5;
        // System.out.println("post decrement operator" + d--);
        // System.out.println("----------------------");
        // System.out.println("only one values" + d);
        // System.out.println("----------------------");

        // pre-increment and decrement operator

        // int b = 5;
        // System.out.println("pre-increment operator" + ++b);
        // System.out.println("----------------------");
        // System.out.println("only one values" +b);
        // System.out.println("----------------------");

        // int a = 5;
        // System.out.println("pre-decrement operator" + --a);
        // System.out.println("----------------------");
        // System.out.println("only one values" +a);
        // System.out.println("----------------------");

        // shift operator: used to manipulate the bits
        // left shift (<<): shifts the bits to the left and
        // fills 0 on voids left as a result. The left shift operator essentially
        // multiplies

        // 101
        // 0000 0101
        // left-shift: 0 101* (*=0)
        // output 0000 1010 (10)

        // int z = 5;
        // int leftshiftresult = (z << 2);
        // System.out.println("left shift operator" + (leftshiftresult));
        // System.out.println("----------------------");

        // right shift(>>) : shifts the bits to the right and fills 0 on voids right as
        // a result.
        // The right shift operator essentially divides by 2

        // int a = 5;
        // int rightshiftresult = (a >> 1);
        // System.out.println("right shift operator" + (rightshiftresult));
        // System.out.println("----------------------");

    }
}