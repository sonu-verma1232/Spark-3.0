package oops;

public class ClassDemo {
    int marks;
    String name;

    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        ClassDemo cd = new ClassDemo();
        cd.marks = 90;
        cd.name = "Sonu";

        System.out.println(cd.name);
        System.out.println(cd.marks);
        cd.printName();
    }
}
