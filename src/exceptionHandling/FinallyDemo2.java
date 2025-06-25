package exceptionHandling;

public class FinallyDemo2 {
    public static void main(String[] args) {
          m1();
    }
    public static void m1(){
        try{
            System.out.println("try block");
            return;
        }
        catch (ArithmeticException ae)
        {
            System.out.println("catch block");
        }
        finally {
            System.out.println("finally block");
        }
    }
}
