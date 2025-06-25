package multiThreading;

public class SetThreadName {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadByRunnableInterface());

        System.out.println("Main thread name = "+Thread.currentThread());

        // get name of the thread
        String t1_name = t1.getName();
        System.out.println("Default name = "+t1_name);

        // set thread name
        t1.setName("My-Thread-t1");
        System.out.println("After setting the name of default thread = "+t1.getName());

    }

}
