package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int NINum, double salary, String deptName){
        super(name, NINum, salary);
        this.deptName = deptName;
    }

    public String getdeptName(){
        return this.deptName;
    }

}
