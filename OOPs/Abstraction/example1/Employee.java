package OOPs.Abstraction.example1;

abstract class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();
}
