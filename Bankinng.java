class Account {
    int acc_num;
    String customername;
    double balance;
    String acc_type;

    Account(int accno, String name, double bal, String type) {
        acc_num = accno;
        customername = name;
        balance = bal;
        acc_type = type;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited sucessfully");
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void transfer(Account receiver, double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println(amount + " transferred to " + receiver.customername);
        } else {
            System.out.println("Transfer failed: low balance");
        }
    }

    void display() {
        System.out.println("_____________________________________");
        System.out.println("Account number : " + acc_num);
        System.out.println("Customer Name : " + customername);
        System.out.println("Account Type :" + acc_type);
        System.out.println("Balance :" + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;
    SavingsAccount(int acc_no, String name, double bal, double rate) {
        super(acc_no, name, bal, "Savings");
        interestRate = rate;
    }
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest = " + interest);
    }
    void display() {
        super.display();
        System.out.println("Interest Rate " + interestRate + "%");
    }
}
class CurrentAccount extends Account {
    double overdraftlimit;
 CurrentAccount(int acc_no, String name, double bal, double limit) {
        super(acc_no, name, bal, "Current");
        overdraftlimit = limit;
    }
    void withdraw(double amount) {
        if (balance + overdraftlimit >= amount) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn sucessfully.");
        } else {
            System.out.println("overdraftlimit exceeded");
        }
    }
    void display() {
        super.display();
        System.out.println("overdraft limit : " + overdraftlimit);  
    }
}
public class Bankinng {
    public static void main(String args[]) {
        SavingsAccount s1 = new SavingsAccount(101, "Rahul", 10000, 5);
        CurrentAccount c1 = new CurrentAccount(102, "Swathi", 5000, 3000);
        System.out.println("Initial Account Details");
        s1.display();
        c1.display();
        System.out.println("\nDeposit");
        s1.deposit(2000);
        System.out.println("\nWithdraw");
        c1.withdraw(7000);
        System.out.println("\nIntrest Calculation");
        s1.calculateInterest();
        System.out.println("\nTransfer");
        s1.transfer(c1, 1000);
        System.out.println("\nfinal Account Details");
        s1.display();
        c1.display();
    }
}