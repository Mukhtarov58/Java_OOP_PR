package Seminars.Sem_1;

public class Worker extends Person{
    private double salary;

    public Worker(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Worker(String name) {
        this(name, 100.0);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + salary;
    }

}
