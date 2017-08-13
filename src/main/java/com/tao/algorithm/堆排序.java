package com.tao.algorithm;

/**
 * Created by Michael on 2017/8/13.
 */
public class 堆排序 {

    public static void main(String[] args) {

        int[] a = new int[] {49,38,65,97,76,13,27,49,78,34,12,64,5,4,
                62,99,98,54,56,17,18,23,34,15,35,25,53,51};

        //堆排序
        heapSort(a);

        for(int i : a) {
            System.out.print(i + " ");
        }

    }


    //堆排序
    public static void heapSort(int[] array) {

        int len = array.length;
        //循环建堆
        for(int i = 0; i < len; i++) {
            //建堆(堆顶是最大的元素)
            buildMaxHeap(array, len-1-i);
            //交换堆顶和最后一个元素
            swap(array, 0, len-1-i);
        }
    }



    //对数组从0到lastIndex位置上的元素建大顶堆
    public static void buildMaxHeap(int[] array, int lastIndex) {

        //从lastIndex处的节点的父节点开始
        for(int i = (lastIndex-1)/2; i >= 0; i--) {

            //保存正在判断的节点
            int k = i;
            //如果当前k节点的左子节点存在
            while(2*k+1 <= lastIndex) {

                //k节点的左子节点的索引为2*k+1
                int leftIndex = 2*k+1;
                //biggerIndex记录元素值较大的那个节点的索引
                int biggerIndex = leftIndex;
                //如果leftIndex小于lastIndex, 说明右子节点存在
                if(leftIndex < lastIndex) {
                    int rightIndex = leftIndex+1;
                    //如果右子节点的值较大
                    if(array[leftIndex] < array[rightIndex]) {
                        //biggerIndex指向左右子节点中较大的那个
                        biggerIndex = rightIndex;
                    }
                }

                //如果k节点的值小于biggerIndex节点的值,交换
                if(array[k] < array[biggerIndex]) {
                    swap(array, k, biggerIndex);
                    k = biggerIndex;
                } else {
                    break;
                }
            }
        }
    }


    //交换两个数
    public static void swap(int[] array, int i, int j) {

        int tmp;
        tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
