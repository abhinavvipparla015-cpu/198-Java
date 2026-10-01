import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first num:");
        int a=s.nextInt();
        System.err.print("Enter second num:");
        int b=s.nextInt();
        System.out.print("Enter third num:");
        int c=s.nextInt();
        if(a>b && a>c)
            System.out.println(a+" is Largest");
        else if(b>a && b>c)
            System.out.println(b+" is Largest");
        else
            System.out.println(c+" is Largest");
        s.close();
    }
}
