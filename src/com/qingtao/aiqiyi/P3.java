package com.qingtao.aiqiyi;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long sum=1;
            for (int i = 1; i <= (n + 1) / 2; i++) {
                sum = sum + getResult(i, n);
            }
        System.out.print(sum);
    }
    public static long getResult(long k,long n)
    {
        long a=1;
        long tempA=n-k+1;
        for (int i=1;i<=k;i++)
        {
            a=a*tempA;
            tempA--;
        }
        long b=1;
        for (int i=1;i<=k;i++)
        {
            b=b*i;
        }
        return (a/b);
    }
}
