package com.dp.example;

public class TotalPathInMatrix {

    public int totalPath(int M,int N){

        if(M==0 && N==0)
            return 0;
        if(M==0||N==0)
            return 1;

        int P[][] = new int[M][N];

        for(int i=1;i<M;i++)
        {
            P[i][0]=1;
        }

        for(int j=1;j<N;j++)
        {
            P[0][j]=1;
        }

        for(int i=1;i<M;i++){

            for(int j=1;j<N;j++){
                P[i][j]=P[i-1][j]+P[i][j-1];
            }
        }

        return P[M-1][N-1];
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
