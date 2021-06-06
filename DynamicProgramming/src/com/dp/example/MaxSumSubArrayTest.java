package com.dp.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumSubArrayTest {

    MaxSumSubArray M = new MaxSumSubArray();

    @Test
    public void test() {
        int A[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        Assert.assertEquals(7, M.maxSum(A));
    }

    @Test
    public void test2() {
        int A[] = {-2, -3, -4, -1, -2};

        Assert.assertEquals(-1, M.maxSum(A));
    }

    @Test
    public void test3() {
        int A[] = {};

        Assert.assertEquals(0, M.maxSum(A));
    }

    @Test
    public void test4() {
        int A[] = {-1};

        Assert.assertEquals(-1, M.maxSum(A));
    }

}