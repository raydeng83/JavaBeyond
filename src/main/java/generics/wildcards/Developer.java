package generics.wildcards;

/**
 * Created by Le on 11/5/2016 0005.
 */
public class Developer extends TeamMember {

    public static final double DEFAULT_SALARY = 120000;

    private double salary = DEFAULT_SALARY;

    public Developer(String name) {
        this(name, DEFAULT_SALARY);
    }

    public Developer(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Salaried{name=%ssalary=%s} %s",
                getName(), salary, super.toString());
    }
}
