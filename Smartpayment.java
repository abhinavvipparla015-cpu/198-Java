abstract class Payment {
    double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    abstract void pay();
    void displayAmount() {
        System.out.println("Payment Amount: " + amount);
    }
}
class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) {
        super(amount);
    }
    void pay() {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
class UPIPayment extends Payment {
    UPIPayment(double amount) {
       super(amount);
    }
    void pay() {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
public class Smartpayment {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(5000);
        p1.displayAmount();
        p1.pay();
        Payment p2 = new UPIPayment(2500);
        p2.displayAmount();
        p2.pay();
    }
}
