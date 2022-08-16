package com.learn.jdk.algorithm;

/**
 * @Author yuezp
 * @Date 2021/9/17 下午9:30
 * @Version v1.0
 */
public class Fib {

    //记忆化搜索
    public int fib(int n){

        int[] memo = new int[n + 1];
        return (int) dfs(n, memo);
    }

    public int dfs(int n, int[] memo){

        if(n <= 1){
            return n;
        }
        if(memo[n] !=0 ){
            return memo[0];
        }
        return dfs(n - 1, memo) + dfs(n - 2, memo);

    }

    //动态规划
    public int fib1(int n){

        if(n <= 1){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }



}


