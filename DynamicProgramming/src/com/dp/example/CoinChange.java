package com.dp.example;

public class CoinChange {

	static int T[];
	static int P[];

	public static void main(String[] args) {

		int C[] = { 1, 3, 5 };
		int N = 8;
		
		T = new int[N+1];
		P = new int[N+1];
		for(int i=0;i<=N;i++)
		{
			T[i]=-1;
			P[i]=-1;
		}
		minCoin(N, C);
		printMinCoinChange(N);

	}

	public static void printMinCoinChange(int N) {
		if (N <= 0)
			return;
		System.out.println(P[N]);

		N = N - P[N];
		printMinCoinChange(N);

	}

	public static int minCoin(int N, int C[]) {
		if (N == 0)
			return 0;
		if (N < 0)
			return -1;

		if (T[N] != -1) {
			return T[N];
		}
		int min = Integer.MAX_VALUE;
		int firstCoin = -1;

		for (int i = 0; i < C.length; i++) {
			int ans = minCoin(N - C[i], C);
			if (ans >=0 && ans < min) {
				min = ans;
				firstCoin = C[i];
			}
		}

		T[N] = min + 1;
		P[N] = firstCoin;

		return T[N];
	}
}
