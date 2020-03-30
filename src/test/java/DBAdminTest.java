import org.junit.Before;
import org.junit.Test;

import staff.Employee;
import techStaff.DBAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DBAdminTest {

    Employee employee;
    DBAdmin DBAdmin;

    @Before
    public void setUp(){
        DBAdmin = new DBAdmin("Lyndsey Fraser", "EDI123456", 60000);
    }

    @Test
    public void canGetName(){
        assertEquals("Lyndsey Fraser", DBAdmin.getName());
    }

    @Test
    public void canSetNamePass(){
        DBAdmin.setName("Luke Melvin");
        assertEquals("Luke Melvin", DBAdmin.getName());
    }

    @Test
    public void canSetNameNullFail(){
        DBAdmin.setName(null);
        assertEquals("Lyndsey Fraser", DBAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("EDI123456", DBAdmin.getNiNumber());
    }

    @Test
    public void canSetNiNumber(){
        DBAdmin.setNiNumber("NewNum98765");
        assertEquals("NewNum98765", DBAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000, DBAdmin.getSalary());
    }

    @Test
    public void canSetSalary(){
        DBAdmin.setSalary(75000);
        assertEquals(75000, DBAdmin.getSalary());
    }

    @Test
    public void canRaiseSalaryPass(){
        DBAdmin.raiseSalary(1000);
        assertEquals(61000, DBAdmin.getSalary());
    }

    @Test
    public void canRaiseSalaryFail(){
        DBAdmin.raiseSalary(-46000);
        assertEquals(60000, DBAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(600.00,
                DBAdmin.payBonus(), 0.01);
    }


}
