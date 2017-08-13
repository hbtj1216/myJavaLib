package com.tao.algorithm;

/**
 * Created by michael on 17-8-13.
 */
public class 二分查找_非递归 {

    public static void main(String[] args) {

        int[] a = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14};




    }


    /**
     * 二分查找（非递归）
     * @param array
     * @param start
     * @param end
     * @param key
     * @return
     */
    public static int binSearch(int[] array, int start, int end, int key) {

        while(start <= end) {
            //计算中间位置
            int mid = (start+end)/2;
            //判断
            if(key == array[mid]) {
                return mid;
            } else if(key < array[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
