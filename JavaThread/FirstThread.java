package JavaThread;

public class FirstThread extends Thread {
    @Override
    public void run()
    {
        System.out.println("Thread is Running");
    }
    public static void main(String[] args) {
        FirstThread thread = new FirstThread();
        thread.start();
    }
}
