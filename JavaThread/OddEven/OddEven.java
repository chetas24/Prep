package JavaThread.OddEven;

public class OddEven {
    private int limit;
    private int number = 1;

    public OddEven(int limit) {
        this.limit = limit;
    }

    public synchronized void printOdd()
    {
        while (number <= limit) {
            if (number % 2 == 0) {
                try
                {
                    wait(); 
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " - " + number);
            number++;
            notify();
        }
    }
    public synchronized void printEven()
    {
        while (number <= limit) {
            if (number % 2 != 0) {
                try
                {
                    wait();
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " - " + number);
            number++;
            notify();
        }
    }
}
