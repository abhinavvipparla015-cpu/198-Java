import java.util.*;
class Customer{
    String name,location;
    private List<Order> orders=new ArrayList<>();
    Customer(String n,String l){
        this.name=n;
        this.location=l;
    }
    void randomize(){
        System.err.println(name+" : randomize() called");
    }
    void reconnect(){
        System.out.println(name +" :reconnect called ");
    }
    public void addOrder(Order o){
        orders.add(o);
    }
    void displayOrders(){
        System.out.println("Customer : "+name +"| location :"+location);
        for(Order o : orders)
            o.confirm();
    }
}
class Order{
    String date,number;
    Order(String d,String n){
        this.date=d;
        this.number=n;
    }
    void confirm(){
        System.out.println("Order "+number+" dated "+date+" confirmed.");
    }
    void close(){
        System.out.println("Order "+number+" closed.");
    }
}
class SpecialOrder extends Order{
    SpecialOrder(String d,String n){super (d,n);}
    public void confirm(){
        System.out.println("[Special] Order "+number+" confirmed ");
    }
    void dispatch(){
        System.out.println("[Special] Order "+number+" dispatched via priority courier. ");
    }
}
class NormalOrder extends Order{
    NormalOrder(String d,String n){super (d,n);}
    public void confirm(){
        System.out.println("[Normal] Order "+number+" confirmed ");
    }
    void dispatch(){
        System.out.println("[Normal] Order "+number+" dispatched via priority courier. ");
    }
    public void receive(){
        System.out.println("[Normal] Order "+number+" received by customer. ");
    }
}
public class DiagramDemo {
    public static void main(String[] args) {
        Customer c=new Customer("Ravi ","Hyderabad");
        c.randomize();
        c.reconnect();
        SpecialOrder so=new SpecialOrder("2026-06-01", "ORD-101");
        NormalOrder no= new NormalOrder("2026-06-02","ORD-102");
        c.addOrder(so);
        c.addOrder(no);
        c.displayOrders();
        so.dispatch();
        so.close();
        no.dispatch();
        no.receive();
        no.close();
    }
}
