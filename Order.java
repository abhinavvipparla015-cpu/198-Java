class Canteen{
    void placeorder(String itemname){
        System.out.println("----------Order Details-----------");
        System.out.println("Item Name: "+itemname);
    }
    void placeorder(String itemname,int quantity){
        System.out.println("------------Order details---------");
        System.out.println("Item name: "+ itemname);
        System.out.println("Quantity: "+ quantity);
    }
    void placeOrder(String itemname, int quantity, String paymentMode){
         System.out.println("------------Order details---------");
        System.out.println("Item name: "+ itemname);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Payment method: "+paymentMode);
    }
}
public class Order {
    public static void main(String[] args){
        Canteen c=new Canteen();
        c.placeorder("Biryani");
        c.placeorder("Biryani", 2);
        c.placeOrder("Biryani", 02, "online");
    }
    
}
