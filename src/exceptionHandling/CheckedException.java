package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

    public static void main(String[] args) {

        System.out.println("Before exception");
        System.out.println("Calculating........");
        try{
            File file = new File("demo.text");
            Scanner sc = new Scanner(file);
        }
        catch (FileNotFoundException fe){
            fe.printStackTrace();
        }
        System.out.println("After calculation");
        System.out.println("Sonu");
        System.out.println("Verma");

    }

}
