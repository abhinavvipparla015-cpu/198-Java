import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the num:");
        int n= s.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if(count==2)
            System.out.println("The num "+n+" is Prime");
        else
            System.out.println("The nm is Composite");
        s.close();
    }
    
}
