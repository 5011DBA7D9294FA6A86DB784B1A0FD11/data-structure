package com.maxwit;

import org.junit.Assert;
import org.junit.Test;

public class ListTests {

    @Test
    public void listTest() {
        List<Integer> list = new List<>();
        Assert.assertTrue(list.isEmpty());
        list.insert(1, 11);
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals((Integer) 11, list.get(0));
        list.set(0, 22);
        Assert.assertEquals((Integer) 22, list.get(0));
        list.remove(0);
        Assert.assertTrue(list.isEmpty());
        list.insert(1, 33);
        list.insert(2, 33);
        Assert.assertEquals(2, list.contains(33));
        list.removeAll(33);
        Assert.assertTrue(list.isEmpty());
    }
}
