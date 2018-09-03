package com.qingtao.haoweilai;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while (n!=0)
        {
            long y=0;
            long x=scanner.nextLong();
            long k=scanner.nextLong();
          while (k!=0)
          {
              if (add(x,y)==(x|y))
              {
                  k--;
              }
              y++;
          }
          n--;
          System.out.println(y);
        }


    }
    public static long add(long a,long b) {
        long res=0;
        long xor=a^b;//得到原位和
        long forworad=(a&b)<<1;//得到进位和

        if(forworad!=0) {
            res=add(xor,forworad);//若进位和不为0，则递归求原位和+进位和
        }else {
            res=xor;
        }
        return res;

    }
}
