package com.dp.example;

public class LongestString {

    public static void main(String[] args) {
        new LongestString();
    }
    public LongestString()
    {
        System.out.println(longestString("421241"));
    }
    public int longestString( String s){

        if(s==null || s.isEmpty()){
            return 0;
        }
        int N = s.length();

        int SUM[][] = new int[N][N];

        //adding diagonal value
        for(int i=0;i<N;i++)
        {
            //to handle invalid char
            if(s.charAt(i)-'0' >9 || s.charAt(i)-'0'<0)
                return 0;

            SUM[i][i]=s.charAt(i)-'0';
        }

        int maxLength=0;

        for(int l=2;l<=N;l++){

            for(int i=0;i<N-l+1;i++){

                int j = i+l-1;
                int k = l/2;

                SUM[i][j] = SUM[i][j-k]+SUM[j-k+1][j];

                if(l%2==0 && SUM[i][j-k]==SUM[j-k+1][j] && l>maxLength)
                {
                    maxLength=l;
                }

            }

        }

        return maxLength;
    }



}
