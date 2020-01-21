package exercises.Technology.test;

import exercises.Technology.Computer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ComputerTest {


    Computer test_Computer;
    @Before
    public void createComputerObject() {
        test_Computer = new Computer("Apple","Fast",2020 );
    }


    @Test
    public void testGetSpeed() {
        assertEquals("Fast", test_Computer.getSpeed());
    }

    @Test
    public void testGetBrand() {
        assertEquals("Apple", test_Computer.getBrand());
    }

    @Test
    public void testGetYear() {
        assertEquals(2020, test_Computer.getYear());
    }
}