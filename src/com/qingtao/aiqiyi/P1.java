package com.qingtao.aiqiyi;

import java.util.Scanner;

/**
* @Author: maqingtao
* @description: 对于任意两个正整数x和k, 我们定义repeat(x, k)为将x重复写k次形成的数, 例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 * 牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
 * 输入描述:
 * 输入包括一行,一行中有4个正整数x1, k1, x2, k2(1 ≤ x1,x2 ≤ 10^9, 1 ≤ k1,k2 ≤ 50),以空格分割
* @create: 2018/9/28
**/

public class P1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1=scanner.nextInt();
        int k1=scanner.nextInt();
        int x2=scanner.nextInt();
        int k2=scanner.nextInt();

        StringBuffer num_one=new StringBuffer();
        StringBuffer num_two=new StringBuffer();
        for (int i=0;i<k1;i++)
        {
            num_one.append(x1);
        }
        for (int i=0;i<k2;i++)
        {
            num_two.append(x2);
        }
       if (num_one.length()>num_two.length())
       {
         System.out.println("Greater");
       }
       if (num_one.length()<num_two.length())
       {
           System.out.println("Less");
       }
       else {
            boolean flag=true;
         for (int j=0;j<num_one.length();j++)
         {
             if (num_one.charAt(j)>num_two.charAt(j))
             {
                 System.out.println("Greater");
                 flag=false;
                 break;
             }
             if (num_one.charAt(j)<num_two.charAt(j))
             {
                 System.out.println("less");
                 flag=false;
                 break;
             }
         }
         if (flag)
         {
              System.out.println("Equal");
         }
       }

    }
}
