package oops;

public class MethodOverridingDemo extends MethodOverriding{

    String name = "Sonu";

    public static void main(String[] args) {
        MethodOverridingDemo d =  new MethodOverridingDemo();
        d.notifyUser();
    }

    public void notifyUser(){
        greet();
    }

    @Override
    public void greet(){
        System.out.println("Hello "+name);
    }
}
