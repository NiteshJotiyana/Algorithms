package com.dp.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDistanceTest  {

    @Test
    public void test(){
        String s1 = "CAT";
        String s2 = "CAR";

        MinDistance M = new MinDistance();
        Assert.assertEquals(1,M.minDistance(s1,s2));
    }



    @Test
    public void test2(){
        String s2 = "SUNDAY";
        String s1 = "SATURDAY";

        MinDistance M = new MinDistance();
        Assert.assertEquals(3,M.minDistance(s1,s2));
    }

    @Test
    public void test3(){
        String s1 = "";
        String s2 = "CAR";

        MinDistance M = new MinDistance();
        Assert.assertEquals(3,M.minDistance(s1,s2));
    }

    @Test
    public void test4(){
        String s1 = "CAT";
        String s2 = "";

        MinDistance M = new MinDistance();
        Assert.assertEquals(3,M.minDistance(s1,s2));
    }

    @Test
    public void test5(){
        String s1 = "CAT";
        String s2 = null;

        MinDistance M = new MinDistance();
        Assert.assertEquals(3,M.minDistance(s1,s2));
    }

    @Test
    public void test6(){
        String s1 = null;
        String s2 = "CAT";

        MinDistance M = new MinDistance();
        Assert.assertEquals(3,M.minDistance(s1,s2));
    }
}