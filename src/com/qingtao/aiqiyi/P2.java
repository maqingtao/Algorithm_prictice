package com.qingtao.aiqiyi;

import java.util.Arrays;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int box[]=new int[n];
        for (int index=0;index<n;index++)
        {
            box[index]=scanner.nextInt();
        }
        Arrays.sort(box);
       int count=0;
       for (int i=0;i<n;i++)
       {
           int temp=0;
           for (int j=0;j<n;j++)
           {
               if (box[i]==box[j])
               {
                   temp++;
               }

           }
           if (temp>count)
           {
               count=temp;
           }
       }
       System.out.println(count);
    }
}
