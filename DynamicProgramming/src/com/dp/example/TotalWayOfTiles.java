package com.dp.example;

public class TotalWayOfTiles {

    public int way1(int N){

        if(N==0 )
            return 0;
        if(N==1)
            return 1;
        if(N==2)
            return 2;

        return way1(N-1)+way1(N-2);
    }

    public int way(int N){
        int W[] =new int[N+1];
        W[0]=0;
        W[1]=1;
        W[2]=2;

        for(int i=3;i<=N;i++){
            W[i] = W[i-1]+W[i-2];
        }
        return W[N];
    }

    //tiles is 1*2 only
    public int way3(int M,int N){

        int W[][] = new int [M+1][N+1];

        W[0][0]=0;
        for(int i=0;i<M;i++){
            W[i][0]=0;
        }

        for(int j=0;j<N;j++){
            W[0][j]=0;
        }
        W[1][2]=1;
        W[2][1]=1;
        W[3][1]=0;

        for(int i=1;i<M;i++)
        {
            for(int j=2;j<N;j++){

                W[i][j] = W[i-1][j]+1;
            }
        }

        return W[M][N];
    }
}
