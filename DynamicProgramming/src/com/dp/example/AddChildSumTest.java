package com.dp.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddChildSumTest{
    AddChildSum addChildSum;
    Node root;

    @Before
    public void setUp() throws Exception {
         addChildSum = new AddChildSum();

        Node n7 = new Node(null,null,7);
        Node n6 = new Node(null,null,6);
        Node n5 = new Node(null,null,5);
        Node n4 = new Node(null,null,4);
        Node n3 = new Node(n6,n7,3);
        Node n2 = new Node(n4,n5,2);
         root = new Node(n2,n3,1);

    }

    @Test
    public void testAddChildSum(){

        String result =addChildSum.leftOrderTraversal(root);
        Assert.assertEquals("1245367",result);
        addChildSum.addChildSum(root);
        String result2 =addChildSum.leftOrderTraversal(root);
        Assert.assertEquals("2811451667",result2);
    }


}