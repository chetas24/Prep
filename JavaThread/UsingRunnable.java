package JavaThread;

public class UsingRunnable implements Runnable{
    public void run()
    {
        System.out.println("Thread Running: " + Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        Thread t1 = new Thread(new UsingRunnable());
        t1.start();
    }
}
