package com.qingtao.tuyayidong;

import java.util.HashMap;
import java.util.Map;

public class P2 {
    public static int beauty_of_array(int[] array)
    {
      int sum=0;
        for (int i=0;i<array.length;i++)
        {
            int temp=array[i];
            sum=sum+array[i];
            for (int j=i+1;j<array.length;j++)
            {
                if (array[j]>=temp)
                {
                    sum=sum+getSum(i,j,array);
                    temp=array[j];
                }
                else {
                    break;
                }
            }
        }
        return sum;
    }
    //获得子序列美丽值
    public static int getSum(int start,int end,int array[])
    {
        //用hash存值
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for (int i=start;i<=end;i++)
        {

            if (!map.containsKey(array[i]))
            {
                sum=sum+array[i];
                map.put(array[i],array[i]);
            }
        }
        return sum;
    }
}
