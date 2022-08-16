package com.learn.jdk.algorithm;

/**
 * @Author yuezp
 * @Date 2021/9/18 下午11:45
 * @Version v1.0
 */
public class CuttingRope {

    //贪心算法
    public int cuttingRope(int n) {
        if(n < 4){
            return n - 1;
        }
        int res = 1;
        while(n > 4){
            res *= 3;
            n -= 3;
        }
        return res * n;
    }

    //动态规划
    public int cuttingRope01(int n) {

        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            for (int j = 2; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }


}
