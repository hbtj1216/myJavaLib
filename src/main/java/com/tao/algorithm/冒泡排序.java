package com.tao.algorithm;

/**
 * Created by michael on 17-8-13.
 */
public class 冒泡排序 {

    public static void main(String[] args) {

        int[] a = new int[] {49,38,65,97,76,13,27,49,78,34,12,64,5,4,
                62,99,98,54,56,17,18,23,34,15,35,25,53,51};

        System.out.println("排序前：");
        print(a);

        //冒泡排序
        bubbleSort(a);

        System.out.println("排序后：");
        print(a);

    }


    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int[] array) {

        int temp;
        int length = array.length;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
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
