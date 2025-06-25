package multiThreading;

class ThreadByRunnableInterface implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Child Thread "+i);
        }
    }
}


public class ThreadByRunnableInterfaceDemo {

    public static void main(String[] args) {

        ThreadByRunnableInterface tr = new ThreadByRunnableInterface();
        Thread t = new Thread(tr);
        t.start();

        for(int i=0; i<5; i++){
            System.out.println("Main thread "+i);
        }

    }

}
