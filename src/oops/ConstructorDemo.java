package oops;

public class ConstructorDemo {

    // Constructor -> is a special method with same name as class.
    // -> it is automatically called when object is created.
    // -> it has no return type even void.
    // -> it is used to initialize the member of class.

    String name;
    int age ;

    //1. Default constructor or Non-parameterized constructor
    public ConstructorDemo(){
        System.out.println("Object is created................");
    }

    //2. Parameterized constructor
    public ConstructorDemo(String n, int age){
        name = n;
        this.age = age;
        System.out.println("Members are initialized.........");
    }

    public static void main(String[] args) {

        ConstructorDemo cd = new ConstructorDemo();
        ConstructorDemo cp = new ConstructorDemo("Sonu",22);
        System.out.println("Name : "+cp.name);
        System.out.println("Age : "+cp.age);

    }

}
