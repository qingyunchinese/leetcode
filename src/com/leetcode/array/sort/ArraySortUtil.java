package com.leetcode.array.sort;

public class ArraySortUtil {
    
    public static void bubbleSort(int[] array){
        if(array==null)return;
        for(int i=0;i<array.length;i++){
            boolean swap=false;
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    swap(array, j, j+1);
                    swap=true;
                }
            }
            if(!swap){
               return;
            }
        }
    }

    public static void swap(int[] array,int from,int to){
        int temp=array[from];
        array[from]=array[to];
        array[to]=temp;
    }
}
