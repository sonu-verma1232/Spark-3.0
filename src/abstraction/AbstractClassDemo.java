package abstraction;

public class AbstractClassDemo extends AbstractClass{

    @Override
    public void sound() {
        System.out.println("sounding.......");
    }

    public void fly(){
        System.out.println("It is flying");
    }

    public static void main(String[] args) {
        AbstractClassDemo ad = new AbstractClassDemo();
        ad.fly();
        ad.eat();
        ad.sound();
    }

}
