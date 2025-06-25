package oops;

public class InheritanceDemo extends Inheritance{

   public void printSum(int a , int b){
       System.out.println(sum(a,b));
   }

   public void printSub(int a, int b){
       System.out.println(sub(a,b));
   }

    public static void main(String[] args) {
        InheritanceDemo demo = new InheritanceDemo();
        demo.printSub(6,4);
        demo.printSum(6,8);
    }

}
