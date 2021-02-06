package calculator;

import org.junit.Assert;
import org.junit.Test;


public class OperationTest {

    private Operation operation = new Operation();

    @Test
    public void plus() {
      int actual = operation.plus(5, 10);
      int expected = 15;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void minus() {
        int actual = operation.minus(15, 10);
        int expected = 5;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void times() {
        int actual = operation.times(5, 10);
        int expected = 50;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void divide() {
        double actual = operation.divide(10, 5);
        double expected = 2.0;
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void pow() {
        int actual = operation.pow(3, 3);
        int expected = 27;
        Assert.assertEquals(expected, actual);
    }
}