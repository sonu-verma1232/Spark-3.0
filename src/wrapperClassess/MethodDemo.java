package wrapperClassess;

public class MethodDemo {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;
        System.out.println("Compare (10,10) => "+Integer.compare(a,b));

        Integer c = 80;
        Integer d = 30;
        System.out.println("Compare (80,30) => "+Integer.compare(c,d));

        Integer e = 30;
        Integer f = 80;
        System.out.println("Compare (30,80) => "+Integer.compare(e,f));
    }
}
