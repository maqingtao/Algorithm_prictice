package com.qingtao.zijietiaodong;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }
        StringBuffer stringBuffer=new StringBuffer();
        Set<String> set=new HashSet<>();
        for (int i=0;i<n;i++)
        {
            String num[]=str[i].split(";");
            for (int j=0;j<num.length;j++){
                 String a[]=num[j].split(",");
                 set.add(a[0]);
                 set.add(a[1]);
            }
            stringBuffer.append(set.toArray()[0]+","+set.toArray()[set.size()-1]);
        }
    }
}
