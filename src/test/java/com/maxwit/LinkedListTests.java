package com.maxwit;

import com.maxwit.LinkedList.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTests {

    @Test
    public void test() {
        LinkedList<Integer> list = new LinkedList<>();

        int n = 5;
        for (int i = n; i > 0; i--) {
            list.insert(i);
        }

        Integer N = n;
        for (Integer s : list) {
            Assert.assertEquals(s, N--);
        }

        Assert.assertTrue(N == 0);
        Assert.assertTrue(list.getSize() == 5);
    }

}
