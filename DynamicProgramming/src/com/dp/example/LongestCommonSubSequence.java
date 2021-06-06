package com.dp.example;

public class LongestCommonSubSequence {

	static int LCS[][];

	public static void main(String[] args) {

		String S1 = "ABCD";
		String S2 = "BXDC";

		LCS = new int[S1.length() + 1][S2.length() + 1];
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				LCS[i][j] = 0;
			}
		}

		System.out.println(LCS(S1, S1.length(), S2, S2.length()));
		printLCS(S1.toCharArray(), S1.length(), S2.toCharArray(), S2.length());
		// print(S1.toCharArray(),S2.toCharArray(),0,0);
	}

	public static void printLCS(char X[], int n, char Y[], int m) {

		int index = LCS[0][0];
		char lcs[] = new char[index];

		for (int j = 0, i = 0; j < m && i < n;) {
			System.out.println(X[i]+" " + Y[j]);
			if (X[i] == Y[j]) {
				lcs[LCS[i][j] - 1] = X[i];

				i++;
				j++;

			} else if (LCS[i + 1][j] < LCS[i][j + 1]) {
				j++;
			} else
				i++;

		}
		for (char c : lcs) {
			System.out.print(c + " ");
		}
	}

	public static void print(char X[], char Y[], int i, int j) {
		if (i >= X.length || j >= Y.length) {
			return;
		}

		if (X[i] == Y[j]) {
			System.out.print(X[i] + " ");
		}

		if (LCS[i + 1][j] > LCS[i][j + 1])
			j++;
		else
			i++;

		print(X, Y, i, j);
	}

	public static int LCS(String S1, int n, String S2, int m) {

		char X[] = S1.toCharArray();
		char Y[] = S2.toCharArray();

		for (int i = n - 1; i >= 0; i--) {

			for (int j = m - 1; j >= 0; j--) {
				LCS[i][j] = LCS[i + 1][j + 1];

				if (X[i] == Y[j]) {
					LCS[i][j]++;
				}

				if (LCS[i + 1][j] > LCS[i][j])
					LCS[i][j] = LCS[i + 1][j];

				if (LCS[i][j + 1] > LCS[i][j])
					LCS[i][j] = LCS[i][j + 1];
			}
		}

		return LCS[0][0];
	}
}
