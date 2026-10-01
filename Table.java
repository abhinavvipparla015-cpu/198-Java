import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n=s.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
        s.close();
    }
    
}
