package multiThreading;

public class InterThreadCommunication {

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();

        synchronized (t1){
            System.out.println("Main thread calling wait()........");
            t1.wait();
            System.out.println("Main thread got notification......");
        }
    }

}

class ThreadDemo extends Thread{
    int sum=0;
    @Override
    public void run() {
        synchronized (this){
            System.out.println("child thread start calculation.....");
            for(int i=0; i<10; i++){
                sum+=i;
            }
            System.out.println("sum is = "+sum);
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("child thread will give notification");
            this.notify();
        }
    }
}
