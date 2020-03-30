import org.junit.Before;
import org.junit.Test;
import staff.Director;
import staff.Employee;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Employee employee;
    Manager manager;
    Director director;

    @Before
    public void setUp(){
        director = new Director("Luke Melvin", "GB12345666", 500000, "Engineering", 1000000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Luke Melvin", director.getName());
    }

    @Test
    public void canSetName(){
        director.setName("Lyndsey Fraser");
        assertEquals("Lyndsey Fraser", director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("GB12345666", director.getNiNumber());
    }

    @Test
    public void canSetNiNumber(){
        director.setNiNumber("NewNum98765");
        assertEquals("NewNum98765", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(500000, director.getSalary());
    }

    @Test
    public void canSetSalary(){
        director.setSalary(600000);
        assertEquals(600000, director.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Engineering", director.getDeptName());
    }

    @Test
    public void canSetDeptName(){
        director.setDeptName("DevOps");
        assertEquals("DevOps", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(501000, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(5000.00, director.payBonus(), 0.01);
    }
}
