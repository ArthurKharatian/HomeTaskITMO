package patterns.facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class FacadeTest {
     private final Facade facade = new Facade();
    @Test
    public void startCar1() {
        boolean actual = facade.startCar();
        boolean expected = true;

        assertEquals(expected, actual);

    }
    @Test
    public void startCar2() {
        boolean actual = facade.stopCar();
        boolean expected = false;

        assertEquals(expected, actual);
    }
}