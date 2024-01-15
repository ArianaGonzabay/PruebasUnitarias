package seccionA;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculationTest {

    @Test
    public void testFindMax() {
        assertEquals(4, Calculation.findMax(new int[] {1, 3, 4, 2}));
        assertEquals(-1, Calculation.findMax(new int[] {-12, -1, -3, -4, -2}));
        assertEquals(8, Calculation.findMax(new int[] {-5, -8, 1, 4, 8, -2}));
        assertEquals(0, Calculation.findMax(new int[] {-3, -10, 0, -7}));
        assertEquals(6, Calculation.findMax(new int[] {-6, -4, 6, 2, -3}));
    }
}
