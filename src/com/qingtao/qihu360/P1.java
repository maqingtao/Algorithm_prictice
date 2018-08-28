package com.qingtao.qihu360;


import java.util.Arrays;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long location[][] = new long[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                location[i][j] = in.nextInt();
            }
        }
        long x[]=new long[n];
        long y[]=new long[n];
        for (int i=0;i<n;i++)
        {
             x[i]=location[i][0];
             y[i]=location[i][1];
        }
        Arrays.sort(x);
        Arrays.sort(y);
      long a=Math.max(x[n-1]-x[0],y[n-1]-y[0]);
      System.out.print(a*a);
    }

}
