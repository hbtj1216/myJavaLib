package com.tao.algorithm;

/**
 * Created by michael on 17-8-13.
 */
public class 简单选择排序 {

    public static void main(String[] args) {

        int[] a = new int[] {49,38,65,97,76,13,27,49,78,34,12,64,5,4,
                62,99,98,54,56,17,18,23,34,15,35,25,53,51};

        System.out.println("排序前：");
        print(a);

        //冒泡排序
        selectSort(a);

        System.out.println("排序后：");
        print(a);
    }


    /**
     * 简单选择排序
     * @param array
     */
    public static void selectSort(int[] array) {

        int length = array.length;
        int temp, minIndex;

        for(int i = 0; i < length; i++) {
            minIndex = i;
            for(int j = i+1; j < length; j++) {
                if(array[j] < array[minIndex]) {
                    //找到最小值的索引
                    minIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
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
