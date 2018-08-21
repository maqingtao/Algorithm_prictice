package com.qingtao.zijietiaodong;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Set setA = new HashSet();
            Set setB = new HashSet();
            int a1[] = new int[n];
            int b1[] = new int[n];
            for (int i = 0; i < n; i++) {
                a1[i] = scanner.nextInt();
                setA.add(a1[i]);
            }
            for (int i = 0; i < n; i++) {
                b1[i] = scanner.nextInt();
                setB.add(b1[i]);
            }
            int s = 0;
            for (int i = 0; i < setA.size(); i++) {
                for (int j = i; j < setA.size(); j++) {
                    for (int p = 0; p < setB.size(); p++) {
                        for (int q = p; q < setB.size(); q++) {
                            if (Math.max(Integer.parseInt(setA.toArray()[i].toString()), Integer.parseInt(setA.toArray()[j].toString()))
                                    < Math.min(Integer.parseInt(setB.toArray()[p].toString()), Integer.parseInt(setB.toArray()[q].toString()))) {
                                s++;
                            }
                        }
                    }
                }
            }
            System.out.println(s);
        }
    }
}
