import java.util.Scanner;
class Hostel{
    void bookRoom(int roomno){
        System.out.println("Room num: "+roomno);
    }
    void bookRoom(int roomno,String studentname){
        System.out.println("Room num: "+roomno);
        System.out.println("Student Name: "+studentname);
    }
    void bookRoom(int roomno,String studentname,int days){
        System.out.println("Room num: "+roomno);
        System.out.println("Student Name: "+studentname);
        System.out.println("No. of Days: "+days);
    }
}
public class Booking {
    public static void main(String[] args){
        System.out.println("1->for only room num");
        System.out.println("2->for room num & student name");
        System.out.println("3->for room num, student name & no. of days");
        Scanner s= new Scanner(System.in);
        System.out.println("Enter choice: ");
        int n=s.nextInt();
        Hostel h=new Hostel();
        switch (n) {
            case 1:h.bookRoom(101);break;
            case 2:h.bookRoom(101, "Ravi");break;
            case 3:h.bookRoom(101,"Ravi", 30);break;
            default:break;
        }
        s.close();
    }
}
