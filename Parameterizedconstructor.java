public class Parameterizedconstructor {

    // Data member
    int length;
    int breadth;

    // parameterized constructor
    Parameterizedconstructor(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    void displayDetails() {
        System.out.println("length:" + (length));
        System.out.println("breadth:" + (breadth));
    }

    public static void main(String[] args) {
        Parameterizedconstructor parameterizedconstructor = new Parameterizedconstructor(12, 3);
        parameterizedconstructor.displayDetails();
    }
}