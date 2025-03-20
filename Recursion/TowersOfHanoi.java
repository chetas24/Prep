package Recursion;

class Hanoi 
{
    public void towersOfHanoi(int n, char source, char target, char auxiliary)
    {
        // base case
        if(n == 1)
        {
            System.out.println("Move disk 1 from source " + source + " to target " + target);
            return;
        }
    
        towersOfHanoi(n - 1, source, auxiliary, target);
    
        System.out.println("Move disk " + n + " from source " + source + " to target " + target);
    
        towersOfHanoi(n - 1, auxiliary, target, source);
    }
}

public class TowersOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        Hanoi hanoi = new Hanoi();
        hanoi.towersOfHanoi(n, 'A', 'C', 'B');
    }
}
