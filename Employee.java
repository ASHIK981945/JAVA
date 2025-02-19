public class Employee {

    // Attributes
    String Name;
    int Id;
    double salary;

    Employee(String _Name, int _Id, double _salary) {
        this.Name = _Name;
        this.Id = _Id;
        this.salary = _salary;
    }

    // method
    double calculateBonus() {
        return salary * 0.1;
    }

    double netsalary() {
        return salary + salary;
    }

    // display eemployee detali
    void displayEmployeeDetails() {
        System.out.println("Name:" + Name);
        System.out.println("id:" + Id);
        System.out.println("salary:" + salary);
        System.out.println("bonu salary:NPR:" + calculateBonus());
        System.out.println("net slary :NPR:" + netsalary());
    }

    public static void main(String[] args) {
        Employee em = new Employee("ashik", 1, 400);
        em.displayEmployeeDetails();
    }
}
