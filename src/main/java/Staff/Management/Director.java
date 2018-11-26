package Staff.Management;
import Staff.Employee;
import Staff.Management.Manager;

public class Director extends Employee {

    private double budget;

    public Director(String name, int NINum, double salary) {
        super(name, NINum, salary);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

}
