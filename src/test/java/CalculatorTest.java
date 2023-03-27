import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;
    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void addNumbers(){
        assertEquals(16.10, calc.add(5.55,10.55));
    }
    @Test
    public void subtractNumbers(){
        assertEquals(5, calc.subtract(5,10));
    }
    @Test
    public void multiplyNumbers(){
        assertEquals(58.55, calc.multiply(5.55,10.55),0.10);
    }
    @Test
    public void divideNumbers(){
        assertEquals(1.90, calc.divide(5.55,10.55),0.01);
    }
}
