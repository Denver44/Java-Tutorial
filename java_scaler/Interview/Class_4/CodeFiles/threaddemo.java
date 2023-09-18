public class threaddemo extends Thread{
    static int value=0;
    public void run(){
        value++;
        System.out.println(value);
        
    }

    public static void main(String[] args){
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating thread...");
        Thread thread1 = new threaddemo();

        System.out.println("Starting thread...");
        thread1.start();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        try{thread1.join();}catch(InterruptedException e){}

        Thread thread2 = new threaddemo();
        thread2.start();




    }
    
}
