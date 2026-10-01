import java.util.Scanner;
public class Primepalindrome {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the num: ");
    int num = s.nextInt();
    int ori=num,rev=0;
    int count=0;
    while(num>0){
        int d=num%10;
        rev=rev*10+d;
        num=num/10;
    }
    if(ori==rev){
        for(int i=1;i<=ori;i++){
            if(ori%i==0){
                count++;
            }
        }  
    }
    if(ori==rev && count==2){
        System.out.println("The "+ori+" is prime palindrome");
    }
    else{
        System.err.println("Not a Prime Palindrome");
    }
    s.close();
    }
}


