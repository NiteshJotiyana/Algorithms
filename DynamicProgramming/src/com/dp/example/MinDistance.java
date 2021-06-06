package com.dp.example;

public class MinDistance {

    public int minDistance(String S1, String S2) {

        if ((S1 == null || S1.isEmpty()) && (S2 == null || S2.isEmpty()))
            return 0;

        if (S1 == null || S1.isEmpty())
            return S2.length();


        if (S2 == null || S2.isEmpty())
            return S1.length();

        int x = S1.length();
        int y = S2.length();

        int M[][] = new int[x + 1][y + 1];

        //row
        for (int i = 0; i <= y; i++)
            M[0][i] = i;

        //column
        for (int i = 0; i <= x; i++)
            M[i][0] = i;

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= y; j++) {

                if (S1.charAt(i-1) == S2.charAt(j-1)) {
                    M[i][j] = M[i-1][j-1];
                } else {
                    M[i][j] = min(M[i - 1][j - 1], M[i - 1][j], M[i][j - 1]) + 1;
                }

            }
        }

        print(M);

        return M[x][y];

    }

    public void print(int M[][]){
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public int min(int a, int b, int c) {

        return Math.min(Math.min(a, b), c);
    }


}
