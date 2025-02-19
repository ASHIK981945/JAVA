public class Person {

    // data members
    String name;
    int age;
    Float salary;

    // parameterid constructor
    Person(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void displayPersonDetails() {
        System.out.println("name:" + (name));
        System.out.println("age" + (age));
        System.out.println("Salary" + (salary));
    }

    public static void main(String[] args) {
        Person person = new Person("ashik", 22, 22f);
        person.displayPersonDetails();

    }

}
