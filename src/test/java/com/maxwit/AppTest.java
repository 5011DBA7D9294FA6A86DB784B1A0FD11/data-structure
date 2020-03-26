package com.maxwit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void SequentialListTest() {
        List<Integer> list = new List<>();

        int size = 5;
        for (int i = 0; i < size; i++) {
            list.insert(i);
        }

        Integer num = 0;
        for (Integer s : list) {
            Assert.assertEquals(s, num++);
        }

        Assert.assertTrue(num==5);
    }
}
