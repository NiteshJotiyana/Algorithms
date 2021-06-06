package com.dp.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalUniquePathTest {

    @Test
    public void test1(){
        TotalUniquePath T = new TotalUniquePath();
        int x=3;
        int y=3;
        int block[][]={{2,2}};

        Assert.assertEquals(8,T.totalUniquePath(x,y,block));

    }
}