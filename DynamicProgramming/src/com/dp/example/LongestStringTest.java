package com.dp.example;

import org.junit.Assert;

import static org.junit.Assert.*;

public class LongestStringTest {

    LongestString longestString;
    @org.junit.Before
    public void setUp() throws Exception {
        longestString = new LongestString();
    }

    @org.junit.Test
    public void longestStringPositive1() {
        String s = "421241";
        int result = longestString.longestString(s);

        Assert.assertEquals(6,result);
    }
    @org.junit.Test
    public void longestStringPositive2() {
        String s = "943071";
        int result = longestString.longestString(s);

        Assert.assertEquals(4,result);
    }

    @org.junit.Test
    public void longestStringWithNull() {
        String s = null;
        int result = longestString.longestString(s);

        Assert.assertEquals(0,result);
    }

    @org.junit.Test
    public void longestStringWithEmpty() {
        String s = "";
        int result = longestString.longestString(s);

        Assert.assertEquals(0,result);
    }

    @org.junit.Test
    public void longestStringWithInvalidChar() {
        String s = "421e241";
        int result = longestString.longestString(s);

        Assert.assertEquals(0,result);
    }

    @org.junit.Test
    public void isSumEqual() {
    }
}