package seccionB;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(JUnit4.class)

public class EmployeeTestEnero{
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
    
	
	//Test para Worker con salario en USD en Enero
	@Test
	public void testCsWorkerInJanuary() {
	    assertEquals(164.33f, workerUSD.cs(), 0.01); 
	}

	// Test para Worker con salario en EUR en Enero
	@Test
	public void testCsWorkerInJanuaryWithEuro() {
	    assertEquals(159.33f, workerEUR.cs(), 0.01); 
	}
	
	
	// Test para Supervisor con salario en USD en Enero
	@Test
	public void testCsSupervisorInJanuaryWithUSD() {
	    assertEquals(181.83f, supervisorUSD.cs(), 0.01); 
	}

    // Test para Supervisor con salario en EUR en Enero
	@Test
    public void testCsSupervisorInJanuaryWithEuro() {
        assertEquals(176.83f, supervisorEUR.cs(), 0.01);
    }

    // Test para Manager con salario en USD en Enero
	@Test
    public void testCsManagerInJanuaryWithUSD() {
        assertEquals(199.33f, managerUSD.cs(), 0.01);
    }

    // Test para Manager con salario en EUR en Enero
	@Test
    public void testCsManagerInJanuaryWithEuro() {
        assertEquals(194.33f, managerEUR.cs(), 0.01);
    }

	
}


