public class DbOperation {

    @LogExecutionTime
    public void readDate() throws InterruptedException {

        Thread.sleep(2000);
        System.out.println("Task Completed !");

    }

}
