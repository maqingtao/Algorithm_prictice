package com.qingtao.haoweilai;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        char num[] = String.valueOf(n).toCharArray();
        System.out.println(num.length);
        StringBuffer stringBuffer = new StringBuffer();
        int maxLenth = 0;
        long sum=0;
        for (int i=0;i<num.length;i++)
        {
            sum=sum+(num[i]-'0');
        }
        if (sum % 3 != 0) {
            maxLenth = 0;
        } else {
            for (int i = 0; i < num.length-1; i++) {
                stringBuffer.append(num[i]);
                if (getSum(stringBuffer.toString())%3==0) {
                    maxLenth++;
                    stringBuffer.delete(0, stringBuffer.length());
                }
            }
        }
        System.out.println(maxLenth);
    }
    public  static long getSum(String s)
    {
        long sum=0;
        char num[]=s.toCharArray();
        for (int i=0;i<num.length-1;i++)
        {
            sum=sum+(num[i]-'0');
        }
        return sum;
    }
}
