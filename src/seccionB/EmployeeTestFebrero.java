package seccionB;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(JUnit4.class)

public class EmployeeTestFebrero{
	Employee workerUSD = new Employee(100, "USD", 50, EmployeeType.Worker);
	Employee workerEUR = new Employee(100, "EUR", 50, EmployeeType.Worker);
	Employee supervisorUSD = new Employee(100, "USD", 50, EmployeeType.Supervisor);
	Employee supervisorEUR = new Employee(100, "EUR", 50, EmployeeType.Supervisor);
	Employee managerUSD = new Employee(100, "USD", 50, EmployeeType.Manager);
	Employee managerEUR = new Employee(100, "EUR", 50, EmployeeType.Manager);
    
	/*
	 --------------------------------
	|   PRUEBAS PARA EL METODO cs    |
	 --------------------------------
	*/
    
	
	//Test para Worker con salario en USD en Febrero
	@Test
	public void testCsWorkerInFebruary() {
	    assertEquals(100, workerUSD.cs(), 0.01);
	}
	
	// Test para Worker con salario en EUR en Febrero
	@Test
	public void testCsWorkerInFebruaryWithEuro() {
	    assertEquals(95, workerEUR.cs(), 0.01); 
	}
	
    // Test para Supervisor con salario en USD en Febrero
	@Test
    public void testCsSupervisorInFebruaryWithUSD() {
        assertEquals(117.5f, supervisorUSD.cs(), 0.01);
    }

    // Test para Supervisor con salario en EUR en Febrero
	@Test
    public void testCsSupervisorInFebruaryWithEuro() {
        assertEquals(112.5f, supervisorEUR.cs(), 0.01);
    }

    // Test para Manager con salario en USD en Febrero
	@Test
    public void testCsManagerInFebruaryWithUSD() {
        assertEquals(135f, managerUSD.cs(), 0.01);
    }

    // Test para Manager con salario en EUR en Febrero
	@Test
    public void testCsManagerInFebruaryWithEuro() {
        assertEquals(130f, managerEUR.cs(), 0.01);
    }

}


