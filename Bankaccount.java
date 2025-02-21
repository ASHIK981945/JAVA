public class Bankaccount {

    int accountnumber;
    String accountname;
    double balance;

    Bankaccount(int accountnumber, String accountname, double balance) {
        this.accountnumber = accountnumber;
        this.accountname = accountname;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // balance = balance + amount
            System.out.println("Desposited Amount NPR:" + amount);
        } else {
            System.out.println("Invlid amount");
        }
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // // balance = balance - amount
            System.out.println("withdraw Amount NPR:" + amount);
        } else if (amount > 0) {
            System.out.println("insufficient balance");
        } else {
            System.out.println("Invlid amount");
        }
    }

    // display balance methods
    void displaybalance() {
        System.out.println("Account holder name:" + accountname);
        System.out.println("balance" + balance);

    }

    public static void main(String[] args) {
        Bankaccount bankaccount1 = new Bankaccount(100, "ashik", 23);
        bankaccount1.deposit(0);
        bankaccount1.withdraw(12);
        bankaccount1.displaybalance();

    }

}

//static keyword