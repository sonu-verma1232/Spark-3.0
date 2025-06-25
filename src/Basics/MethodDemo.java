package Basics;

public class MethodDemo {
    public static void main(String[] args) {
        print();
        System.out.println(samosa());
        display("Sonu");
        display("Sonu",21);
        int value = sum(5,6);
        System.out.println(value);
    }

    // method with no return and no parameter
    public static void print(){
        System.out.println("Hello bhai............");
    }

    // method with return and no parameter
    public static int samosa(){
        return 2;
    }

    //method with no return and with parameter
    public static void display(String name){
        System.out.println("Name of student = "+name);
    }

    public static void display(String name, int age){
        System.out.println("Name of student = "+name+" and age is = "+age);
    }

    //method with return and with parameter

    public static int sum(int num1,int num2){
        int add = num1+num2;
        return add;
    }

}
