package multiThreading;

class ThreadByThreadClass extends Thread{

    // task
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Child Thread "+i);
        }
    }

}

public class ThreadByThreadClassDemo {

    public static void main(String[] args) {
        ThreadByThreadClass tt = new ThreadByThreadClass();    // main thread execute/read this
        tt.start();

        for(int i=0; i<8; i++){
            System.out.println("Main Thread "+i);
        }
    }

}


