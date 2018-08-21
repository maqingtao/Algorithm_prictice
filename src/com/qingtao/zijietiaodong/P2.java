package com.qingtao.zijietiaodong;

import java.util.*;

public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() * 2;
        int time = in.nextInt();
        int num[] = new int[n];
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i = i + 2) {
            map.put(num[i], num[i + 1]);
        }

        List<Map.Entry<Integer, Integer>> mappingList = null;
        mappingList = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(mappingList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> mapping1, Map.Entry<Integer, Integer> mapping2) {
                return mapping1.getKey().compareTo(mapping2.getKey());
            }
        });
        Map<Integer, Integer> resultMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> mapping : mappingList) {
            resultMap.put(mapping.getKey(), mapping.getValue());
        }

        int lastTime=0;
        int countTime=0;
        int count=0;
        for (Map.Entry r : resultMap.entrySet()) {
            int a=Integer.parseInt(r.getKey().toString());
            int b=Integer.parseInt(r.getValue().toString());
            int sum=Math.abs(b-a);
            if (a>=lastTime&&countTime+sum<time)
            {
                count++;
                countTime=countTime+sum;
                lastTime=b;
            }
            else {
                countTime=0;
                lastTime=b;
            }
        }
        System.out.print(count);
    }
}
