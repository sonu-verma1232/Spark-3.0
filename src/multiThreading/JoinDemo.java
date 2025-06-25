package multiThreading;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        // creating a thread using runnable instance
        Thread t = new Thread(new MyRunnable());

        // start thread
        t.start();


        t.join();  // it means first child thread is completed then main thread executed
        System.out.println("Work completed");


    }
}
