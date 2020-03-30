import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    Employee employee;


    @Before
    public void setUp(){
        manager = new Manager("Luke Melvin", "GB12345666", 50000, "Engineering");
    }

    @Test
    public void canGetName(){
        assertEquals("Luke Melvin", manager.getName());
    }

    @Test
    public void canSetName(){
        manager.setName("Lyndsey Fraser");
        assertEquals("Lyndsey Fraser", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("GB12345666", manager.getNiNumber());
    }

    @Test
    public void canSetNiNumber(){
        manager.setNiNumber("NewNum98765");
        assertEquals("NewNum98765", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(60000);
        assertEquals(60000, manager.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Engineering", manager.getDeptName());
    }

    @Test
    public void canSetDeptName(){
        manager.setDeptName("DevOps");
        assertEquals("DevOps", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(51000, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(500.00,
                manager.payBonus(), 0.01);
    }
}
