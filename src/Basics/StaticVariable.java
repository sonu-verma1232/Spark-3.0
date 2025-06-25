package Basics;

public class StaticVariable {

    static String name = "Sonu";
    // Static variable : For each and every object there will be only single copy of static variable

    public static void main(String[] args) {
        System.out.println(name);  // we can use static variable in static method without creating object of class

        System.out.println("-------------------------------------------");
        StaticVariable obj = new StaticVariable();
        System.out.println(obj.name);

        System.out.println("********************************************");
        StaticVariable obj1 = new StaticVariable();
        System.out.println(obj1.name);

        System.out.println("-------------------------------------------");
        obj.name = "Ram";
        System.out.println("After update: ");
        System.out.println(name);

        System.out.println("********************************************");
        System.out.println(obj1.name);

        System.out.println(StaticVariable.name);

    }
}
