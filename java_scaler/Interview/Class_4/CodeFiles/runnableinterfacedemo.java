public class runnableinterfacedemo implements Runnable{

    public static void main(String[] args){

        System.out.println("Inside : " + Thread.currentThread().getName());

        

        Runnable runnable = new runnableinterfacedemo();

        Thread thread = new Thread(runnable);

        thread.start();
        try{thread.join(2000);}catch(InterruptedException e){ }

        Thread thread1 = new Thread(runnable);

        thread1.start();

        


        
    }

    @Override
    public void run() {
        String[] messages = {"If I can stop one heart from breaking,",
                "I shall not live in vain.",
                "If I can ease one life the aching,",
                "Or cool one pain,",
                "Or help one fainting robin",
                "Unto his nest again,",
                "I shall not live in vain"};

        System.out.println("Inside : " + Thread.currentThread().getName());

        for(String message: messages) {
            System.out.println(message);
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            
        }  
        
    }

    
}
