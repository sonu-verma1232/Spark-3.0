package exceptionHandling;

public class FinallyDemo3 {
    public static void main(String[] args) {
        int res = m1();
        System.out.println(res);
    }
    public static int m1(){
        try{
            System.out.println("try block");
         //   System.exit(0);  // to sutdown the JVM
            return 10;
        }
        catch (ArithmeticException ae)
        {
            System.out.println("catch block");
            return 22;
        }
        finally {
            System.out.println("finally block");
            return 99;
        }
    }
}
