import org.testng.Assert;

import static org.testng.Assert.*;

public class countFactorialTestForTestNG {
    boolean isNotNegative = true;
    boolean isInteger = true;
    @org.testng.annotations.Test
    public void FactorialisNull() {
        Assert.assertNotNull(Main.countFactorial(4), "Число не нулевое");
    }
    @org.testng.annotations.Test
    public void FactorialIsNegagivOrPositiv() {
        Assert.assertEquals(isNotNegative, Main.countFactorial(4)>0);
    }
    @org.testng.annotations.Test
    public void FactorialIsInteger() {
        Assert.assertEquals(isInteger, Main.countFactorial(4) % 1 == 0);
    }
    @org.testng.annotations.Test
    public void CountFactorialForNumSevenTest() {
        Assert.assertEquals(5040,Main.countFactorial(7));
    }
    @org.testng.annotations.Test
    public void CountFactorialForNumFiveTest() {
        Assert.assertEquals(6,Main.countFactorial(3));
    }

}

