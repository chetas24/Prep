package Mock;

import java.util.Random;

public class DiceGame {
    private static final Object dice = new Object(); // Lock object for synchronization

    static class Player extends Thread {
        private int playerNumber;

        public Player(int playerNumber) {
            this.playerNumber = playerNumber;
        }

        public int count = 5;
        @Override
        public void run() {
            try {
                int current = 1;
                while (current < count) {
                    synchronized (dice) {
                        current++;
                        // Roll the dice
                        rollDice(playerNumber);

                        // Notify the other player that it's their turn
                        dice.notify();

                        // Make the current player wait for their turn
                        dice.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void rollDice(int player) {
            Random rand = new Random();
            int roll = rand.nextInt(6) + 1;  // Generates a number between 1 and 6
            System.out.println("Player " + player + " rolled a " + roll);
        }
    }

    public static void main(String[] args) {
        // Create two players
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Player player3 = new Player(3);
        Player player4 = new Player(4);
        Player player5 = new Player(5);


        // Start the player threads
        player1.start();
        player2.start();
        player3.start();
        player4.start();
        player5.start();

        // Begin the game by notifying player1 to start
        synchronized (dice) {
            dice.notify();  // Notify player 1 to roll the dice
        }
    }
}
