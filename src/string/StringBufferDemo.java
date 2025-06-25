package string;

public class StringBufferDemo {
    // StringBuffer is a class which allow changes(mutable) and it does not create a new object at each time.
    // StringBuffer is a thread safe

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("abc");
        sb.append(2);
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);

        System.out.println("--------------------------------------------------------------------");

        String s1 = "Sonu";
        String s2 = s1.concat("Verma");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        System.out.println("--------------------------------------------------------------------");
        StringBuffer sb1 = new StringBuffer("Sonu");
        StringBuffer sb2 = sb1.append("Verma");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1==sb2);

    }
}
