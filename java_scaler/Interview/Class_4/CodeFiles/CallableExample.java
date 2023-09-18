import java.util.Random;
import java.util.concurrent.*;

public class CallableExample implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
    
        Thread.sleep(4000);
        return new Random().nextInt();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> future = es.submit(new CallableExample());
        System.out.println("I have reached here quite early and I am waiting");
        System.out.println(future.get()); // blocking operation


    }
 
}