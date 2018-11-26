import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import Staff.Management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Manager("Moss", 12345, 25000, "IT");

    }

    @Test
    public void managerAsEmployee(){
        assertEquals("Moss", employee.getName());
    }

    @Test
    public void employeeCanGetRaise(){
        employee.raiseSalary(500);
        assertEquals(25500, employee.getSalary(), 1);
    }

    @Test
    public void employeeCanGetBonus(){
        employee.payBonus();
        assertEquals(250, employee.getSalary(), 1);
    }

}
