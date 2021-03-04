package com.leetcode.array;

public class ArrayUtil {
    public static void printArray(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(array[i]);
        }
        System.out.println("数组：" + stringBuilder.toString());
    }
}
