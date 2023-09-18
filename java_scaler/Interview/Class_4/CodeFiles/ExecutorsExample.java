import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableImplement implements Runnable{

    public void run(){
        System.out.println("Hello");
    }

}
public class ExecutorsExample {
    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service...");
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        System.out.println("Creating a Runnable...");
        Runnable runnable1 = new RunnableImplement();
        Runnable runnable2 = new RunnableImplement();
        Runnable runnable3 = new RunnableImplement();

        System.out.println("Submit the task specified by the runnable to the executor service.");
        executorService.submit(runnable1);

        executorService.submit(runnable2);

        executorService.submit(runnable3);

        
        System.out.println("Shutting down the executor");
        executorService.shutdown();
    }
}