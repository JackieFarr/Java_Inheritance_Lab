package Staff;

public abstract class Employee {

    private String name;
    private int NINum;
    private double salary;

    public Employee(String name, int NINum, double salary){
        this.name = name;
        this.NINum = NINum;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getNINum(){
        return this.NINum;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double raiseAmount){
        if (raiseAmount >= 0) {
            this.salary += raiseAmount;
        }
    }

    public double payBonus(){
        return this.salary /= 100;
    }
}
