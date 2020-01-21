package exercises.Technology.test;
import exercises.Technology.Laptop;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LaptopTest {

    Laptop test_Laptop;

    @Before
    public void createLaptopObject() {
        test_Laptop = new Laptop("Apple Pro", "Super Fast", 2021,15.5);
    }

    @Test
    public void testGetSize() {
      //  Laptop test_Laptop = new Laptop("Apple Pro", "Super Fast", 2021,15.5);
        assertEquals(15.5, test_Laptop.getSize(), .001);
    }

    @Test
    public void testGetBrand() {
        //  Laptop test_Laptop = new Laptop("Apple Pro", "Super Fast", 2021,15.5);
        assertEquals("Apple Pro", test_Laptop.getBrand());
    }

    @Test
    public void testGetSpeed() {
        //  Laptop test_Laptop = new Laptop("Apple Pro", "Super Fast", 2021,15.5);
        test_Laptop.connectToScreen();
        assertEquals("Super Fast", test_Laptop.getSpeed());
    }

}

