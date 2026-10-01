import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no. of digits:");
        int n=s.nextInt();
        int a=0,b=1,c;
        for(int i=0;i<=n;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        s.close();
    }
    
}
