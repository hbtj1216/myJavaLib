package com.tao.algorithm;

/**
 * Created by michael on 17-8-13.
 */
public class 二分查找_递归 {

    public static void main(String[] args) {

        int[] a = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        for(int i = 0; i < a.length; i++) {
            int index = binSearch(a, 0, a.length-1, a[i]);
            System.out.println(index);
        }
    }


    /**
     * 二分查找（递归）
     * @param array
     * @param start
     * @param end
     * @param key
     * @return
     */
    public static int binSearch(int[] array, int start, int end, int key) {

        if(start <= end) {
            int mid = (start+end)/2;
            if(key == array[mid]){
                return mid;
            } else if(key < array[mid]) {
                return binSearch(array, start, mid-1, key);
            } else {
                return binSearch(array, mid+1, end, key);
            }
        } else {
            return -1;
        }
    }
}
