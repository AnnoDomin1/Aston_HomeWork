import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class countFactorialTestForJUnit{
    @Test
    void FactorialisNull() {
        assertNotNull(Main.countFactorial(4), "Число не нулевое");
    }
    @Test
    void FactorialIsNegagivOrPositiv() {
        assertTrue(Main.countFactorial(4)>0 , "Число положительное");

    }

    @Test
    void FactorialIsInteger() {
        assertTrue(Main.countFactorial(4) % 1 == 0, "Число целое");
    }
    @Test
    void testCountFactorialForNumSevenTest() {
        assertEquals(5040,Main.countFactorial(7));
    }
    @Test
    void testCountFactorialForNumFiveTest() {
        assertEquals(6,Main.countFactorial(3));
    }
}