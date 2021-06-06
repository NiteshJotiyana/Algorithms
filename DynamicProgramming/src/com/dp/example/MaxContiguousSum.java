package com.dp.example;

public class MaxContiguousSum {

	public static void main(String[] args) {
		int A[] = { 10, -4, 4, -2, -1, 6, -9, 4 };
		maxSum(A);
	}

	public static int maxSum(int A[]) {
		int N = A.length;

		int max = 0;
		int sum = A[0];
		int start = 0;
		int end = 0;
		int temp = 0;

		for (int i = 1; i < N; i++) {
			sum += A[i];
			if (sum < 0) {
				sum = 0;
				temp = i + 1;

			} else if (sum > max) {
				max = sum;
				end = i;
				start = temp;
			}
		}
		System.out.println("Max : " + max);
		System.out.println("Start : " + start);
		System.out.println("End : " + end);
		return temp;
	}
}
