package Basics;

public class InstanceVariable {
    String name = "Sonu";
    // Instance variable : For each and every object there will be separate copy of instance variable

    public static void main(String[] args) {
        // System.out.println(name);        // it give error because we can't use instance variable directly in static method

        InstanceVariable obj = new InstanceVariable();

        System.out.println(obj.name);

//         System.out.println(this.name);  // error:non-static variable this cannot be referenced from a static context

        obj.name = "Ram";
        System.out.println(obj.name);

        System.out.println("----------------------------------------------------");
        InstanceVariable obj1 = new InstanceVariable();
        System.out.println(obj1.name);
        System.out.println("***********************************************");
        System.out.println(obj);
        System.out.println(obj1);

    }
}
