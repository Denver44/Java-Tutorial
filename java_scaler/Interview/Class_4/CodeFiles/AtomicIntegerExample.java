import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
    private static AtomicInteger count = new AtomicInteger(0);

    public static int incrementAndGet() {
        return count.incrementAndGet();
    }

    public static int getCount() {
        return count.get();
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        AtomicCounter.incrementAndGet();
        
    }
    
}

public class AtomicIntegerExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        

        for(int i = 0; i < 1000; i++) {
            executorService.submit(new Task2());
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final Count is : " + AtomicCounter.getCount());
    }
}