package com.learn.jdk.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author yuezp
 * @Date 2021/9/17 下午10:15
 * @Version v1.0
 */
public class RepeatNumber {


    //hash判断重复
    public int findRepeatNumber(int[] nums){

        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for(int num :nums){
            if (!set.add(num)){
                repeat = num;
                break;
            }

        }
        return repeat;
    }

    public int findRepeatNumber01(int[] nums){

        int i = 0;
        while (i < nums.length){
            if (nums[i] == i){
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i]){
                return nums[i];
            }
            int temp = nums[i];
            nums[i] = nums[nums[i]];
            nums[i] = temp;
        }
        return -1;
    }
}
