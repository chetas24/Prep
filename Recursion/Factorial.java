package Recursion;

public class Factorial {

    public long factorial(long number)
    {
        if(number <= 1)  // base case
        {
            return 1;  // 0! = 1 and 1! = 1
        }
        else
        {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        for(int counter = 0; counter < 10; counter++)
        {
            System.out.printf("%d! = %d\n", counter, obj.factorial(counter));
        }
    }
}
