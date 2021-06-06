package com.dp.example;

public class MinPath {

    public int mincost(int P[][]){

        int M = P.length;
        int N = P[0].length;

        System.out.println(M +" X "+N);
        for(int i=1;i<M;i++)
        {
            P[i][0]=P[i-1][0]+P[i][0];
        }

        for(int j=1;j<N;j++){
            P[0][j]=P[0][j-1]+P[0][j];
        }

        for(int i=1;i<M;i++)
        {

            for(int j=1;j<N;j++){
                P[i][j] = Math.min(P[i-1][j-1],Math.min(P[i-1][j],P[i][j-1]))+P[i][j];
            }
        }
        return P[M-1][N-1];

    }

}
