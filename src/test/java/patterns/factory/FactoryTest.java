package patterns.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {
    private final Factory factory = new Factory();

    @Test
    public void getCar1() {
        String name = "US car";
        Car car = factory.getCar(name);
        String actual = car.getClass().getSimpleName();
        String expected = "USCar";

        assertEquals(expected, actual);

    }
    @Test
    public void getCar2() {
        String name = "RUS car";
        Car car = factory.getCar(name);
        String actual = car.getClass().getSimpleName();
        String expected = "RUSCar";

        assertEquals(expected, actual);
    }
    @Test
    public void getCar3() {
        String name = "EU car";
        Car car = factory.getCar(name);
        String actual = car.getClass().getSimpleName();
        String expected = "EUCar";

        assertEquals(expected, actual);
    }
    @Test
    public void getCar4() {
        String name = "Some car";
        Car car = factory.getCar(name);

        assertNull(car);
    }

    @Test
    public void getDoorsCount1(){
        int actual = factory.getDoorsCount(new EUCar());
        int expected = 3;

        assertEquals(expected, actual);
    }
    @Test
    public void getDoorsCount2(){
        int actual = factory.getDoorsCount(new RUSCar());
        int expected = 4;

        assertEquals(expected, actual);

    }@Test
    public void getDoorsCount3(){
        int actual = factory.getDoorsCount(new USCar());
        int expected = 5;

        assertEquals(expected, actual);
    }
}