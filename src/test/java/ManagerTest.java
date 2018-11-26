import org.junit.Before;

import Staff.Employee;
import Staff.Management.Manager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Moss", 12345, 25000, "IT");
    }

    @Test
    public void managerHasName(){
        assertEquals("Moss", manager.getName());
    }

    @Test
    public void managerHasNINum(){
        assertEquals(12345, manager.getNINum());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(25000, manager.getSalary());
    }

    @Test
    public void managerHasDept(){
        assertEquals("IT", manager.getdeptName());
    }
}
