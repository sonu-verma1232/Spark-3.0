package exceptionHandling;

public class ExceptionDemo2 {

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
        try{
            //throw new ArithmeticException("Zero Divide");
            System.out.println(10/0);   // runtime exception
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
