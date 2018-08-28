package com.qingtao.qihu360;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int flower[] = new int[m];
        for (int i = 0; i < m; i++) {
            flower[i] = scanner.nextInt();
        }

        int q = scanner.nextInt();
        int question[][] = new int[q][2];
        for (int l = 0; l < q; l++) {
            for (int r = 0; r < 2; r++) {
                question[l][r] = scanner.nextInt();
            }
        }
        for (int s=0;s<q;s++)
        {
           System.out.println(getFlowerCount(flower,question[s][0],question[s][1]));
        }

    }
    public static int getFlowerCount(int flower[],int start,int end)
    {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int count=0;
        for (int i=start-1;i<end;i++)
        {
            if (!map.containsKey(flower[i]))
            {
                map.put(flower[i],flower[i]);
                count++;
            }
        }
        return count;
    }
}
