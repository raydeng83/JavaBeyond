package oop;

/**
 * Created by Le on 11/5/2016 0005.
 */
public class Manager extends TeamMember {
    public static final double DEFAULT_SALARY = 150000;

    private double salary = DEFAULT_SALARY;

    public Manager(){}
    public Manager(String name) {
        this(name, DEFAULT_SALARY);
    }
    public Manager(String name, double salary){
        super(name);
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary / 24;
    }
}
