package com.dp.example;

public class TotalUniquePath {

    public int totalUniquePath(int x, int y, int block[][]) {

        if (x == 0 && y == 0)
            return 0;
        if (x == 0 || y == 0)
            return 1;

        int P[][] = new int[x + 1][y + 1];


        for (int i = 0; i < x + 1; i++) {
            P[i][0] = 1;
        }
        for (int j = 0; j < y + 1; j++) {
            P[0][j] = 1;

        }
        for (int i = 0; i < block.length; i++) {
            P[block[i][0]][block[i][1]] = -1;
        }
        P[0][0] = 0;

        //if road block at some point
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                int val = 0;

                if (P[i - 1][j] != -1)
                    val += P[i - 1][j];

                if (P[i][j - 1] != -1)
                    val += P[i][j - 1];
                if(P[i][j]!=-1)
                    P[i][j] = val;
            }
        }
    print(P);
        return P[x][y];

    }

    public void print(int M[][]){
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
