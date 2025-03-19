package Mock.Ludo;


public class Main {
    public static void main(String[] args) {
        Ludo dice = new Ludo();
        Thread player1thread = new Thread(new Runnable(){

            @Override
            public void run() {
                dice.person1();
            }
        });
        Thread player2thread = new Thread(new Runnable(){

            @Override
            public void run() {
                dice.person2();
            }
        });
        
        player1thread.start();
        player2thread.start();
    }
}

// 2 player
// dice = 6
// 