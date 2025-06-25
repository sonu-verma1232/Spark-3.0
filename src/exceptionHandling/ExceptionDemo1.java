package exceptionHandling;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        m2();
    }

    public static void m2(){
        m3();
    }

    public static void m3(){
        m4();
    }

    public static void m4(){
       // System.out.println(10/0);   // runtime exception
        try {
            System.out.println(10/0);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
    }
}
