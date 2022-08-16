package com.learn.jdk.algorithm;

/**
 * @Author yuezp
 * @Date 2021/9/18 下午4:08
 * @Version v1.0
 */
public class NumWays {

    //动态规划
//            | 1, (n=0)
//    f(n) =  | 1, (n=1)
//            | f(n-1)+f(n-2)  (n>1,n为整数)
    public int NumWays(int n){
        if (n < 2){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    public int climbStairs(int n) {
        if(n <= 2) return n;
        // 状态压缩 当然要是输出n之前所有的方式 那就用数组记录就好
        // 一维动归
        int pre2 = 1, pre1 = 2, cur = 1;
        for(int i = 2 ; i < n ; ++i){
            cur = pre1 + pre2;
            pre2 = pre1;
            pre1 = cur;
        }
        return cur;
    }
}
