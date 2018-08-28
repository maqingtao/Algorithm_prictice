package com.qingtao;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String timeStr=in.nextLine();
        String []timers=timeStr.split("\\s+");
        boolean flag=true;
        for(int i=0;i<timers.length;i++)
        {
            String []tempA=timers[i].split(",");
            for(int j=i+1;j<timers.length;j++)
            {
                String []tempB=timers[j].split(",");
                if((Integer.parseInt(tempA[0])>=Integer.parseInt(tempB[0]))&&(Integer.parseInt(tempA[0])<=Integer.parseInt(tempB[1])))
                {
                    flag=false;
                }
                if((Integer.parseInt(tempA[1])>=Integer.parseInt(tempB[0]))&&(Integer.parseInt(tempA[1])<=Integer.parseInt(tempB[1])))
                {
                    flag=false;
                }
            }
        }
        if(flag)
        {
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}