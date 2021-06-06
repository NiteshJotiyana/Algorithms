package com.dp.example;

public class MaxSumSubArray {

    public int maxSum(int A[]) {

        if (A.length == 0)
            return 0;
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        int startIndex = 0;
        int endIndex = 0;
        int index = 0;

        for (int i = 0; i < A.length; i++) {

            curSum += A[i];

            if (curSum > maxSum) {
                maxSum = curSum;
                endIndex = i;
                startIndex = index;
            }
            if (curSum < 0) {
                curSum = 0;
                index = i + 1;

            }

        }

        System.out.println(startIndex + "-" + endIndex + " : " + maxSum);
        return maxSum;
    }

}
