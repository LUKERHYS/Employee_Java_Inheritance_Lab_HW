import org.junit.Before;
import org.junit.Test;

import staff.Employee;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Employee employee;
    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Luke Rhys Melvin", "GB12345666", 45000);
    }

    @Test
    public void canGetName(){
        assertEquals("Luke Rhys Melvin", developer.getName());
    }

    @Test
    public void canSetName(){
        developer.setName("Lyndsey Fraser");
        assertEquals("Lyndsey Fraser", developer.getName());
    }

    @Test
    public void canSetNameNullFail(){
        developer.setName(null);
        assertEquals("Luke Rhys Melvin", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("GB12345666", developer.getNiNumber());
    }

    @Test
    public void canSetNiNumber(){
        developer.setNiNumber("NewNum98765");
        assertEquals("NewNum98765", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(45000, developer.getSalary());
    }

    @Test
    public void canSetSalary(){
        developer.setSalary(60000);
        assertEquals(60000, developer.getSalary());
    }

    @Test
    public void canRaiseSalaryPass(){
        developer.raiseSalary(1000);
        assertEquals(46000, developer.getSalary());
    }

    @Test
    public void canRaiseSalaryFail(){
        developer.raiseSalary(-46000);
        assertEquals(45000, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(450.00,
                developer.payBonus(), 0.01);
    }


}
