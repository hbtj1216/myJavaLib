package com.tao.algorithm;

/**
 * Created by michael on 17-8-13.
 */
public class 直接插入排序 {

    public static void main(String[] args) {

        int[] a = new int[] {49,38,65,97,76,13,27,49,78,34,12,64,5,4,
                62,99,98,54,56,17,18,23,34,15,35,25,53,51};

        System.out.println("排序前：");
        print(a);

        //直接插入排序
        insertSort(a);

        System.out.println("排序后：");
        print(a);
    }


    /**
     * 直接插入排序
     * @param array
     */
    public static void insertSort(int[] array) {

        int length = array.length;
        int temp, j;

        for(int i = 1; i < length; i++) {
            temp = array[i];
            for(j = i; j > 0 && temp < array[j-1]; j--) {
                array[j] = array[j-1];
            }
            array[j] = temp;
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
