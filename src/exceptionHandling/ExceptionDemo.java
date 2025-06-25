package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int res = sum(a,b);
        System.out.println("Addition is : "+res);

        int value = div(a,b);
        System.out.println("Division is : "+value);
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int div(int a, int b){
        //return a/b;
        try {
            return a/b;
        }
        catch (Exception e){
            System.out.println("Invalid Input");
            return 0;
        }
    }
}
