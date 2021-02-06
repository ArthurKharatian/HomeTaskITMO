package patterns.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildTest {
     private final Build build = new Build();
    @Test
    public void buildHouse() {
        House actualHouse =  build.buildHouse();
        House expectedHouse = new House();

        String actual = actualHouse.getClass().getSimpleName();
        String expected = expectedHouse.getClass().getSimpleName();

        assertEquals(expected, actual);
    }
}