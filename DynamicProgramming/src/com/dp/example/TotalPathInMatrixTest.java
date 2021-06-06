package com.dp.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalPathInMatrixTest {

    @Test
    public void test(){
        TotalPathInMatrix T = new TotalPathInMatrix();
        Assert.assertEquals(6,T.totalPath(3,3));


    }

        @Test
    public void test2(){
        TotalPathInMatrix T = new TotalPathInMatrix();
        Assert.assertEquals(10,T.totalPath(3,4));
    }

    @Test
    public void test3(){
        TotalPathInMatrix T = new TotalPathInMatrix();
        Assert.assertEquals(0,T.totalPath(0,0));
    }

    @Test
    public void test4(){
        TotalPathInMatrix T = new TotalPathInMatrix();
        Assert.assertEquals(1,T.totalPath(0,3));
    }
    @Test
    public void test5(){
        TotalPathInMatrix T = new TotalPathInMatrix();
        Assert.assertEquals(2,T.totalPath(2,2));


    }


}