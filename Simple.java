import java.util.Scanner;
class Student{
    String name;
    int age;
    Student(String n,int a){
        this.name = n;
        this.age = a;
    }
}

public class Simple{
    public static void main(String[] args){
       // Student s1 = new Student("Abhinav",19);
       // System.out.println("Student Name : "+s1.name);
       // System.out.println("Student Age : "+s1.age);
       Scanner s = new Scanner(System.in);
       System.out.print("Enter Student name:");
       String name = s.nextLine();
       System.out.print("Enter Student age:");
       int age = s.nextInt();
        Student student = new Student(name, age);
        System.out.println("Student name: "+student.name);
        System.out.println("Student age: "+student.age);
        s.close();
    }
}