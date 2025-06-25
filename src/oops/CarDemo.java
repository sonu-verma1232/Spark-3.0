package oops;

public class CarDemo {

    public static void main(String[] args) {

        Car c = new Car();
        c.setSpeed(40);
        c.setNumberOfTyers(4);

        System.out.println("Car has speed of "+c.getSpeed()+"Km/H. ");
        System.out.println("Car has "+c.getNumberOfTyers()+" tyres.");


    }

}
