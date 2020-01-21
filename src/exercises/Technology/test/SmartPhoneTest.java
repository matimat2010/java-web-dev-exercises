package exercises.Technology.test;

import exercises.Technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SmartPhoneTest {

    SmartPhone test_SmartPhone;
    @Before
    public void createSmartPhoneObject() {
        test_SmartPhone = new SmartPhone("Iphone", "Even Faster", 2022, "10x");

    }


    @Test
    public void testGetBrand() {
        assertEquals("Iphone", test_SmartPhone.getBrand());
    }

    @Test
    public void testGetSpeed() {
        assertEquals("Even Faster", test_SmartPhone.getSpeed());
    }

    @Test
    public void testGetYear() {
        assertEquals(2022, test_SmartPhone.getYear());
    }
}