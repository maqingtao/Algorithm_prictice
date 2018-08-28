package com.qingtao.qihu360;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            B[j] = scanner.nextInt();
        }
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for (int i=0;i<n;i++)
        {
            map.put(B[i],i);
        }
        StringBuffer stringBuffer=new StringBuffer();
        for (int p=0;p<n;p++)
        {
            for (int q=p+1;q<n;q++)
            {

            }
        }
    }
}
