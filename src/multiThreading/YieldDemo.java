package multiThreading;

class MyThread extends Thread{

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            // call yield method to give chance
            Thread.yield();
        }
    }
}


public class YieldDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();

        Thread.sleep(2000);
        for(int i=0; i<5; i++){
            System.out.println("Main Thread");
        }
    }
}
