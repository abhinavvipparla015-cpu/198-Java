import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=s.nextInt();
        System.out.print("Enter b:");
        int b=s.nextInt(); 
        int c=a;
        a=b;
        b=c;
        System.out.println("a="+a+" "+"b="+b );
        s.close();
    }
    
}
