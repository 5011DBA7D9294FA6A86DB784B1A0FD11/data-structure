package com.maxwit;

import com.maxwit.LinkedList.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTests {

    @Test
    public void test() {
        LinkedList<Integer> list = new LinkedList<>();
        Assert.assertTrue(list.isEmpty());

        int n = 5;
        for (int i = n; i > 0; i--) {
            list.add(i);
        }

        Integer N = n;
        for (Integer s : list) {
            Assert.assertEquals(s, N--);
        }

        Assert.assertTrue(N == 0);
        Assert.assertTrue(list.getSize() == 5);
        Assert.assertFalse(list.isEmpty());

        Assert.assertEquals((Integer) 5, list.get(0));
        list.set(0, 11);
        Assert.assertEquals((Integer) 11, list.get(0));

        list.insert(1, 22);
        Assert.assertEquals((Integer) 22, list.get(0));

        list.remove(0);
        Assert.assertEquals((Integer) 11, list.get(0));

        list.insert(1, 11);

        Assert.assertEquals(2, list.contains(11));
        list.removeAll(11);
        Assert.assertEquals((Integer) 4, list.get(0));
    }
}
