package com.tao.algorithm.dp;

/**
 * Created by michael on 17-9-3.
 */

import java.util.Scanner;

/**
 * 输入：
 * 二维数组
3 3
-2 -3 3
-5 -10 1
0 30 -5
 *
 * 输出：
 * 初始血量至少为多少？
 */
public class 龙与地下城 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();    //行数
        int cols = sc.nextInt();    //列数

        //地图map
        int[][] map = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        //右下角
        int lastRow = rows-1;
        int lastCol = cols-1;

        //dp,dp[i][j]表示踏上map[i][j]位置之前应该有的最少血量
        int[][] dp = new int[rows][cols];
        dp[lastRow][lastCol] = map[lastRow][lastCol] >= 0 ? 1 : -map[lastRow][lastCol] + 1;

        //最下边的一行
        for(int j = lastCol-1; j >= 0; j--) {
            dp[lastRow][j] = Math.max(dp[lastRow][j+1] - map[lastRow][j], 1);
        }

        int right = 0;
        int down = 0;

        //从下往上，每一行从后往前
        for(int i = lastRow-1; i >= 0; i--) {
            //每一行的最后一个
            dp[i][lastCol] = Math.max(dp[i+1][lastCol] - map[i][lastCol], 1);
            //每一行剩余的，从后往前
            for(int j = lastCol-1; j >= 0; j--) {
                //如果向右走
                right = Math.max(dp[i][j+1] - map[i][j], 1);
                //如果向下走
                down = Math.max(dp[i+1][j] - map[i][j], 1);
                //取最小的
                dp[i][j] = Math.min(right, down);
            }
        }

        //整个dp矩阵计算完毕，那么dp[0][0]就是初始血量
        System.out.println("初始血量：" + dp[0][0]);
    }
}










