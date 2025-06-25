package string;

public class StringDemo {
    public static void main(String[] args) {
        // String is not thread safe.
        String str = new String("Sonu");
        // jb hm new keyword ka use krke string/object bnate hai to vo object/string heap and SCP dono jagah bante hai pr jb hm multiple time same string bnate hai to heap me hr time ek nayi string bnti hai pr SCP m nhi

        String str1 = "Ram";    // it is called string literal
        // jo string/object hm string literal ka use krke bnayege vo STRING CONSTANT POOL(which is a small area in heap) m store hote hai aur ye keval ek hi string bnata hai

        System.out.println(str);
        System.out.println(str1);

        System.out.println(str+str1);

    }
}
