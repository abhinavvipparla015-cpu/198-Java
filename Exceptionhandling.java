public class Exceptionhandling {
    public static void main(String[] args){
    int a=10;
    try{
        System.out.println("result="+(a/0));
    }
    catch (ArithmeticException e) {
        System.out.println("Cannot be divided by zero");
    }finally{
        System.out.println("This line is executed always");
    }
    }
}
