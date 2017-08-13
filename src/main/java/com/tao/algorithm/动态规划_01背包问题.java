package com.tao.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michael on 2017/8/11.
 */
public class 动态规划_01背包问题 {

    //程序支持的最大金矿数量
    private static final int max_n = 100;
    //程序支持的最多人数
    private static final int max_people = 10000;

    //输入数据部分
    //总人数
    private static int peopleTotal;
    //总的金矿数
    private static int n;
    //每座金矿需要的人数, 金矿标号为0,1,2, ... ,n-1
    private static int[] peopleNeed = new int[max_n];
    //每座金矿能够挖出的金子数
    private static int[] gold = new int[max_n];
    //i个人挖前j个金矿能够得到的最大金子数
    private static int[][] maxGold = new int[max_people][max_n];

    //存储被挖的金矿的序号
    private static List<Integer> list = new ArrayList<Integer>();



    //初始化,输入测试数据
    public static void init() {

        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()) {
            //总人数
            peopleTotal = sc.nextInt();
        }
        if(sc.hasNext()) {
            //总矿数
            n = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(sc.hasNext()) {
                peopleNeed[i] = sc.nextInt();
            }
            if(sc.hasNext()) {
                gold[i] = sc.nextInt();
            }
        }

        for(int i = 0; i < max_people; i++) {
            for(int j = 0; j < max_n; j++) {
                maxGold[i][j] = -1;
            }
        }

        System.out.println("peopleTotal: " + peopleTotal);
        System.out.println("n: " + n);
        System.out.println("peopleNeed: ");
        for(int i = 0; i < n; i++) {
            System.out.print(peopleNeed[i] + " ");
        }
        System.out.println("gold: ");
        for(int i = 0; i < n; i++) {
            System.out.print(gold[i] + " ");
        }
        System.out.println("maxGold: " + maxGold);


    }


    //计算当前仅有people个人的时候，能够从0, 1, ..., mineNum号金矿挖到的最大金子数
    public static int getMaxGold(int people, int mineNum) {

        //最大金子数
        int retMaxGold;

        //如果这个问题曾经计算过
        if(maxGold[people][mineNum] != -1) {
            //获取曾经计算过的值
            retMaxGold = maxGold[people][mineNum];
        }
        else if(mineNum == 0) {
            //只剩0号矿
            if(people >= peopleNeed[mineNum]) {
                //人数足够
                retMaxGold = gold[mineNum];
            }
            else {
                //人数不够
                retMaxGold = 0;
            }
        }
        else {
            //mineNum != 0

            //使用动态规划方法
            //如果人数足够，考虑挖和不挖两种情况
            if(people >= peopleNeed[mineNum]) {

                int wa = gold[mineNum] + getMaxGold(people - peopleNeed[mineNum], mineNum - 1);
                int buwa = getMaxGold(people, mineNum-1);
                //取最大值
                retMaxGold = Math.max(wa, buwa);

                /*if(retMaxGold == wa) {
                    list.add(mineNum);
                }*/

            }
            else {
                //人数不够
                retMaxGold = getMaxGold(people, mineNum-1);
            }



        }

        //做备忘
        maxGold[people][mineNum] = retMaxGold;

        return retMaxGold;
    }




    public static void main(String[] args) {


        init();

        int maxGold = getMaxGold(peopleTotal, n-1);
        System.out.println("最大收益： " + maxGold);
        /*System.out.println("被挖的矿山的序号：" + list);
        for(int i = 0; i <= peopleTotal; i++) {
            for(int j = 0; j <= n; j++) {
                if(动态规划_01背包问题.maxGold[i][j] != -1) {
                    System.out.println(i + "," + j + ": " + 动态规划_01背包问题.maxGold[i][j]);
                }

            }

        }*/
    }



}
