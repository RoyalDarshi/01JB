package com.structure.data;

import java.util.Arrays;

public class MergeSort01 {
    public static void sort(int[] arr) {
        mainSort(arr, 0, arr.length);
    }

    public static void mainSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = (end + start) / 2;
        mainSort(arr, start, mid);
        mainSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] merge = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                merge[k] = arr[i];
                i++;
            } else {
                merge[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            merge[k] = arr[i];
            k++;
            i++;
        }
        while (j < end) {
            merge[k] = arr[j];
            k++;
            j++;
        }
        for (int l = 0; l < merge.length; l++) {
            arr[start + l] = merge[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 3, 1, 6, 5 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
