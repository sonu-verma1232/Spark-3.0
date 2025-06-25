package abstraction;

public class InterfaceClassDemo implements InterfaceClass{
    @Override
    public void sound() {
        System.out.println("Kuu-Kuu..........");
    }

    @Override
    public void eat() {
        System.out.println("eating..........");
    }
}

class Test{
    public static void main(String[] args) {
        InterfaceClassDemo id = new InterfaceClassDemo();
        id.sound();
        id.eat();
    }
}