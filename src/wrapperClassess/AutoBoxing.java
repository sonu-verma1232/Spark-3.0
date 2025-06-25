package wrapperClassess;

public class AutoBoxing {
    public static void main(String[] args) {
        int a = 10;
        Integer i = a;
        //auto-boxing => Conversion of primitive data type into its equivalent object implicitly
        // Auto-boxing is done at compile time by java compiler.
        System.out.println(i);
    }
}
