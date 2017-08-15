package com.tao;

/**
 * Created by Michael on 2017/8/15.
 */

/**
 * LeetCode 312.Burst Ballons （打气球）
 * 思路：动态规划
 */
public class LeetCode打气球 {

    public static void main(String[] args) {

        int[] score = new int[] {3, 1, 5, 8};

        int maxScore = maxScore(score);
        System.out.println(maxScore);
    }


    /**
     * 最大得分
     * @param score
     * @return
     */
    public static int maxScore(int[] score) {

        if(score == null || score.length == 0) {
            return 0;
        }

        //辅助数组
        int[] bb = new int[score.length+2];
        for(int i = 1; i <= bb.length-2; i++) {
            bb[i] = score[i-1];
        }

        //bb数组的第一个和最后一个位置上的数存1
        bb[0] = bb[bb.length-1] = 1;

        //设置dp数组
        int n = bb.length;
        int[][] dp = new int[n][n];

        //计算最大的分
        return helper(bb, dp, 0, n-1);
    }


    /**
     * 计算打掉(left, right)之间所有气球的最大的分,注意是开区间
     * @param bb
     * @param dp
     * @param left
     * @param right
     * @return
     */
    public static int helper(int[] bb, int[][] dp, int left, int right) {

        if(left+1 >= right) {
            return 0;
        }

        //如果已经计算过
        if(dp[left][right] != 0) {
            return dp[left][right];
        }

        int ret = 0;
        //left,right之间的气球
        for(int i = left+1; i < right; i++) {

            //之前的最大得分
            int last = ret;
            //当前情况left,i,right的最大的分
            int now = bb[left]*bb[i]*bb[right] + helper(bb, dp, left, i) + helper(bb, dp, i, right);
            //取最大的
            ret = Math.max(last, now);
        }

        //缓存起来
        dp[left][right] = ret;
        return ret;
    }
}
