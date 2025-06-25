package multiThreading;

public class ThreadPriority {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadByRunnableInterface(),"t1");
        Thread t2 = new Thread(new ThreadByRunnableInterface(),"t2");
        Thread t3 = new Thread(new ThreadByRunnableInterface(),"t3");

        System.out.println("Main thread priority : "+Thread.currentThread());
        System.out.println("Priority of t1 : "+t1.getPriority());

        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("-------------After setting the priority of thread-------------------");
        System.out.println("Priority of t1 : "+t1.getPriority());
        System.out.println("Priority of t2 : "+t2.getPriority());
        System.out.println("Priority of t3 : "+t3.getPriority());
    }

}
