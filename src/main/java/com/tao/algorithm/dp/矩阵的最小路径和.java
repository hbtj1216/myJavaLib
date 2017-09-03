package com.tao.algorithm.dp;

/**
 * Created by michael on 17-8-28.
 */

import java.util.Scanner;

/**
 * 题目描述:
 * 有一个矩阵map，它每个格子有一个权值。
 * 从左上角的格子开始每次只能向右或者向下走，最后到达右下角的位置，
 * 路径上所有的数字累加起来就是路径和.
 *
 * 要求：
 * 返回所有的路径中最小的路径和。
 *
 * 输入输出：
 * 给定一个矩阵map及它的行数n和列数m，请返回最小路径和。
 *
 * 测试用例：
 * 输入：
4 4
1 3 5 9
8 1 3 4
5 0 6 1
8 8 4 0
 *
 * 输出：
 * 12
 */
public class 矩阵的最小路径和 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int result = minPathSum1(array);
        System.out.println(result);

    }


    /**
     * 动态规划（未压缩空间）
     * @param array
     * @return
     */
    public static int minPathSum1(int[][] array) {

        if(array == null || array.length == 0 || array[0] == null || array[0].length == 0) {
            return 0;
        }

        //创建dp矩阵
        //dp矩阵的每个位置上的值表示从左上角到该位置的最小的路径和。
        int rows = array.length;        //行
        int cols = array[0].length;     //列
        int[][] dp = new int[rows][cols];
        dp[0][0] = 1;   //左上角

        //初始化第一列
        for(int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0] + array[i][0];
        }
        //初始化第一行
        for(int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j-1] + array[0][j];
        }

        //计算其他位置的值
        for(int i = 1; i < rows; i++) {
            for(int j = 1; j < cols; j++) {
                //(i,j)位置上的值等于它左边、上边中最小的值，加上当前位置上的array中的值
                dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + array[i][j];
            }
        }

        //dp中右下角的值即为结果值
        return dp[rows-1][cols-1];
    }

}















