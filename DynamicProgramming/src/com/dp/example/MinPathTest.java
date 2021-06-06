package com.dp.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinPathTest {

    int P[][] ={{1,3,5,8},{4,2,1,7},{4,3,2,3}};

    @Test
    public void testMinPath(){

        MinPath m = new MinPath();
        Assert.assertEquals(7,m.mincost(P));
    }
}