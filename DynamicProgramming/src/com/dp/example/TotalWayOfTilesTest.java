package com.dp.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalWayOfTilesTest {

    @Test
    public void test(){

        TotalWayOfTiles t = new TotalWayOfTiles();
        Assert.assertEquals(2,t.way(2));
        Assert.assertEquals(2,t.way1(2));

        Assert.assertEquals(3,t.way(3));
        Assert.assertEquals(3,t.way1(3));

    }
}