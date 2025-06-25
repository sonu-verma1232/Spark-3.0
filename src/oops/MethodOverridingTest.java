package oops;

public class MethodOverridingTest {

    public static void main(String[] args) {

        System.out.println("--------------From Parent class--------------");
        MethodOverriding m = new MethodOverriding();
        m.greet();

        System.out.println("--------------From Child class--------------");
        MethodOverridingDemo md = new MethodOverridingDemo();
        md.notifyUser();

        System.out.println("--------------From Parent-child relation--------------");
        MethodOverriding m1 = new MethodOverridingDemo();
        m1.greet();

    }

}
