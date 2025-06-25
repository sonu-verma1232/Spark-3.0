package exceptionHandling;

public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println( div(10,2));
        System.out.println(div(10,0));
    }

    public static int div(int div, int divisor){
        if(divisor == 0)
        {
            throw new ArithmeticException("Can not divide by zero");
        }
        return div/divisor;
    }
}
