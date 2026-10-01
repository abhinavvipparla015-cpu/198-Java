
class Developer {
    public void work() {
        System.out.println("Developer: Writes and maintains code.");
    }
    public void submitReport() {
        System.out.println("Developer: Submits coding progress report.");
    }
}
class Tester  {
    public void work() {
        System.out.println("Tester: Tests the software and finds bugs.");
    }
    public void submitReport() {
        System.out.println("Tester: Submits testing and bug report.");
    }
}
class Manager  {
    public void work() {
        System.out.println("Manager: Manages the team and coordinates projects.");
    }
    public void submitReport() {
        System.out.println("Manager: Submits project status report.");
    }
}
public class Workable{
    public static void main(String[] args) {
        Developer e1 = new Developer();
        Tester  e2 = new Tester();
        Manager e3 = new Manager();
            e1.work();
            e1.submitReport();
            System.out.println();
            e2.work();
            e2.submitReport();
            System.out.println();
            e3.work();
            e3.submitReport();
    }
}

