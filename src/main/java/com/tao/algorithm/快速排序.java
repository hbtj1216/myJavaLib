package com.tao.algorithm;

/**
 * Created by michael on 17-8-13.
 */
public class 快速排序 {

    public static void main(String[] args) {

        int[] a = new int[] {49,38,65,97,76,13,27,49,78,34,12,64,5,4,
                62,99,98,54,56,17,18,23,34,15,35,25,53,51};

        System.out.println("排序前：");
        print(a);

        //冒泡排序
        quickSort(a, 0, a.length-1);

        System.out.println("排序后：");
        print(a);

    }


    /**
     * 快速排序
     * @param array
     * @param start
     * @param end
     */
    public static void quickSort(int[] array, int start, int end) {

        if(start < end) {
            //首先调用getMiddle一次，找到分割位置
            int mid = getMiddle(array, start, end);
            //递归对左右两边进行快排
            quickSort(array, start, mid-1);
            quickSort(array, mid+1, end);
        }
    }


    /**
     * 在范围内进行一次调整
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int getMiddle(int[] array, int start, int end) {

        //以范围内的第一个数作为参考量
        int flag = array[start];

        while(start < end) {

            while(start < end && array[end] >= flag) {
                end--;
            }
            array[start] = array[end];

            while(start < end && array[start] <= flag) {
                start++;
            }
            array[end] = array[start];
        }

        //start == end
        array[start] = flag;

        return start;
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


