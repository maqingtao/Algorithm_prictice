package com.qingtao.tuyayidong;


public class P1 {
    public static void main(String[] args) {
         System.out.println(number_of_cards(3.71f));
    }
 public  static int number_of_cards(float length)
 {
     if (length<=0)
     {
         return 0;
     }
     int count=1;
     float tempNum=0;
          while (tempNum<=length)
          {
              count++;
              tempNum=tempNum+(1.0f/count*1.0f);
          }
     return count-1;
 }
}
