package com.mhh.leetcode.solutions;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Solution {

    public void hello(){
        System.out.println("hello world!");
    }


    /**
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {

        int len = height.length;
        int ans =0;
        int i=0,j=len-1;
        int minHeight = 0;
        int tmp=0;
        int minFlag = Integer.max(height[i],height[j]);
        boolean towardsRight = true;
        while(i<j){

            minHeight = Integer.min(height[i],height[j]);
            tmp = minHeight*(j-i);
            ans = ans > tmp ? ans :tmp;
            if(towardsRight){
                while(i<j&&height[i]<=minFlag){
                    i++;
                }
                minFlag = height[i];
                if(ans<minHeight*(j-i))
                    towardsRight = false;
            }else{
                while(i<j&&height[j]<=minFlag){
                    j--;
                }

                minFlag = height[j];
                if(ans<minHeight*(j-i))
                    towardsRight = true;
            }
        }

        return ans;
    }
}
