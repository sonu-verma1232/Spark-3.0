package exceptionHandling;

public class FinallyDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println("catch block");
        }
        finally
        {
            System.out.println("finally block");
        }
    }
}
