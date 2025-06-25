package multiThreading;

class Multiple extends Thread{

    MySychronization ms = new MySychronization();

    @Override
    public void run() {

        ms.m1();

    }
}

class MySychronization {
    int arr[] = {1,2,3,4,5};
    int sum =0;
    public synchronized void m1(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            sum += arr[i];
           // System.out.println("Sum of array for thread "+sum+" "+Thread.currentThread().getName());
        }

        System.out.println("sum : "+sum);
    }
}



public class MultipleThread {

    public static void main(String[] args) {
        Multiple t1 = new Multiple();
        Multiple t2 = new Multiple();
        t1.start();
        t2.start();
    }



}
