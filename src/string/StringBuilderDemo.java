package string;

public class StringBuilderDemo {
    // StringBuilder is a class which is mutable.
    // It is not thread safe.

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("abc");
        StringBuilder s1 = s.append("xyz");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s==s1);

    }
}
