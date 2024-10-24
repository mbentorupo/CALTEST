package es.upo.cal.P1_EPD4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerTest {

    @Test
    public void testParseInt() {
        String validNumber = "123";
        int expected = 123;
        int result = Integer.parseInt(validNumber);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testCompare() {
        int a = 10;
        int b = 20;
        int result = Integer.compare(a, b);
        Assert.assertTrue(result < 0);  // porque a < b
    }
}

