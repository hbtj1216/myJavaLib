package com.tao.algorithm;

import jdk.nashorn.internal.runtime.Context;

/**
 * Created by michael on 17-8-13.
 */
public class 归并排序 {

    public static void main(String[] args) {

        int[] a = new int[] {49,38,65,97,76,13,27,49,78,34,12,64,5,4,
                62,99,98,54,56,17,18,23,34,15,35,25,53,51};

        System.out.println("排序前：");
        print(a);

        //归并排序
        mergeSort(a, 0, a.length-1);

        System.out.println("排序后：");
        print(a);
    }


    /**
     * 归并排序
     * @param array
     * @param start
     * @param end
     */
    public static void mergeSort(int[] array, int start, int end) {

        if(start < end) {
            //找出中间位置
            int mid = (start+end)/2;
            //分别对左右进行归并排序
            mergeSort(array, start, mid);
            mergeSort(array, mid+1, end);
            //合并
            merge(array, start, mid, end);
        }
    }


    /**
     * 合并,合并的时候，左右两边是排好序的序列
     * @param array
     * @param start
     * @param mid
     * @param end
     */
    public static void merge(int[] array, int start, int mid, int end) {

        //暂存中间结果的数组
        int[] tempArray = new int[array.length];
        int pLeft = start;  //左边序列的游标
        int pRight = mid+1; //右边序列的游标
        int pTemp = start;  //临时数组的游标

        while(pLeft <= mid && pRight <= end) {
            //每次从两个序列中取出最小的放入临时数组
            if(array[pLeft] <= array[pRight]) {
                tempArray[pTemp++] = array[pLeft++];
            } else {
                tempArray[pTemp++] = array[pRight++];
            }
        }

        //剩余部分以此放入中间数组
        while(pLeft <= mid) {
            tempArray[pTemp++] = array[pLeft++];
        }
        while(pRight <= end) {
            tempArray[pTemp++] = array[pRight++];
        }

        //将临时数组的内容复制回原数组
        pTemp = start;
        while(pTemp <= end) {
            array[pTemp] = tempArray[pTemp++];
        }
    }



    /**
     * 打印函数
     * @param array
     */
    public static void print(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
