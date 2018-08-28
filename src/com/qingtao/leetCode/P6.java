//package com.qingtao.leetCode;
//
///**
// * @Author: maqingtao
// * @Description: LeetCode 6
// * @Date 2018/8/15
// */
//public class P6 {
//    public static void main(String[] args) {
//        System.out.print(convert("PAYPALISHIRING",3));
//    }
//
//    public static String convert(String s, int numRows) {
//      if (numRows==1) return s;
//      //首先得到循环的部分，找寻规律，依次将得到的字符存入
//       int circleNum=numRows*2-2;
//       StringBuffer stringBuffer=new StringBuffer();
//       for (int i=0;i<numRows;i++)
//       {
//         String SD="SDSD";
//        String []S=SD.split(",");
//        Integer.parseInt()
//           for (int j=0;j+i<s.length();j=j+circleNum)
//           {
//               stringBuffer.append(s.charAt(j+i));
//               if (i!=0&&i!=numRows-1&&j+circleNum-i<s.length())
//               {
//                   stringBuffer.append(s.charAt(j+circleNum-i));
//               }
//           }
//       }
//        return stringBuffer.toString();
//    }
//}
