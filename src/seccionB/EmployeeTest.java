package seccionB;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(JUnit4.class)
public class EmployeeTest{
	Employee workerUSD = new Employee(100, "USD", 50, EmployeeType.Worker);
	Employee workerEUR = new Employee(100, "EUR", 50, EmployeeType.Worker);
	Employee supervisorUSD = new Employee(100, "USD", 50, EmployeeType.Supervisor);
	Employee supervisorEUR = new Employee(100, "EUR", 50, EmployeeType.Supervisor);
	Employee managerUSD = new Employee(100, "USD", 50, EmployeeType.Manager);
	Employee managerEUR = new Employee(100, "EUR", 50, EmployeeType.Manager);
    
	/*
	 -----------------------------------------------
	|   PRUEBAS PARA EL METODO CalculateYearBonus   |
	 -----------------------------------------------
	*/

    // Test para Worker con salario en USD
	@Test
    public void testCalculateYearBonusWorkerUSD() {
        assertEquals(386f, workerUSD.CalculateYearBonus(), 0.01);
    }

    // Test para Worker con salario en EUR
	@Test
    public void testCalculateYearBonusWorkerEUR() {
        assertEquals(386f, workerEUR.CalculateYearBonus(), 0.01);
    }

    // Test para Supervisor con salario en USD
	@Test
    public void testCalculateYearBonusSupervisorUSD() {
        assertEquals(293f, supervisorUSD.CalculateYearBonus(), 0.01);
    }

    // Test para Supervisor con salario en EUR
	@Test
    public void testCalculateYearBonusSupervisorEUR() {
        assertEquals(288f, supervisorEUR.CalculateYearBonus(), 0.01);
    }

    // Test para Manager con salario en USD
	@Test
    public void testCalculateYearBonusManagerUSD() {
        assertEquals(486f, managerUSD.CalculateYearBonus(), 0.01);
    }

    // Test para Manager con salario en EUR
	@Test
    public void testCalculateYearBonusManagerEUR() {
        assertEquals(481f, managerEUR.CalculateYearBonus(), 0.01);
    }
	
}


