package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {

        System.out.println("Before exception");
        System.out.println("Calculating........");
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("After calculation");
        System.out.println("Sonu");
        System.out.println("Verma");

    }

}
