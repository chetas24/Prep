package Mock.Ludo;

import java.util.Random;

public class Ludo {
    private int occur = 10;
    private int start = 1;
    Boolean isPlayer1 = true;

    public synchronized void person1() {
        while (start <= occur) {
            if (isPlayer1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isPlayer1 = !isPlayer1;
            Random r = new Random();
            int dice = r.nextInt(6);
            System.out.println("Player 1 got: " + dice);
            start++;
            notify();
        }

    }

    public synchronized void person2() {
        while (start <= occur) {
            if (!isPlayer1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isPlayer1 = !isPlayer1;
            Random r = new Random();
            int dice = r.nextInt(6);
            System.out.println("Player 2 got: " + dice);
            start++;
            notify();
        }
    }
}
