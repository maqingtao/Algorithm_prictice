//package com.qingtao.haoweilai;
//
//import java.util.Scanner;
//
//public class P5 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
//        String str[] = s.split("\s+");
//        int max = 0;
//        for (int i = 0; i < str.length; i++) {
//            int a = Integer.parseInt(str[i]);
//            StringBuffer stringBuffer = new StringBuffer();
//            stringBuffer.append(str[i]);
//            int temp = a;
//            for (int j = i + 1; j < str.length; i++) {
//                if (a <= Integer.parseInt(str[j])) {
//                    a = Integer.parseInt(str[j]);
//                    temp = temp + a;
//                    if (temp >= max) {
//                        max = temp;
//                    }
//                }
//            }
//        }
//        System.out.println(max);
//    }
//
//}
