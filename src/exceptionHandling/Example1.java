package exceptionHandling;

import java.io.File;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        System.out.println("Before exception");
        System.out.println("Calculating........");
        try{
            System.out.println("Still calculating.....1");
            System.out.println("Still calculating.....2");
            System.out.println("Still calculating.....3");
            File file = new File("demo.text");
            Scanner sc = new Scanner(file);
            System.out.println("Still calculating.....4");
            System.out.println("Still calculating.....5");
        }
        catch (Exception e){
            System.out.println("Catch working");
            System.out.println(e);
        }
        System.out.println("After calculation");
        System.out.println("Sonu");
        System.out.println("Verma");

    }


}
