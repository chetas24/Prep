package OOPs.Abstraction.example1;

public class Main
{
    public static void main(String[] args) {
        Employee manager = new Manager("John Doe", 6000, 1000);
        Employee programmer = new Programmer("Johnny Doe", 5000, 20, 25.0);

        manager.displayInfo();
        System.out.println("______________________");
        programmer.displayInfo();
    }
}